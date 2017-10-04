package com.au

import com.au.model.Employee
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@RunWith(JUnitPlatform::class)
class EmployeeServiceSpec: Spek({
    fun createEmployees() : List<Employee> {
        return listOf(
                Employee("Mike", 27, 100.0.toFloat(), 1),
                Employee("Jordan", 26, 96.0.toFloat(), 2),
                Employee("Nick", 37, 140.0.toFloat(), 3),
                Employee("Sylvie", 31, 120.0.toFloat(), 4),
                Employee("Steph", 28, 100.0.toFloat(), 5)
        )
    }

    describe("Given a list of employees") {
        val employees = createEmployees()
        val service = EmployeeService()

        on("filtered on their age less than 30 yo") {
            val filteredResult = service.getYoungEmployeesOrderedBySalary(employees)
            it("should return 3 employees") {
                println(filteredResult.toString())
                assertEquals(3, filteredResult.size)
                assertTrue { filteredResult.size.compareTo(3) == 0 }
            }
        }
    }
})