package com.realdolmen.greeting.beans;

import com.realdolmen.greeting.domain.Employee;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@ManagedBean //beschikbaar maken op webpage
@ApplicationScoped
public class EmployeeList implements Serializable {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void adEmployee(Employee employee) {
        employees.add(employee);
    }
}
