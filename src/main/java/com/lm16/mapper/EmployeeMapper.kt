package com.lm16.mapper

import com.lm16.bean.Employee
import org.springframework.stereotype.Repository

@Repository
interface EmployeeMapper {

    val all: List<Employee>


}
