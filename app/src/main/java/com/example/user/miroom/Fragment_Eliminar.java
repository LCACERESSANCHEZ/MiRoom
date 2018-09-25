package com.example.user.miroom;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Eliminar extends Fragment {
    private EditText etidEliminar;
    private Button btnEliminar;

    public Fragment_Eliminar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment__eliminar, container, false);

        etidEliminar = (EditText)view.findViewById(R.id.etidEliminar);
        btnEliminar = (Button) view.findViewById(R.id.btnEliminar);

        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = Integer.parseInt(etidEliminar.getText().toString());
                Alumno alumno = new Alumno();
                alumno.setId(id);

                MainActivity.myAppDataBase.dao_alumno().deleteAlumno(alumno);

                Toast.makeText(getActivity(),"Registro Eliminado",Toast.LENGTH_SHORT).show();
                etidEliminar.setText("");
            }
        });


        return view;
    }

}
