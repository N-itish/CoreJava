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
                   if (tokens[6].equalsIgnoreCase("1")) {
                        employee.setSalaryStatus(true);
                    } else {
                        employee.setSalaryStatus(false);
                    }
                    Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
                    Matcher m = p.matcher(employee.getEmail());
                    boolean matchFound = m.matches();

                    if (matchFound || !line.contains(" ")) {

                        if ((employeeDao.getByID(employee.getId()) != 1) && (employeeDao.getByEmail(employee.getEmail()) != 1)) {
                            employeeDao.insert(employee);
                            ok.append(line + "\n");
                        }
                        else {
                        broken.append(line + "\n");
                        } 
                    }
                     else 
                    {
                        broken.append(line + "\n");
                    }
                }
            }
            /*reader.close();                                                       //checks the list
             employeeDao.getall().forEach(c->{
             System.out.println(c);
                        
             });*/

            System.out.println(broken);
            System.out.println(ok);

            FileWriter brokenfile = new FileWriter("E:/broken.csv");
            brokenfile.write(broken.toString() + "\n");
            brokenfile.close();

            FileWriter okfile = new FileWriter("E:/ok.csv");
            okfile.write(ok.toString());
            okfile.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

