package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by Denis Krutikov on 03.06.2018.
 */

public class SavingData {
    private TodoMVC todo = new TodoMVC();

    @When("^refresh page$")
    public void refreshPage(){
        refresh();
    }

    @When("^create new tab$")
    public void createNewTab(){
        executeJavaScript("window.open('http://todomvc.com/examples/backbone/','_blank')");
    }

    @And("^switch to the window (\\d+)$")
    public void switchToTab(int windowNumber){
        switchTo().window(windowNumber);
    }
}
