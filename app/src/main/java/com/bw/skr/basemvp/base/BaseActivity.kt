package com.bw.skr.kotlin_mvp.base

import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bw.skr.basemvp.net.NetWorkUtils
import com.bw.skr.basemvp.net.NetWorkUtils.Companion.connectionReceiver

abstract class BaseActivity <in V: BaseContract.BaseView,P :BaseContract.BasePresenter<V>> : AppCompatActivity(){

    protected var mPresenter: P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        if (NetWorkUtils.isNetworkAvailable(this)){
            mPresenter = initPresenter()
            mPresenter!!.attachView(this as V)
            initData()
        }
        connectionReceiver = connectionReceiver
        var intentFilter:IntentFilter = IntentFilter()
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION)
        registerReceiver(connectionReceiver,intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(connectionReceiver)
        mPresenter!!.detachView()
    }

    protected abstract fun getLayoutId(): Int
    protected abstract fun initPresenter(): P
    protected abstract fun initData()
}