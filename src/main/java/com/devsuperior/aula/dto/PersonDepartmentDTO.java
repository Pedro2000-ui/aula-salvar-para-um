package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDTO {
    private Long id;
    private String name;
    private double salary;

    private DepartmentDTO department;

    public PersonDepartmentDTO() {}

    public PersonDepartmentDTO(Long id, String name, double salary, DepartmentDTO department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public PersonDepartmentDTO(Person entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.salary = entity.getSalary();
        this.department = new DepartmentDTO(entity.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
