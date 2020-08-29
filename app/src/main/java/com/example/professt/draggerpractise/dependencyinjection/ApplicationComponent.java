package com.example.professt.draggerpractise.dependencyinjection;

import android.app.Application;

import com.example.professt.draggerpractise.ListFragment;
import com.example.professt.draggerpractise.create.CreateFragment;
import com.example.professt.draggerpractise.detail.DetailFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, RoomModule.class})
public interface ApplicationComponent {

    void inject(ListFragment listFragment);
    void inject(CreateFragment createFragment);
    void inject(DetailFragment detailFragment);

    Application application();

}