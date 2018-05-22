package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.Condition.visible;

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

    @Then("^checkbox at (\\d+) todo is not visible$")
    public void checkbox_at_todo_condition(int lineTodo){
        todo.checkboxTodo(lineTodo).shouldNotBe(visible);
    }

    @And("^delete button at (\\d+) line todo is not visible$")
    public void delete_button_at_todo_condition(int lineTodo){
        todo.deleteButton(lineTodo).shouldNotBe(visible);
    }

    @Then("^delete todo number (\\d+)$")
    public void delete_todo(int lineTodo){
        todo.deleteTodo(lineTodo);
    }
}
