package ru.mystudy.stepDefinitions;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Когда;
import org.testng.Assert;

import java.math.BigDecimal;

public class MyStepdefs {
    private static BigDecimal cash = new BigDecimal(120_000);
    @Дано("на счете пользователя имеется {int} рублей")
    public void наСчетеПользователяИмеетсяРублей(int arg0) {
        Assert.assertEquals(0, cash.compareTo(new BigDecimal(arg0)));
        
    }

    @Когда("пользователь снимает со счета {int} рублей")
    public void пользовательСнимаетСоСчетаРублей(int arg0) {
        cash = cash.subtract(new BigDecimal(arg0));
    }

    @Допустим("выведется на консоль стихотворение")
    public void printPoem(String poem){
        System.out.println(poem);
    }

    @Допустим("{int} умножаем на {int} получаем {int}")
    public void multiply(int x, int y, int z) {
        System.out.println(x + " + " + y + " = " + z);
        Assert.assertEquals(x * y, z);
    }

    @Допустим("пользователь успешно авторизовался")
    public void authSuccess(){
        System.out.println("Пользователь авторизован");
    }

}
