package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.When;
import org.bitbucket.dkrut.pages.TodoMVC;

/**
 * Created by Denis Krutikov on 19.05.2018.
 */

public class AllCompletedTodo {
    private TodoMVC todo = new TodoMVC();

    @When("^click toggle all completed$")
    public void click_toggle_all_completed(){
        todo.clickToggleAllCompleted();
    }
}
