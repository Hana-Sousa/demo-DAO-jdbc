package application;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

import java.util.List;


public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("==== Teste 1: department findById ====");

        Department department = departmentDao.findById(3);
        System.out.println(department);

//        System.out.println("\n==== Teste 2: seller findByDepartment ====");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }

//        System.out.println("\n==== Teste 3: seller findAll ====");
//        list = sellerDao.findAll();
//        for (Seller obj : list) {
//            System.out.println(obj);

        System.out.println("\n==== Teste 4: seller insert ====");
        Department newDepartment = new Department( 9, "music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id = " + newDepartment.getId());

        System.out.println("\n==== Teste 5: seller update ====");
        department = departmentDao.findById(1);
        department.setName("Engineering");
        departmentDao.update(department);
        System.out.println("Update Completed");
    }


}
