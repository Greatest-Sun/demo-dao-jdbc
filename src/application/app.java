package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.dao.impl.SellerDAOJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        SellerDAO sd = DAOFactory.createSellerDAO();
        /*
        System.out.println("===Test 1 -> seller findById===");
        Seller seller = sd.findById(3);
        System.out.println(seller);


        System.out.println("===Test 2 -> seller findByDepartment===");
        Department department = new Department(2, null);
        List<Seller> list = sd.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("===Test 3 -> seller findAll===");
        List<Seller> list = sd.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
        */

        //System.out.println("===Test 4 -> insert seller===");
        Seller seller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(1, null));
        //sd.insert(seller);
        //System.out.println("Inserted! new ID = " + seller.getId());

        /*
        System.out.println("===Test 5 -> update seller===");
        seller = sd.findById(1);
        seller.setName("Martha Wayne");
        sd.update(seller);
        System.out.println("Update completed!");
        */

        System.out.println("===Test 6 -> delete seller===");
        System.out.print("Enter a ID for delete a seller: ");
        Scanner sc = new Scanner(System.in);
        sd.deleteById(sc.nextInt());
        sc.close();
        System.out.println("Delete complete");
    }
}
