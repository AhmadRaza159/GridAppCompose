package com.example.gridapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val txtBody:Int,
    val txtLabel:Int,
    @DrawableRes val imageSrc:Int
)
