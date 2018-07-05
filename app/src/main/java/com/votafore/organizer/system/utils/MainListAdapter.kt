package com.votafore.organizer.system.utils

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.votafore.organizer.R
import kotlinx.android.synthetic.main.item_holder.view.*

class MainListAdapter: RecyclerView.Adapter<MainListAdapter.Holder>() {

    private val list = ArrayList<Item>()

    inner class Item {
        var time = ""
        var imgID = 0
    }

    init {
        list.add(Item().apply {
            time = "7:00"
            imgID = R.drawable.img1
        })
        list.add(Item().apply {
            time = "7:05"
            imgID = R.drawable.img2
        })
        list.add(Item().apply {
            time = "7:10"
            imgID = R.drawable.img3
        })
        list.add(Item().apply {
            time = "7:15"
            imgID = R.drawable.img4
        })
        list.add(Item().apply {
            time = "7:20"
            imgID = R.drawable.img5
        })
        list.add(Item().apply {
            time = "7:50"
            imgID = R.drawable.img6
        })
        list.add(Item().apply {
            time = "12:30"
            imgID = R.drawable.img7
        })
        list.add(Item().apply {
            time = "12:35"
            imgID = R.drawable.img8
        })
        list.add(Item().apply {
            time = "12:40"
            imgID = R.drawable.img9
        })
        list.add(Item().apply {
            time = "13:10"
            imgID = R.drawable.img10
        })
        list.add(Item().apply {
            time = "14:10"
            imgID = R.drawable.img11
        })
        list.add(Item().apply {
            time = "15:10"
            imgID = R.drawable.img12
        })
        list.add(Item().apply {
            time = "16:00"
            imgID = R.drawable.img13
        })
        list.add(Item().apply {
            time = "16:30"
            imgID = R.drawable.img14
        })
        list.add(Item().apply {
            time = "17:30"
            imgID = R.drawable.img15
        })
        list.add(Item().apply {
            time = "18:20"
            imgID = R.drawable.img16
        })
        list.add(Item().apply {
            time = "18:50"
            imgID = R.drawable.img17
        })
        list.add(Item().apply {
            time = "20:30"
            imgID = R.drawable.img18
        })
        list.add(Item().apply {
            time = "21:20"
            imgID = R.drawable.img19
        })
        list.add(Item().apply {
            time = "21:30"
            imgID = R.drawable.img20
        })
        list.add(Item().apply {
            time = "21:45"
            imgID = R.drawable.img2
        })
        list.add(Item().apply {
            time = "22:00"
            imgID = R.drawable.img21
        })
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_holder, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tv_time.text = list.get(position).time
        holder.iv_event.setImageResource(list.get(position).imgID)
    }

    inner class Holder (var item: View): RecyclerView.ViewHolder (item) {
        val tv_time = item.tv_time
        val iv_event = item.event_img
    }
}