package com.bw.skr.basemvp.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.support.v4.content.ContextCompat.startActivity
import com.bw.skr.basemvp.NetActivity
import com.bw.skr.basemvp.net.NetWorkUtils
import java.util.Map

open class JumpActivityUtils {
    /* public static void skipAnotherActivity(Activity activity,
     Class<? extends Activity> cls) {
         Intent intent = new Intent(activity, cls);
         activity.startActivity(intent);
         activity.finish();
     }*/
    companion object {
        var handler: Handler = Handler()
        fun skipAnotherActivity(activity: Activity, clazz: Class<out Activity>) {
            if (NetWorkUtils.isNetworkAvailable(activity)) {
                var dialogprogress: DialogUtils = DialogUtils(activity)
                dialogprogress.showProgressDialog(true, "正在加载数据……")
                handler.postDelayed(object : Runnable {
                    override fun run() {
                        activity.startActivity(Intent(activity, clazz))
                        activity.finish()
                        dialogprogress.dismiss()
                    }

                }, 650)
            } else {
                activity.startActivity(Intent(activity, NetActivity::class.java))
            }
        }

        fun skipValueActivity(activity: Activity,
                              cls: Class<out Activity>,
                              hashMap: HashMap<String, out Any>) {
            if (NetWorkUtils.isNetworkAvailable(activity)) {
                val intent = Intent(activity, cls)
                val iterator = hashMap.entries.iterator()
                while (iterator.hasNext()) {
                    val entry = iterator
                            .next() as Map.Entry<String, Any>
                    val key = entry.key
                    val value = entry.value
                    if (value is String) {
                        intent.putExtra(key, value as String)
                    }
                    if (value is Boolean) {
                        intent.putExtra(key, value as Boolean)
                    }
                    if (value is Int) {
                        intent.putExtra(key, value as Int)
                    }
                    if (value is Float) {
                        intent.putExtra(key, value as Float)
                    }
                    if (value is Double) {
                        intent.putExtra(key, value as Double)
                    }
                }
                activity.startActivity(intent)
            } else {
                activity.startActivity(Intent(activity, NetActivity::class.java))
            }
        }

    }
}
