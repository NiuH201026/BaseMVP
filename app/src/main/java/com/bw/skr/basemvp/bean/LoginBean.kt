package com.bw.skr.kotlin_mvp.bean

data class LoginBean(
    val message: String,
    val result: Result,
    val status: String
)

data class LoginResult(
    val sessionId: String,
    val userId: Int,
    val userInfo: UserInfo
)

data class UserInfo(
    val birthday: Long,
    val headPic: String,
    val id: Int,
    val lastLoginTime: Long,
    val nickName: String,
    val phone: String,
    val sex: Int
)