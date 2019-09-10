package cn.test

import com.lm16.mapper.ClaimVoucherDetailMapper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration("classpath:context.xml")
class TestVoucherDetail {

    @Autowired
    private lateinit var itemMapper: ClaimVoucherDetailMapper

    @Test
    fun test(){

        itemMapper.getAll().forEach(::println)

    }

}