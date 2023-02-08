package ru.mystudy.hooks;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void prepareData(){
        System.out.println("Данные в БД добавлены");
    }

    @Before(order = 1000)
    public void connectToBD(){
        System.out.println("Подключение к БД установленно");
    }

    @After(order = 11000)
    public void clearData(){
        System.out.println("Данные очищены");
    }

    @After
    public void bdDdisconnect() {
        System.out.println("Подключение к БД остановлено");
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("before step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("after step");
    }
}
