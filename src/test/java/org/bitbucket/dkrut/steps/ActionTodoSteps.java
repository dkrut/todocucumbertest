package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.Condition.*;

/**
 * Created by Denis Krutikov on 05.05.2018.
 */

public class ActionTodoSteps {
    private TodoMVC todo = new TodoMVC();

    @Given("^user create (\\d+) new todo$")
    public void user_create_a_new_todo(int count) {
        todo.newTodo(count);
    }

    @When("^user click checkbox at (\\d+) todo$")
    public void user_click_checkbox(int count) {
        todo.clickCheckboxTodo(count);
    }

    @When("^click checkbox at (\\d+) todo else$")
    public void click_checkbox_else(int count) {
        todo.clickCheckboxTodo(count);
    }

    @When("^user make double click at (\\d+) line todo$")
    public void user_make_double_click_at_line_todo(int lineTodo) {
        todo.lineTodo(lineTodo).doubleClick();
    }

    @When("^user hover to (\\d+) line todo$")
    public void user_hover_to_line_todo(int linetodo) {
        todo.lineTodo(linetodo).hover();
    }

    @Then("^checkbox at (\\d+) todo is selected$")
    public void checkbox_is_selected(int count) {
        todo.checkboxTodo(count).shouldBe(selected);
    }

    @Then("^checkbox at (\\d+) todo is unselected$")
    public void checkbox_is_unselected(int count) {
        todo.checkboxTodo(count).shouldNotBe(selected);
    }

    @Then("^(\\d+) line todo not be a readonly$")
    public void line_todo_status(int lineTodo) {
        todo.lineTodo(lineTodo).shouldNotBe(readonly);
    }

    @Then("^delete button at (\\d+) line todo is visible$")
    public void delete_button_status(int lineTodo){
        todo.deleteButton(lineTodo).shouldBe(visible);
    }
}
