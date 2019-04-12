package com.bw.skr.basemvp.kotlin_mvp

import com.bw.skr.kotlin_mvp.base.BasePresenter
import com.bw.skr.kotlin_mvp.bean.RecommendBean
import com.bw.skr.kotlin_retrofit.api.Api
import com.bw.skr.kotlin_retrofit.api.ApiService
import com.bw.skr.kotlin_retrofit.utils.RetrofitManager
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import okhttp3.ResponseBody
import retrofit2.http.Url

class Presenter : BasePresenter<Constanct.View>(), Constanct.Presenter {


    override fun getPresenter(url: String, headerMap: Map<String, Any>, clazz: Class<*>, parms: Map<String, Any>) {
        val apiService = RetrofitManager.INSTANCE.creat(ApiService::class.java)
        apiService.get(url, headerMap, parms)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    val string = it.string()
                    var gson: Gson = Gson()
                    val it1 = gson.fromJson(string, clazz)
                    mView!!.View(it1)
                }

    }

    override fun postPresenter(url: String, headerMap: Map<String, Any>, clazz: Class<*>, parms: Map<String, Any>) {
        val apiService = RetrofitManager.INSTANCE.creat(ApiService::class.java)
        apiService.post(url, headerMap, parms)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    val string = it.string()
                    var gson: Gson = Gson()
                    val it1 = gson.fromJson(string, clazz)
                    mView!!.View(it1)
                }
    }

    override fun putPresenter(url: String, headerMap: Map<String, Any>, clazz: Class<*>, parms: Map<String, Any>) {
        val apiService = RetrofitManager.INSTANCE.creat(ApiService::class.java)
        apiService.post(url, headerMap, parms)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    val string = it.string()
                    var gson: Gson = Gson()
                    val it1 = gson.fromJson(string, clazz)
                    mView!!.View(it1)
                }
    }

    override fun deletePresenter(url: String, headerMap: Map<String, Any>, clazz: Class<*>, parms: Map<String, Any>) {
        val apiService = RetrofitManager.INSTANCE.creat(ApiService::class.java)
        apiService.post(url, headerMap, parms)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    val string = it.string()
                    var gson: Gson = Gson()
                    val it1 = gson.fromJson(string, clazz)
                    mView!!.View(it1)
                }
    }

}