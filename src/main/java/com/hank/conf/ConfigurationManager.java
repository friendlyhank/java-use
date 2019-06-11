package com.hank.conf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置文件管理类
 * 主要的功能：从特定的properties文件中读取相应的Key/Value
 */
public class ConfigurationManager {
    private static Properties prop = new Properties();

    /**
     * 通过静态代码块加载配置文件
     */
    static{
        try {
            InputStream inStream=ConfigurationManager.class.getClassLoader().getResourceAsStream("conf.properties");
            prop.load(inStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *通过指定的Key获取value
     * @param key
     * @return String
     */
    public static String getProperty(String key){
        return prop.getProperty(key);
    }

    public static Integer getInteger(String key)
    {
        String value = getProperty(key);
        try{
            Integer result =Integer.valueOf(value);
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public static Boolean getBoolean(String key){
        String value=getProperty(key);
        if("false".equals(value))
        {
            return false;
        }
        return true;
    }
}
