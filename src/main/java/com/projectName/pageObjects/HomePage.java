package com.projectName.pageObjects;

import com.projectName.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Base {

    //Page Objects Factory

    @FindAll(@FindBy(xpath = "//div[@class='ng-star-inserted']/mat-grid-list"))
    public List<WebElement> itemsList;

    // Constructor
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    // Actions





}
