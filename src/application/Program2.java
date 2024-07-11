package application;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

import java.util.List;
import java.util.Scanner;


public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        System.out.println("\n==== Teste 4: department insert ====");
        Department newDepartment = new Department( 10, "PE");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id = " + newDepartment.getId());

        System.out.println("\n==== Teste 5: department update ====");
        department = departmentDao.findById(1);
        department.setName("Engineering");
        departmentDao.update(department);
        System.out.println("Update Completed");

        System.out.println("\n==== Teste 6: department delete ====");
        System.out.println("Enter id for delete test");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
        sc.close();

    }


}
