package com.example.user.miroom;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database (entities = {Alumno.class}, version = 1)
public abstract class MyAppDataBase extends RoomDatabase{

    public abstract Dao_Alumno dao_alumno();

}
