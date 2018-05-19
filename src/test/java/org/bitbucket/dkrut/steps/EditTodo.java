package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.bitbucket.dkrut.pages.TodoMVC;

/**
 * Created by Denis Krutikov on 19.05.2018.
 */

public class EditTodo {
    private TodoMVC todo = new TodoMVC();

    @When("^user edit 1 todo by enter adding (.*).$")
    public void edit_by_enter(String newValue){
        todo.editTodoByEnter(1, newValue);
    }

    @When("^user edit 1 todo by blur adding (.+)$")
    public void edit_by_blur(String newValue){
        todo.editTodoByBlur(1, newValue);
    }

    @Then("^user edit todo adding (.+) clicking ESC$")
    public void cancel_editing(String newValue){
        todo.cancelEditingTodo(1, newValue);
    }

    @When("^user add new todo with value ([\\w\\s]+).$")
    public void add_todo_with_value(String newValue){
        todo.newTodo.setValue(newValue).pressEnter();
    }
}
