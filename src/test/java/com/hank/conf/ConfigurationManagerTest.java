package com.hank.conf;

import org.junit.Test;

public class ConfigurationManagerTest {
    /**
     * 测试配置文件管理类
     */
    @Test
    public void getMethod(){
        System.out.println(ConfigurationManager.getProperty("jdbc.driver"));
    }
}
