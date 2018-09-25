package com.example.user.miroom;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Inicio extends Fragment {

    private Button btnIrGuardar, btnVer, btnEliminar, btnEditar;

    public Fragment_Inicio() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment__inicio, container, false);

        btnIrGuardar = (Button)view.findViewById(R.id.btnIrGuardar);
        btnVer = (Button)view.findViewById(R.id.btnVer);
        btnEliminar = (Button)view.findViewById(R.id.btnEliminar);
        btnEditar = (Button)view.findViewById(R.id.btnEditar);

        btnIrGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new Fragment_Guardar()).addToBackStack(null).commit();
            }
        });

        btnVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new Fragment_Buscar()).addToBackStack(null).commit();
            }
        });

        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new Fragment_Eliminar()).addToBackStack(null).commit();
            }
        });


        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,new Fragment_Editar()).addToBackStack(null).commit();
            }
        });

        return view;
    }

}
