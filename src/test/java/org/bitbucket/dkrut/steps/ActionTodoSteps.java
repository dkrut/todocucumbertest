package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.Condition.selected;

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

    @Then("^checkbox at (\\d+) todo is selected$")
    public void checkbox_is_selected(int count) {
        todo.checkboxTodo(count).shouldBe(selected);
    }

    @Then("^checkbox at (\\d+) todo is unselected$")
    public void checkbox_is_unselected(int count) {
        todo.checkboxTodo(count).shouldNotBe(selected);
    }
}
