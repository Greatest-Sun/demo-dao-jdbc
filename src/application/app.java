package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLOutput;
import java.util.Date;

public class app {
    public static void main(String[] args) {
        SellerDAO sd = DAOFactory.createSellerDAO();
        System.out.println("===Test 1 -> seller findById===");
        Seller seller = sd.findById(3);
        System.out.println(seller);
    }
}
