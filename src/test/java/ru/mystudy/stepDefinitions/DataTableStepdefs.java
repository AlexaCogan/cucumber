package ru.mystudy.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.Допустим;

import java.util.List;
import java.util.Map;

public class DataTableStepdefs {
    @Допустим("передадим в метод список строк")
    public void arrayList(List<Integer> list) {
        for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    @Допустим("передадим в метод ассоциативный массив")
    public void map (Map<String, String> map) {
        map.forEach((k, v) ->{
            System.out.println(k + " " + v);
        });
    }

    @Допустим("передадим в метод datatable")
    public void dataTable(DataTable dataTable) {
        for (int i = 0; i < dataTable.width(); i++) {
            System.out.println(dataTable.row(i));
            
        }
    }
}
