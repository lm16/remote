package com.lm16.bean

import java.util.*

data class ClaimVoucher(

    var id: Int,
    var nextDealSn: String,
    var createSn: String,
    var createTime: Date,
    var event: String,
    var totalAccount: Double,
    var status: String,
    var modifyTime: Date

)