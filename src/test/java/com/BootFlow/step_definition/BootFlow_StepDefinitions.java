package com.BootFlow.step_definition;

import com.BootFlow.pages.AboutPage;
import com.BootFlow.utilities.BrowserUtils;
import com.BootFlow.utilities.ConfigurationReader;
import com.BootFlow.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class BootFlow_StepDefinitions extends AboutPage{

    AboutPage aboutPage=new AboutPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("user is on the eaapp web page")
    public void user_is_on_the_eapp_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user should see title is eaapp.somee.com")
    public void user_should_see_title_is_eaapp_somee_com() {
        Assert.assertEquals("Home - Execute Automation Employee App",Driver.getDriver().getTitle());
    }

    @Given("The user clicks on the login button and lands on login page")
    public void the_user_clicks_on_the_login_button() {
        aboutPage.loginLink.click();
    }

    @When("The user enters valid credentials into the field")
    public void the_user_lands_on_the_login_page() {
        aboutPage.UserName.sendKeys("admin");
        aboutPage.password.sendKeys("password");
        BrowserUtils.sleep(3);
    }



    @Then("The user clicks on login button")
    public void the_user_clicks_on_login_button() {
        aboutPage.loginButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("The user lands on dashboard")
    public void the_user_lands_on_dashboard() {
        Assert.assertEquals("Home - Execute Automation Employee App",Driver.getDriver().getTitle());
    }


    @Given("The user clicks on employee list on the dashboard")
    public void the_user_clicks_on_employee_list_on_the_dashboard() {
        aboutPage.EmployeeList.click();
    }

    @When("The user clicks create new button")
    public void the_user_clicks_create_new_button() {
        aboutPage.CreateNew.click();
    }

    @Then("The user enters valid credentials about new employee into provided fields.")
    public void the_user_enters_valid_credentials_about_new_employee_into_provided_fields() {
        aboutPage.CreateName.sendKeys("Nily2");
        aboutPage.CreateSalary.sendKeys("45000");

        aboutPage.CreateDurationWorked.sendKeys("5000");

        aboutPage.CreateGrade.sendKeys("5");

        aboutPage.CreateEmail.sendKeys("nily2@example.com");
        BrowserUtils.sleep(1);
    }

    @Then("The user clicks create button")
    public void the_user_clicks_create_button() {
        aboutPage.Create.click();
    }

    @Then("The user should see new employee on the employee list page")
    public void the_user_should_see_new_employee_on_the_employee_list_page() {
        aboutPage.SearchTerm.sendKeys("Nily2");
        aboutPage.searchToDefault.click();


        boolean dataExists1 =aboutPage.isNamed.getText().contains("Nily2");
        if (dataExists1) {
            System.out.println("new employee created on the employee list");
        } else {
            System.out.println("new employee did not create on the employee list");
        }
    }

    @Then("The user selects the new employee from the employee list and clicks delete button")
    public void the_user_selects_the_new_employee_from_the_employee_list_and_clicks_delete_button() {
        aboutPage.delete.click();
        aboutPage.confirmDelete.click();
    }

    @Then("Verify that the user succsessfully deleted new employee from the employee list")
    public void verify_that_the_user_succsessfully_deleted_new_employee_from_the_employee_list() {
        aboutPage.SearchTerm.sendKeys("Nily2");
        aboutPage.searchToDefault.click();

        boolean dataExists2 =aboutPage.tableId.getText().contains("Nily2");
        if (!dataExists2) {
            System.out.println("new employee deleted");
        } else {
            System.out.println("new employee can not delete");
        }
    }

}
