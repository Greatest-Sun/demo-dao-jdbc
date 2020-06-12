package application;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        DepartmentDAO dd = DAOFactory.createDepartmentDAO();

        System.out.println("===Test 1 -> department findById===");
        Department department = dd.findById(3);
        System.out.println(department);

        System.out.println("===Test 2 -> department findAll===");
        List<Department> list = dd.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        /*
        System.out.println("===Test 3 -> insert department===");
        department = new Department(null, "Food");
        dd.insert(department);
        System.out.println("Inserted! new ID = " + department.getId());

        System.out.println("===Test 4 -> update department===");
        department = dd.findById(1);
        department.setName("Robots");
        dd.update(department);
        System.out.println("Update completed!");

        System.out.println("===Test 6 -> delete department===");
        System.out.print("Enter a ID for delete a department: ");
        Scanner sc = new Scanner(System.in);
        dd.deleteById(sc.nextInt());
        sc.close();
        System.out.println("Delete complete");
        */
    }
}
