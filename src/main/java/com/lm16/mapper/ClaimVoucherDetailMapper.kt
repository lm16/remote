package com.lm16.mapper

import com.lm16.bean.ClaimVoucherDetail

interface ClaimVoucherDetailMapper {

    fun create(item: ClaimVoucherDetail)

    fun getAll(): List<ClaimVoucherDetail>
}