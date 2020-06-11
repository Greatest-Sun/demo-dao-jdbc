package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLOutput;
import java.util.Date;

public class app {
    public static void main(String[] args) {
        Department obj = new Department(1, "Estoque");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
    }
}
