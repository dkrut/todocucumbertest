package org.bitbucket.dkrut.steps;

import cucumber.api.java.en.Given;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.Condition.*;

/**
 * Created by Denis Krutikov on 03.06.2018.
 */

public class DefaultInterface {
    private TodoMVC todo = new TodoMVC();

    @Given("^new todo field have text (.*)$")
    public void placeholderText(String text){
        todo.newTodo.shouldHave(attribute("placeholder",text));
    }

    @Given("^new todo field is focused$")
    public void newTodoFocusStatus(){
        todo.newTodo.shouldBe(focused);
    }

    @Given("^header have text (.*)$")
    public void headerText(String text){
        todo.header.shouldHave(text(text));
    }

    @Given("^footer is not visible$")
    public void footerStatus(){
        todo.footer.shouldNotBe(visible);
    }
}
