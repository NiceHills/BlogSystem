package com.duan.blogos;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created on 2017/11/14.
 *
 * @author hitwh2200400513
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml", "classpath:applicationContext.xml"})
public abstract class BaseTest {
}
