package cn.test

import com.lm16.mapper.ClaimVoucherMapper
import com.lm16.mapper.EmployeeMapper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration("classpath:context.xml")
class TestEmployeeJava {


    @Autowired
    internal var employeeMapper: EmployeeMapper? = null

    @Autowired
    internal var claimVoucherMapper: ClaimVoucherMapper? = null


    @Test
    fun test() {

        employeeMapper!!.all.forEach(::println)

    }

    @Test
    fun test2(){



    }
}
