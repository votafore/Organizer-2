package com.votafore.organizer.ui.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.votafore.organizer.R

class PageList: PageBase() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val root = inflater!!.inflate(R.layout.fragment_list, container, false)
        return root
    }
}