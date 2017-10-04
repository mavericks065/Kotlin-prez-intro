package com.au

import com.au.model.Employee


class EmployeeService {

    fun getYoungEmployeesOrderedBySalary(employees: List<Employee>) : List<Employee> {
        return employees.filter { e -> e.age < 30 }.sortedBy { e -> e.salary }
    }

}