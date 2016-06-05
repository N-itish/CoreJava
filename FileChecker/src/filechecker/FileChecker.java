/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechecker;

import filechecker.entity.Employee;
import filechecker.entity.employeeDAO.EmployeeDAO;
import filechecker.entity.employeeDAO.impl.EmployeeDAOimpl;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Nitish
 */
public class FileChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line = "";
        int i=0;
        EmployeeDAO dao = new EmployeeDAOimpl();
        Employee employee = new Employee();
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader("E:/Given.csv"));
            while((line = reader.readLine()) != null)
            {
                
                String[] tokens = line.split(",");
                if(tokens.length >= 7)
                {
                employee.setId(Integer.parseInt(tokens[0]));
                employee.setFirstname(tokens[1]);
                employee.setLastname(tokens[2]);
                employee.setEmail(tokens[3]);
                employee.setPhno(tokens[4]);
                employee.setSalary(tokens[5]);
                if(tokens[6].equalsIgnoreCase("1"))
                {
                    employee.setSalaryStatus(true);
                }
                else
                {
                    employee.setSalaryStatus(false);
                }
                }
               // System.out.println(line);
                    
                    if(tokens[i] == null)
                    {
                        System.out.println(i + "/n");
                    }
                    i++;
                
                
                Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
                Matcher m = p.matcher(employee.getEmail());
                boolean matchFound = m.matches();   
                if (matchFound) 
                {
                        System.out.println(employee.getEmail());
                }
                
            }
            dao.insert(employee);
            
            
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
