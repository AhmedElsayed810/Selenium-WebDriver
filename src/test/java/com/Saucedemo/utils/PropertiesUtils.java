package com.Saucedemo.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesUtils {

    public static Properties loadProperties(String filePath) {
        File file = new File(filePath);
        try {
            InputStream inputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            return properties;


        } catch (FileNotFoundException e) {
            throw new RuntimeException("file is not found");
        } catch (IOException e) {
            throw new RuntimeException("error while loading the properties");
        }


//    public static Properties loadProperties(String filePath) {
//        Properties properties = new Properties();
//        try (InputStream inputStream = PropertiesUtils.class.getClassLoader().getResourceAsStream(filePath)) {
//            if (inputStream != null) {
//                properties.load(inputStream);
//            } else {
//                throw new FileNotFoundException("Property file '" + filePath + "' not found in the classpath");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException("Error while loading properties file: " + filePath, e);
//        }
//        return properties;
//    }


    }}



