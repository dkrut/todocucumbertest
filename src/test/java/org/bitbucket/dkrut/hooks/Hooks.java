package org.bitbucket.dkrut.hooks;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.bitbucket.dkrut.pages.TodoMVC;

import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Denis Krutikov on 05.05.2018.
 */

public class Hooks {
    protected TodoMVC todo;

    @Before
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.reportsFolder = "target/reports/screenshots";
        todo = open("http://todomvc.com/examples/backbone/", TodoMVC.class);
    }

    @After
    public void clearTasks(){
//        clearBrowserCookies();
        clearBrowserLocalStorage();
    }
}