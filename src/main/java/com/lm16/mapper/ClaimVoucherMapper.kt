package com.lm16.mapper

import com.lm16.bean.ClaimVoucher
import org.springframework.stereotype.Repository

@Repository
interface ClaimVoucherMapper {

    fun create(item: ClaimVoucher)

    fun delete(id: Int)
}