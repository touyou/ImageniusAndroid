package com.dev.touyou.imageniusandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

/**
 * Created by touyou on 16/08/08.
 */
class TweetList(context: Context): BaseAdapter() {
    var text: String
    var inflater: LayoutInflater

    init {
        this.text = ""
        this.inflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(p0: Int): Any {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(p0: Int): Long {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}