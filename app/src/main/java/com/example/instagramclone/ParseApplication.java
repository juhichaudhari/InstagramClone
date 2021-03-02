package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("NW0KqBiyUazV1NWTKHxXSSCrAN91IRH4Di9oIayZ")
                .clientKey("pVXHSu6cslXDmYKvzEoxF1IKA808XuhGupCxOWIi")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
