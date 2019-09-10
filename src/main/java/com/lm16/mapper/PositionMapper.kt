package com.lm16.mapper

import com.lm16.bean.Position

interface PositionMapper {

    fun getAll(): List<Position>

}