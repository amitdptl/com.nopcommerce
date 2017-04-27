package com.nopcommerce;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 27/04/2017.
 */
public class MyStepdefs {
    WebDriver driver;
    @Given("^user is on home page$")

    public void userIsOnHomePage() {
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");

    }
    @When("^user click on jewellery$")
    public void user_click_on_jewellery() {
        driver.findElement(By.linkText("Jewelry")).click();

    }

    @When("^user can nevigate to jewellery page$")
    public void user_can_nevigate_to_jewellery_page() {

    }

    @When("^user click on add to cart under flower girl bracelet$")
    public void user_click_on_add_to_cart_under_flower_girl_bracelet() {
        driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

    }


    @When("^user click on close button$")
    public void user_click_on_close_button() {
        driver.findElement(By.cssSelector("span.close")).click();

    }

    @When("^user click on shopping cart on top right hand corner of the page$")
    public void user_click_on_shopping_cart_on_top_right_hand_corner_of_the_page() {
        driver.findElement(By.cssSelector("input.button-1.cart-button")).click();

    }

    @Then("^user should nevigate to shopping cart page successfully$")
    public void user_should_nevigate_to_shopping_cart_page_successfully() {

    }
}
