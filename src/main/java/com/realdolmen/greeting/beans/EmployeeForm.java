package com.realdolmen.greeting.beans;


import com.realdolmen.greeting.domain.Employee;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped //bestaan tijdens één request - mag weg nadat pagina opnieuw is gerefreshed
public class EmployeeForm {

    private Employee employee;

    @ManagedProperty("#{employeeList}")
    private EmployeeList employeeList;

    public EmployeeList getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    @PostConstruct //invullen van velden
    public void init() {
        employee = new Employee();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String saveEmployee() {
        System.out.println(employee.toString());
        employeeList.adEmployee(employee);
        employee = new Employee();
        return "employeeList.xhtml?faces-redirect=true";
    }
}
