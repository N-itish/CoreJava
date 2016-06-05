/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechecker.entity.employeeDAO.impl;

import filechecker.entity.Employee;
import filechecker.entity.employeeDAO.EmployeeDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nitish
 */
public class EmployeeDAOimpl implements EmployeeDAO{
    List<Employee> employeelist = new ArrayList<>();
    @Override
    public List<Employee> getall() {
        return employeelist;
    }

    @Override
    public int insert(Employee e) {
        employeelist.add(e);
        return 1;
    }

    @Override
    public boolean getByID(int id) {
        for(Employee e:employeelist)
        {
            if(e.getId() == id)
            return true;
        }
        return false;
    }
    
}
