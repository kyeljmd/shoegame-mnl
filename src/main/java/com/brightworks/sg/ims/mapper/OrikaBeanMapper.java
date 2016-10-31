package com.brightworks.sg.ims.mapper;

import com.brightworks.sg.ims.dto.*;
import com.brightworks.sg.ims.entities.Brand;
import com.brightworks.sg.ims.entities.model.FootWear;
import com.brightworks.sg.ims.entities.model.Image;
import com.brightworks.sg.ims.entities.model.Variant;
import com.brightworks.sg.ims.entities.model.user.Role;
import com.brightworks.sg.ims.entities.model.user.User;
import com.brightworks.sg.ims.mapper.impl.UserMapper;
import ma.glasnost.orika.Converter;
import ma.glasnost.orika.Mapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import ma.glasnost.orika.metadata.ClassMapBuilder;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Orika mapper exposed as a Spring Bean. It contains the configuration for the mapper factory and factory builder. It will scan
 * the Spring application context searching for mappers and converters to register them into the factory. To use it we just need
 * to autowire it into our class.
 *
 * @author dlizarra
 */
@Component
public class OrikaBeanMapper extends ConfigurableMapper implements ApplicationContextAware {

    private MapperFactory factory;

    private ApplicationContext applicationContext;

    @Autowired
    private UserMapper userMapper;

    public OrikaBeanMapper() {
        super(false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void configure(MapperFactory factory) {
        this.factory = factory;
        addAllSpringBeans(applicationContext);
        factory.classMap(FootWear.class,FootWearDTO.class).byDefault().register();
        factory.classMap(Brand.class, BrandDTO.class).byDefault().register();
        factory.classMap(Variant.class, VariantDTO.class).byDefault().register();
        factory.classMap(Image.class, ImageDTO.class).byDefault().register();
        factory.classMap(Role.class, RoleDTO.class).byDefault().register();
        factory.classMap(User.class, UserDTO.class).customize(userMapper).byDefault().register();
    }

    /**
     * Constructs and registers a {@link ClassMapBuilder} into the {@link MapperFactory} using a {@link Mapper}.
     *
     * @param mapper
     */
    @SuppressWarnings("rawtypes")
    public void addMapper(Mapper<?, ?> mapper) {
        factory.classMap(mapper.getAType(), mapper.getBType())
                .byDefault()
                .customize((Mapper) mapper)
                .register();
    }

    /**
     * Registers a {@link Converter} into the {@link ConverterFactory}.
     *
     * @param converter
     */
    public void addConverter(Converter<?, ?> converter) {
        factory.getConverterFactory().registerConverter(converter);
    }

    /**
     * Scans the appliaction context and registers all Mappers and Converters found in it.
     *
     * @param applicationContext
     */
    @SuppressWarnings("rawtypes")
    private void addAllSpringBeans(final ApplicationContext applicationContext) {
        Map<String, Mapper> mappers = applicationContext.getBeansOfType(Mapper.class);
        for (Mapper mapper : mappers.values()) {
            addMapper(mapper);
        }
        Map<String, Converter> converters = applicationContext.getBeansOfType(Converter.class);
        for (Converter converter : converters.values()) {
            addConverter(converter);
        }
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        init();
    }

}