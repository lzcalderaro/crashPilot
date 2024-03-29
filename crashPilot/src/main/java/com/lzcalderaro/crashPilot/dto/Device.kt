package com.lzcalderaro.crashpilot.dto

data class Device(
    val model: String = "",
    val manufacturer: String = "",
    val id: String = "",
    val brand: String = "",
    val type: String = "",
    val user: String = "",
    val baseVersion: Int = 0,
    val incrementalVersion: String = "",
    val board: String = "",
    val host: String = "",
    val releaseVersion: String = ""
)
