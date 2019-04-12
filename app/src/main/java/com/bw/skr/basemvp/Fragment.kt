package com.bw.skr.basemvp

import android.view.View
import com.bw.skr.basemvp.kotlin_mvp.Constanct
import com.bw.skr.kotlin_mvp.base.BaseFragment

class Fragment : BaseFragment<Constanct.View,Constanct.Presenter>(),Constanct.View {
    override fun onClick(v: View?) {

    }

    override fun View(any: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutId(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initPresenter(): Constanct.Presenter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}