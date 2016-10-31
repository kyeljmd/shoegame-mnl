package com.brightworks.sg.ims.security.service;

import com.brightworks.sg.ims.ShoegameApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static org.junit.Assert.assertTrue;

/**
 * Created by kyel on 10/31/2016.
 */

@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShoegameApplicationTests.class)
public class PasswordEncoderImplTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void checkIfPasswordEncodedResultIsTheSame(){
        String rawPassword = "123qwe";
        String encodedPassword = passwordEncoder.encode(rawPassword);
        boolean matches = passwordEncoder.matches(rawPassword,encodedPassword);
        assertTrue(matches);
    }
}
