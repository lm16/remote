package com.lm16.service.impl


import com.lm16.bean.Employee
import com.lm16.mapper.EmployeeMapper
import com.lm16.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl : EmployeeService {

    @Autowired
    private val employeeMapper: EmployeeMapper? = null

    override fun getAll(): List<Employee> {
        return employeeMapper!!.all
    }
}
