package com.axis.database

import com.axis.modal.Employee

class EmployeeStore {

    var employees= mutableListOf<Employee>()
    init{
        employees.add(Employee(1,"Ayushi",1200,"HR"))
        employees.add(Employee(2,"Sheldon",4500,"TR"))
        employees.add(Employee(3,"Leonard",500,"Product Manager"))


    }

    fun data():MutableList<Employee>{
        return employees
    }
}