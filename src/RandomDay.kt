package com.kotlin1.fileOne

import java.util.Random


fun randomDay(): String {
    val day = arrayOf("sun","mon","tue","wed","thu","fri","sat")
    return day[Random().nextInt(day.size)]
}