package com.bw.skr.kotlin_mvp.base

interface BaseContract {

    interface BaseView {

    }

    interface BasePresenter<in T> {
        fun attachView(view: T)
        fun detachView()
    }
}
