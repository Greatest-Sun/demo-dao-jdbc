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
        SellerDAO sd = DAOFactory.createSellerDAO();
        Seller seller = sd.findById(3);
        System.out.println(seller);
    }
}
