package com.example.user.miroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface Dao_Alumno {

    @Insert
    public void addAlumno(Alumno alumno);

    @Query("SELECT * FROM alumnos")
    public List<Alumno> getAlumno();

    @Delete
    public void deleteAlumno (Alumno alumno);

    @Update
    public void updateAlumno (Alumno alumno);

}
