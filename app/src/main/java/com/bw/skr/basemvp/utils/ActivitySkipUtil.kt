package com.bw.skr.basemvp.utils

import android.app.Activity
import android.content.Intent

import java.util.HashMap

class ActivitySkipUtil {
   /* init {
        throw UnsupportedOperationException("ActivitySkipUtil不能实例化")
    }

    companion object {

        *//**
         * 功能描述:简单地Activity的跳转(不携带任何数据)
         *
         * @Time 2016年4月25日
         * @Author lizy18
         * @param activity
         * 发起跳转的Activity实例
         * 目标Activity实例
         *//*
        fun skipAnotherActivity(activity: Activity,
                                cls: Class<out Activity>) {
            val intent = Intent(activity, cls)
            activity.startActivity(intent)
            activity.finish()
        }

        *//**
         * 功能描述：带数据的Activity之间的跳转
         *
         * @Time 2016年4月25日
         * @Author lizy18
         * @param activity
         * @param cls
         * @param hashMap
         *//*
        fun skipAnotherActivity(activity: Activity,
                                cls: Class<out Activity>,
                                hashMap: HashMap<String, out Any>) {
            val intent = Intent(activity, cls)
            val iterator = hashMap.entries.iterator()
            while (iterator.hasNext()) {
                val entry = iterator
                        .next() as Entry<String, Any>
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
        }
    }*/


}
