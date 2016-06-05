/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filechecker.entity;


public class Employee {
    private String Firstname,Lastname,Email,Phno,salary;
    private int id;
    private boolean salaryStatus;

    public Employee() {
    }

    public Employee(String Firstname, String Lastname, String Email, String Phno, int id, String salary, boolean salaryStatus) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Email = Email;
        this.Phno = Phno;
        this.id = id;
        this.salary = salary;
        this.salaryStatus = salaryStatus;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhno() {
        return Phno;
    }

    public void setPhno(String Phno) {
        this.Phno = Phno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public boolean isSalaryStatus() {
        return salaryStatus;
    }

    public void setSalaryStatus(boolean salaryStatus) {
        this.salaryStatus = salaryStatus;
    }

    @Override
    public String toString() {
        return "Employee{" + "Firstname=" + Firstname + ", Lastname=" + Lastname + ", Email=" + Email + ", Phno=" + Phno + ", id=" + id + ", salary=" + salary + ", salaryStatus=" + salaryStatus + '}';
    }

  

  
}
