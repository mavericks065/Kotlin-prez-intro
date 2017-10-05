package com.au

import com.au.model.Employee

class EmployeeService {

    fun getYoungEmployeesOrderedBySalary(employees: List<Employee>) : List<Employee> {
        val predicate: (Employee) -> Boolean = { e -> e.age < 30 }

        return employees.filter(predicate).sortedBy { it.salary }
    }

    fun getEmployeesFirstname(employees: List<Employee>) : List<String> {
        return employees.map { it.name }
    }

    fun getOldestEmployee(employees: List<Employee>) : Employee? {
        return employees.maxBy{ it.age }
    }

    fun getEmployees(employees: List<List<Employee>>) : List<Employee> {
        return employees.flatten().distinct()
    }

    fun getSalaries(employees: List<Employee>) : Float {
//        return employees.map { it.salary }.reduce { y, x -> x+y }
        return employees.map { it.salary }.sum()
    }

}