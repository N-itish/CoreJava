/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechecker.entity.employeeDAO;

import filechecker.entity.Employee;
import java.util.List;

/**
 *
 * @author Nitish
 */
public interface EmployeeDAO {
    List<Employee> getall();
    int insert(Employee e);
    boolean getByID(int id);
}
