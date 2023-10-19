package com.BootFlow.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
    public AboutPage(){
        PageFactory.initElements(com.BootFlow.utilities.Driver.getDriver(),this);}

    @FindBy(id = "loginLink")
    public WebElement loginLink;

    @FindBy(id = "UserName")
    public WebElement UserName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath ="//input[@value='Log in']")
    public WebElement loginButton;


    @FindBy(xpath = "//a[.='Employee List']")
    public WebElement EmployeeList;

    @FindBy(xpath ="//a[@class='btn btn-primary']")
    public static WebElement CreateNew;

    @FindBy(id = "Name")
    public WebElement CreateName;

    @FindBy(id = "Salary")
    public WebElement CreateSalary;

    @FindBy(id = "DurationWorked")
    public WebElement CreateDurationWorked;

    @FindBy(id = "Grade")
    public WebElement CreateGrade;

    @FindBy(id = "Email")
    public WebElement CreateEmail;

    @FindBy(xpath = "//input[@class='btn btn-default']")
    public WebElement Create;

    @FindBy(xpath = "//input[@name='searchTerm']")
    public WebElement SearchTerm;

    @FindBy(xpath = "//input[@class='btn btn-default']")
    public WebElement searchToDefault;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr[2]/td[1]")
    public WebElement isNamed;

    @FindBy(xpath = "//a[.='Delete']")
    public WebElement delete;

    @FindBy(xpath = "(//input[@value='Delete'])")
    public WebElement confirmDelete;

    @FindBy (xpath ="/html/body/div[2]/table/tbody/tr")
    public WebElement tableId;
}
