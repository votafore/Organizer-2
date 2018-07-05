package com.votafore.organizer.system.config;

import com.votafore.organizer.system.App;
import com.votafore.organizer.system.presenters.ActivityPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule  {

    private App mApp;

    public ActivityModule(App app){
        mApp = app;
    }

    @Provides
    @Singleton
    public ActivityPresenter providePresenter(){
        return new ActivityPresenter(mApp.router);
    }
}
