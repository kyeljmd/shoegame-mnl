package com.brightworks.sg.ims;

import com.brightworks.sg.ims.mapper.OrikaBeanMapper;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ComponentScan(basePackageClasses = {OrikaBeanMapper.class})
public class ShoegameApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(ShoegameCoreApplication.class, args);
    }
}
