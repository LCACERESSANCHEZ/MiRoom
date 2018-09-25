package com.example.user.miroom;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public static MyAppDataBase myAppDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragmentContainer,new Fragment_Inicio()).commit();

        myAppDataBase = Room.databaseBuilder(getApplicationContext(), MyAppDataBase.class, "alumnos_db").allowMainThreadQueries().build();
    }
}
