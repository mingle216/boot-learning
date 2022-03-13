package com.mingle.boot;

import com.mingle.web.pojo.SimpleBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuickstartApplicationTest {
    @Autowired
    private SimpleBean simpleBean;

    @Test
    public void contextLoad(){
        System.out.println(simpleBean);
    }
}