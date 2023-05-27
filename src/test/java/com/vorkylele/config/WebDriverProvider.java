package com.vorkylele.config;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;


import static com.vorkylele.config.ConfigSingle.config;

public class WebDriverProvider  {

    public static Configuration createDriver() {
        Configuration configuration = new Configuration();
        switch (config.getBrowser()) {
            case CHROME: {
                WebDriverManager.chromedriver().setup();
                configuration.browser = "chrome";
                break;
            }
            case FIREFOX: {
                WebDriverManager.firefoxdriver().setup();
                configuration.browser = "firefox";
                break;
            }
            default: {
                throw new RuntimeException("No such driver");
            }
        }
        return configuration;
    }
}
