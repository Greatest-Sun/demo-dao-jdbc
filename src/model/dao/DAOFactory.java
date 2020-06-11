package model.dao;

import model.dao.impl.SellerDAOJDBC;
import model.entities.Seller;

public class DAOFactory {
    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC();
    }
}
