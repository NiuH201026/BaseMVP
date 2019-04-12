package com.bw.skr.basemvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bw.skr.basemvp.net.NetWorkUtils
import kotlinx.android.synthetic.main.activity_net.*


class NetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net)
        wang.setOnClickListener {
            if (NetWorkUtils.isNetworkAvailable(this@NetActivity)) {
                finish()
            }
        }
    }
}
