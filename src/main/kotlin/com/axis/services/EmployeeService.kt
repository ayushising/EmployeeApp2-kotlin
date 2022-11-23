package com.axis.services

import com.axis.database.EmployeeStore
import com.axis.modal.Employee

class EmployeeService {

    var emploessUtil=EmployeeStore()

    fun viewAllEmployees(){
        var employees=emploessUtil.data()

        for(employee in employees){
            println("${employee.id} | ${employee.name} | ${employee.salary} | ${employee.department}" )

        }

    }

    fun addNewEmployee(employee: Employee):String{

        emploessUtil.data().add(employee)
        return "Successfullly Added!!"
    }






}