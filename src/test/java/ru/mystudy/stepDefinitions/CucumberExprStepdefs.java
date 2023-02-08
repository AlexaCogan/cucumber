package ru.mystudy.stepDefinitions;

import io.cucumber.java.ru.Допустим;

public class CucumberExprStepdefs {
    @Допустим("передадим в метод шага целое число {int}")
    public void передадим_в_метод_шага_целое_число(Integer int1) {
        System.out.println("целое число: " + int1);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Допустим("передадим в метод шага дробное число {double}")
    public void передадим_в_метод_шага_дробное_число(Double double1) {
        System.out.println("дробно число: " + double1);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Допустим("передадим в метод шага {string}")
    public void передадим_в_метод_шага(String string) {
        System.out.println("Строка: " + string);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Допустим("передадим в метод шага слово {word}")
    public void передадим_в_метод_шага_слово(String string) {
        System.out.println("Слово: " +string);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
