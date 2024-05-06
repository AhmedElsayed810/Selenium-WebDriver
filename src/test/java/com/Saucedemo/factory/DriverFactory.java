package com.Saucedemo.factory;

import com.Saucedemo.utils.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

    WebDriver driver;
    public WebDriver initializeDriver() {


//        String browser = System.getProperty("browser", "CHROME") ;
        String browser = ConfigUtils.getInstance().getBrowser();

        switch (browser){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("the browser is not supported");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();



        String baseUrl = ConfigUtils.getInstance().getBaseUrl();

        driver.get(baseUrl);
        return driver;

    }}



