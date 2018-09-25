package com.example.user.miroom;


import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Buscar extends Fragment {
    private RecyclerView rvBuscar;
    private List<Alumno> alumnoList;
    private AlumnoAdapter adapter;

    public Fragment_Buscar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment__buscar, container, false);



        alumnoList = MainActivity.myAppDataBase.dao_alumno().getAlumno();
        adapter = new AlumnoAdapter(alumnoList);

        rvBuscar = view.findViewById(R.id.rvBuscar);
        rvBuscar.setLayoutManager(new LinearLayoutManager(getContext()));
        rvBuscar.setHasFixedSize(true);
        rvBuscar.setAdapter(adapter);


        return view;
    }





}
