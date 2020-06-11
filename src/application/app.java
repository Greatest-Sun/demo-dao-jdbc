package application;

import model.entities.Department;

import java.sql.SQLOutput;

public class app {
    public static void main(String[] args) {
        Department obj = new Department(1, "Estoque");
        System.out.println(obj);
    }
}
