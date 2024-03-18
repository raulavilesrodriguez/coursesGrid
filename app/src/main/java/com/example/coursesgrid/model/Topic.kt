package com.example.coursesgrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

