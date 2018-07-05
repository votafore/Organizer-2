package com.votafore.organizer.ui.pages

import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.PagerSnapHelper
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.votafore.organizer.R
import com.votafore.organizer.system.utils.MainListAdapter
import kotlinx.android.synthetic.main.fragment_main.view.*


class PageMain: PageBase() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val root = inflater!!.inflate(R.layout.fragment_main, container, false)

        val list = root.list_events.apply {
            layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
            itemAnimator = DefaultItemAnimator()

            // https://www.linkedin.com/pulse/create-viewpager-using-recyclerview-android-ali-ahmed/
            // https://blog.davidmedenjak.com/android/2017/06/24/viewpager-recyclerview.html

            adapter = MainListAdapter()

            // add pager behavior
            val snapHelper = PagerSnapHelper()
            snapHelper.attachToRecyclerView(this)
        }

        return root
    }
}