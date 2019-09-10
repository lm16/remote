package cn.test

import com.lm16.mapper.EmployeeMapper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration("classpath:context.xml")
class TestEmployee {


    @Autowired
    private val employeeMapper: EmployeeMapper? = null

    @Test
    fun test() {

        println(employeeMapper)

        val list = employeeMapper!!.all

        for (item in list) {
            println(item.toString())
        }

    }

}
