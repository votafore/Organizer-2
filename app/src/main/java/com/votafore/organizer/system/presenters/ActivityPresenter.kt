package com.votafore.organizer.system.presenters

import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import com.votafore.organizer.R
import com.votafore.organizer.system.appnavigation.PageRouter
import com.votafore.organizer.system.appnavigation.Router

class ActivityPresenter constructor(private val router: Router){

    val itemClickListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.item_main -> router.goToPage(PageRouter.PAGE_MAIN)
            R.id.item_list -> router.goToPage(PageRouter.PAGE_LIST)
            R.id.item_settings -> router.goToPage(PageRouter.PAGE_SETTINGS)
        }

        true
    }
}