package com.votafore.organizer.system.config;

import com.votafore.organizer.system.App;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = AppModule.class)
public interface AppComponent {
    void inject(App application);
}
