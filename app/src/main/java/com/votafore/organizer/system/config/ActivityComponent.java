package com.votafore.organizer.system.config;

import com.votafore.organizer.ActivityMain;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(ActivityMain activity);
}
