package model.dao.impl;

import model.dao.DepartmentDAO;
import model.entities.Department;

import java.sql.Connection;
import java.util.List;

public class DepartmentDAOJDBC implements DepartmentDAO {

    private Connection conn;

    public DepartmentDAOJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
