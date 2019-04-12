package com.bw.skr.basemvp.kotlin_mvp

import android.net.Uri
import com.bw.skr.kotlin_mvp.base.BaseContract
import retrofit2.http.Url

class Constanct {
    interface View : BaseContract.BaseView{
        fun View(any: Any)
    }

    interface Presenter : BaseContract.BasePresenter<View>{
        fun getPresenter(uri: String,headerMap: Map<String,Any>,clazz: Class<*>,parms:Map<String,Any>)
        fun postPresenter(uri: String, headerMap: Map<String,Any>, clazz: Class<*>, parms:Map<String,Any>)
        fun putPresenter(uri: String, headerMap: Map<String,Any>, clazz: Class<*>, parms:Map<String,Any>)
        fun deletePresenter(uri: String, headerMap: Map<String,Any>, clazz: Class<*>, parms:Map<String,Any>)
    }
}