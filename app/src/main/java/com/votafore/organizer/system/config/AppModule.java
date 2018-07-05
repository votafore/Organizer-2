package com.votafore.organizer.system.config;

import com.votafore.organizer.system.App;
import com.votafore.organizer.system.appnavigation.ActivityKeeper;
import com.votafore.organizer.system.appnavigation.PageRouter;
import com.votafore.organizer.system.appnavigation.PageStateKeeper;
import com.votafore.organizer.system.appnavigation.Router;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private App application;

    public AppModule(App app){
        application = app;
    }

    @Provides
    @Singleton
    public Router provideRouter(ActivityKeeper activityKeeper, PageStateKeeper stateKeeper){

        application.registerActivityLifecycleCallbacks(activityKeeper);

        return new PageRouter(activityKeeper, stateKeeper);
    }
}
