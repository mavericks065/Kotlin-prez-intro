package com.au

import com.au.model.Employee
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

object EmployeeServiceSpec: Spek({
    fun createEmployees() : List<Employee> {
        return listOf(
                Employee("Mike", 27, 100.0.toFloat(), 1),
                Employee("Jordan", 26, 96.0.toFloat(), 2),
                Employee("Nick", 37, 140.0.toFloat(), 3),
                Employee("Sylvie", 31, 120.0.toFloat(), 4),
                Employee("Steph", 28, 101.0.toFloat(), 5)
        )
    }

    fun createWomenEmployees() : List<Employee> {
        return listOf(
                Employee("Sylvie", 31, 120.0.toFloat(), 4),
                Employee("Math", 22, 45.0.toFloat(), 7)
        )
    }

    fun createMenEmployees() : List<Employee> {
        return listOf(
                Employee("Mike", 27, 100.0.toFloat(), 1),
                Employee("Jordan", 26, 96.0.toFloat(), 2),
                Employee("Nick", 37, 140.0.toFloat(), 3),
                Employee("Stephan", 32, 105.0.toFloat(), 6)
        )
    }



    describe("Given a list of employees") {
        val employees = createEmployees()
        val service = EmployeeService()

        describe("When I get the young ones ordered by salary") {
            on("getYoungEmployeesOrderedBySalary") {
                val filteredResult = service.getYoungEmployeesOrderedBySalary(employees)
                it("should return 3 employees") {
                    assertEquals(3, filteredResult.size)
                }
                it("should return an ordered List") {
                    assertEquals("Jordan", filteredResult.get(0).name)
                    assertEquals("Mike", filteredResult.get(1).name)
                    assertEquals("Steph", filteredResult.get(2).name)
                }
            }
        }

        describe("When I get the list of names") {
            on("getEmployeesFirstname") {
                val result = service.getEmployeesFirstname(employees)

                it("should return an ordered List") {
                    assertEquals(listOf("Mike", "Jordan", "Nick", "Sylvie", "Steph"), result)
                }
            }
        }

        describe("When I get the oldest employee") {
            on("getOldestEmployee") {
                val result = service.getOldestEmployee(employees)

                it("should return an ordered List") {
                    assertEquals("Nick", result?.name)
                }
            }
        }

        describe("When I get all the employees") {
            on("getEmployees") {
                val result = service.getEmployees(listOf(employees, createMenEmployees(), createWomenEmployees()))

                it("should return 7 elements") {
                    assertEquals(7, result.size)
                }
            }
        }

        describe("When I sum up all the salaries") {
            on("getSalaries") {
                val result = service.getSalaries(employees)

                it("should return 557") {
                    assertEquals(557.0.toFloat(), result)
                }
            }
        }

    }
})