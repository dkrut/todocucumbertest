package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.Then;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.Condition.text;

/**
 * Created by Denis Krutikov on 19.05.2018.
 */

public class CountTodo {
    private TodoMVC todo = new TodoMVC();

    @Then("^count todo have text (\\d+) item left$")
    public void count_todo(int count){
        todo.todoCount.shouldHave(text(count + " item left"));
    }
}
