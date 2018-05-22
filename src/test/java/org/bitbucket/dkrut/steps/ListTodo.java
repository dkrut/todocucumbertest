package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.CollectionCondition.size;

/**
 * Created by Denis Krutikov on 22.05.2018.
 */

public class ListTodo {
    private TodoMVC todo = new TodoMVC();

    @And("^click button completed$")
    public void click_button_completed(){
        todo.clickButtonCompleted();
    }

    @And("^click button all")
    public void click_button_all(){
        todo.clickButtonAll();;
    }

    @Then("^list completed todo have (\\d+) todo$")
    public void list_completed_size(int size){
        todo.todoListCompleted.shouldHave(size(size));
    }
}
