package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	WebDriver driver;
	@Given("User is on adactin page")
	public void user_is_on_adactin_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Velmurugan\\eclipse-workspace\\Mavenproject1\\dfriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://adactin.com/HotelApp/");
	driver.manage().window().maximize();
	
	    
	}

	@When("User enters User nane and password")
	public void user_enters_User_nane_and_password() {
		
		driver.findElement(By.id("username")).sendKeys("vel");
		driver.findElement(By.id("password")).sendKeys("123456");
		System.out.println("user details entered");
	}

	@Then("User click the login button")
	public void user_click_the_login_button() {
		
		driver.findElement(By.id("login")).click();
	    
	}



}
