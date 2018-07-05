package com.votafore.organizer.system

import android.app.Activity
import android.app.Application
import com.votafore.organizer.system.appnavigation.PageRouter
import com.votafore.organizer.system.appnavigation.Router
import com.votafore.organizer.system.config.AppModule
import com.votafore.organizer.system.config.DaggerAppComponent
import com.votafore.organizer.system.helpers.ActivityLifecycleCallbackHelper
import javax.inject.Inject

class App: Application() {

    @Inject
    lateinit var router: Router

    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()

//        val appComponent = DaggerAppComponent.create()

        appComponent.inject(this)

        val activityCallback = object: ActivityLifecycleCallbackHelper() {
            override fun onActivityStarted(activity: Activity?) {



                router.goToPage(PageRouter.PAGE_MAIN)

                unregisterActivityLifecycleCallbacks(this)
            }
        }

        registerActivityLifecycleCallbacks(activityCallback)
    }
}