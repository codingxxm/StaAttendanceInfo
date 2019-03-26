package com.xxm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {
    static Properties properties;

    public ConfigUtils(String filePath) throws Exception {
        InputStream in = new FileInputStream(new File(filePath));
        properties = new Properties();
        properties.load(in);
    }

    private static String getProperties(Properties prop, String key){
        return prop.getProperty(key);
    }

    public static String getUrl(){
        return getProperties(properties, "url") ;
    }

    public static String getDeptId(){
        return getProperties(properties, "deptId") ;
    }

    public static String getStartDate(){
        return getProperties(properties, "startDate") ;
    }

    public static String getEndDate(){
        return getProperties(properties, "endDate") ;
    }

    public static String getSaveFile(){
        return getProperties(properties, "saveFile") ;
    }
}
