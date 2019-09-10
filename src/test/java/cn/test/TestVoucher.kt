package cn.test

import com.lm16.mapper.ClaimVoucherMapper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration("classpath:context.xml")
class TestVoucher {

    @Autowired
    private val claimVoucherMapper: ClaimVoucherMapper? = null

    @Test
    fun test(){

        claimVoucherMapper!!.delete(2)

    }

}