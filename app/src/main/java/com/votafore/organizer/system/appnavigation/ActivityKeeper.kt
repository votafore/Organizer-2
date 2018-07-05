package com.votafore.organizer.system.appnavigation

import android.app.Activity
import android.app.FragmentManager
import com.votafore.organizer.system.helpers.ActivityLifecycleCallbackHelper
import javax.inject.Inject


class ActivityKeeper @Inject constructor(): ActivityLifecycleCallbackHelper() {

    var activity: Activity? = null
    var fragmentManager: FragmentManager? = null

    override fun onActivityStarted(activity: Activity?) {

        activity!!.let {
            this.activity = it
            fragmentManager = it.fragmentManager
        }
    }

    override fun onActivityStopped(activity: Activity?) {

        // TODO: check if activity can be stopped but not destroyed
        // check the behavior and possible bugs

        this.activity = null
        fragmentManager = null
    }
}