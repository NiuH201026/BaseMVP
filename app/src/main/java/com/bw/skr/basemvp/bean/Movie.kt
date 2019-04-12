package com.bw.skr.kotlin_mvp.bean

data class Movie(
    val message: String,
    val result: Result,
    val status: String
)

data class MovieResult(
    val categoryId: String,
    val categoryName: String,
    val commentNum: String,
    val commodityId: String,
    val commodityName: String,
    val describe: String,
    val details: String,
    val picture: String,
    val price: String,
    val saleNum: String,
    val stock: String,
    val weight: String
)