package com.Saucedemo.utils;

import java.util.Properties;

public class ConfigUtils {
    private Properties properties;
    private static ConfigUtils configUtils;

    private ConfigUtils() {
        properties = PropertiesUtils.loadProperties("src/test/java/com/Saucedemo/config/production.properties");
    }

    public static ConfigUtils getInstance() {
        if (configUtils == null) {
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    public String getBaseUrl() {
        String prop = properties.getProperty("baseUrl");
        if (prop != null) {
            System.out.println("Base URL retrieved from config file: " + prop);
            return prop;
        }
        throw new RuntimeException("Could not find the base URL in the property file");
    }

    public String getBrowser() {
        String prop = properties.getProperty("browser");
        if (prop != null) {
            System.out.println("Browser retrieved from config file: " + prop);
            return prop;
        }
        throw new RuntimeException("Could not find the browser in the property file");
    }
}
