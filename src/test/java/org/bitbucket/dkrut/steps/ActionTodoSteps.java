package org.bitbucket.dkrut.steps;

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

    @Given("^user create a new todo$")
    public void user_create_a_new_todo() {
        todo.newTodo(1);
    }

    @When("^user click checkbox$")
    public void user_click_checkbox() {
        todo.clickCheckboxTodo(1);
    }

    @When("^click checkbox else$")
    public void click_checkbox_else() {
        todo.clickCheckboxTodo(1);
    }

    @Then("^checkbox is selected$")
    public void checkbox_is_selected() {
        todo.checkboxTodo(1).shouldBe(selected);
    }

    @Then("^checkbox is unselected$")
    public void checkbox_is_unselected() {
        todo.checkboxTodo(1).shouldNotBe(selected);
    }
}
