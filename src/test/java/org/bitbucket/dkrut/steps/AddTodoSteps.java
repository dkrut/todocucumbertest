package org.bitbucket.dkrut.steps;

import com.codeborne.selenide.CollectionCondition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.Condition.*;

/**
 * Created by Denis Krutikov on 14.05.2018.
 */

public class AddTodoSteps {
    private TodoMVC todo = new TodoMVC();

    @Then("^list todo have (\\d+) todo$")
    public void list_todo_count(int count){
        todo.todoList.shouldHave(CollectionCondition.size(count));
    }

    @Then("^input field for new todo should be visible$")
    public void input_field_for_new_todo_visible_status(){
        todo.newTodo.shouldBe(visible);
    }

    @And("^input field for new todo should be focused$")
    public void input_field_for_new_todo_focus_status(){
        todo.newTodo.shouldBe(focused);
    }

    @And("^input field for new todo shouldn't be readonly$")
    public void input_field_for_new_todo_readonly_status(){
        todo.newTodo.shouldNotBe(readonly);
    }

    @Then("^(\\d+) line todo have text (.+)$")
    public void sorting_todo(int lineTodo, String textTodo){
        todo.lineTodo(lineTodo).shouldHave(text(textTodo));
    }
}
