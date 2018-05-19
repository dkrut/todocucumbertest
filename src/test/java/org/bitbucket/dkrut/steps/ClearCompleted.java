package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.Condition.visible;

/**
 * Created by Denis Krutikov on 19.05.2018.
 */

public class ClearCompleted {
    private TodoMVC todo = new TodoMVC();

    @Then("^button clear completed is not visible$")
    public void button_clear_completed_unvisible(){
        todo.buttonClearCompleted.shouldNot(visible);
    }

    @And("^click button clear completed$")
    public void click_button_clear_completed(){
        todo.clickClearCompleted();
    }

}
