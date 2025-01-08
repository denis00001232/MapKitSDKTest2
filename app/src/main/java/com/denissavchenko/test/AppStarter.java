package com.denissavchenko.test;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

import com.yandex.mapkit.MapKitFactory;



public class AppStarter extends Application {
    static Handler handler;
    @Override
    public void onCreate() {
        super.onCreate();
        //Инициализация API
        MapKitFactory.setApiKey(KeyAPI.KEY);
        MapKitFactory.initialize(this);
        //Включение сервиса для определения локации в фоновом режиме
        Intent serviceIntent = new Intent(this, LocationService.class);
        startService(serviceIntent);


    }
}
