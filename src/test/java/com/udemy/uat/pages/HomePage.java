package com.udemy.uat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.udemy.uat.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	// THis is the first change
	// THis is the second change
	@FindBy(id = "id_email")
	public WebElement emailId;

	@FindBy(id = "id_password")
	public WebElement password;

	@FindBy(id = "submit-id-submit")
	public WebElement submitButton;

	@FindBy(xpath = "(//div[@ng-click='attemptAction($event)'])[2]")
	public WebElement signUpButton;

	@FindBy(id = "q")
	public WebElement searchBox;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement searchButton;

	@FindBy(xpath = "(//div[@ng-click='attemptAction($event)'])[1]")
	public WebElement logInButton;

	@FindBy(id = "id_fullname")
	public WebElement fullName;

	@FindBy(xpath = "//a[@href='/user/logout/?h=E0AdcVhQRXsBUQ%3D%3D']")
	public WebElement logOut;

	@FindBy(xpath = "(//span[@class='user__no-avatar'])[1]")
	public WebElement nameAvatar;

}
