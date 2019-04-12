package com.bw.skr.basemvp

import android.content.Intent
import android.widget.Toast
import com.bw.skr.basemvp.kotlin_mvp.Constanct
import com.bw.skr.basemvp.kotlin_mvp.Presenter
import com.bw.skr.basemvp.net.NetWorkUtils
import com.bw.skr.basemvp.utils.JumpActivityUtils
import com.bw.skr.kotlin_mvp.base.BaseActivity
import com.bw.skr.kotlin_mvp.bean.Movie
import com.bw.skr.kotlin_mvp.bean.RecommendBean
import com.bw.skr.kotlin_retrofit.api.Api
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<Constanct.View,Constanct.Presenter>(),Constanct.View {
    override fun View(any: Any) {
      if (any is RecommendBean){
          val result = any.result
          Toast.makeText(this,"${result.size}",Toast.LENGTH_SHORT).show()
      }else if (any is Movie){
          val status = any.status
          Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
      }

    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initPresenter(): Constanct.Presenter {
        return Presenter()
    }

    override fun initData() {
        var headMap:Map<String,Any> = mapOf()
        var parms:Map<String,Any> = mapOf(Pair("page",1), Pair("count",5))
        mPresenter!!.getPresenter(Api.RECOMMENDCINEMA_URL,headMap,RecommendBean::class.java,parms)
        var parms1:Map<String,Any> = mapOf(Pair("commodityId","17"))
        mPresenter!!.getPresenter(Api.MOVIE_URL,headMap,Movie::class.java,parms1)
        btn_click.setOnClickListener {
//            JumpActivityUtils.skipAnotherActivity(this,LoginActivity::class.java)
            var hashMap:HashMap<String,Any> = hashMapOf(Pair("name","牛浩"),Pair("age","1"))
            JumpActivityUtils.skipValueActivity(this,LoginActivity::class.java,hashMap)
        }
    }


}
