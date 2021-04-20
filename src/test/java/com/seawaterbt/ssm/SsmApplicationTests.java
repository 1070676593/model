package com.seawaterbt.ssm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsmApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("主分支");
        System.out.println("主分支提交。。。。");
        System.out.println("主分支再次提交。。。");
        System.out.println("主分支提交，分支1和分支2已经提交");
    }

}
