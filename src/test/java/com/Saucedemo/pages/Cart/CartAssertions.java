package com.Saucedemo.pages.Cart;

import org.openqa.selenium.By;

public class CartAssertions {

    public static By cartTitle = By.cssSelector("[data-test='title']");

    public static By firstProductName =By.xpath("(//*[@class=\"inventory_item_name\"])[1]");
    public static By secondProductName =By.xpath("(//*[@class=\"inventory_item_name\"])[2]");
}
