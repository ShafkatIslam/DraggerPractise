package com.example.professt.draggerpractise;

import android.app.Application;

import com.example.professt.draggerpractise.dependencyinjection.ApplicationComponent;
import com.example.professt.draggerpractise.dependencyinjection.ApplicationModule;
import com.example.professt.draggerpractise.dependencyinjection.DaggerApplicationComponent;
import com.example.professt.draggerpractise.dependencyinjection.RoomModule;

public class RoomDemoApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .roomModule(new RoomModule(this))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
