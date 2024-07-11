package model.dao;

import db.DB;
import entities.Department;
import impl.DepartmentDaoJDBC;
import impl.SellerDaoJDBC;

import java.util.List;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
