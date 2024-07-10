package application;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        Seller newSeller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(obj);
        System.out.println(newSeller);
        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
