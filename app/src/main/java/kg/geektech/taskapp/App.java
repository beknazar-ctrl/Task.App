package kg.geektech.taskapp;

import android.app.Application;


import androidx.room.Room;

import kg.geektech.taskapp.room.AppDatabase;

public class App extends Application {

    private static AppDatabase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        appDatabase = Room.databaseBuilder(this, AppDatabase.class, "database")
                .allowMainThreadQueries()
                .build();
    }

    public static AppDatabase getAppDatabase() {
        return appDatabase;
    }
}
