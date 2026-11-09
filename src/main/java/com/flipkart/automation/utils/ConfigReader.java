package com.flipkart.automation.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try {
            InputStream input = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            if (input == null) {
                throw new RuntimeException(
                        "config.properties file not found"
                );
            }

            properties.load(input);

            input.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Get Property Value
    public static String get(String key) {
        return properties.getProperty(key);
    }
}