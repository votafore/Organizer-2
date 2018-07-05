package com.votafore.organizer

import android.app.Activity
import android.os.Bundle
import com.votafore.organizer.system.App
import com.votafore.organizer.system.presenters.ActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class ActivityMain : Activity() {

    @Inject
    lateinit var presenter: ActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as App).activityComponent.inject(this)

        bottom_navigation.setOnNavigationItemSelectedListener(presenter.itemClickListener)
    }
}
