package com.example.user.miroom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity (tableName = "alumnos")
public class Alumno {

    @PrimaryKey
    private int id;

    @ColumnInfo (name = "alumnos_nombre")
    private String nombre;

    @ColumnInfo (name = "alumnos_curso")
    private String curso;

    @ColumnInfo (name = "alumnos_nota")
    private int nota;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }



}
