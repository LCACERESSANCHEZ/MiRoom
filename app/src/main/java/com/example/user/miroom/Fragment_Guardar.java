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
public class Fragment_Guardar extends Fragment {

    private EditText id,alumno, curso, nota;
    private Button btnGuardar;

    public Fragment_Guardar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment__guardar, container, false);

        id = (EditText)view.findViewById(R.id.etId);
        alumno = (EditText)view.findViewById(R.id.etAlumno);
        curso = (EditText)view.findViewById(R.id.etCurso);
        nota = (EditText)view.findViewById(R.id.etNota);
        btnGuardar = (Button)view.findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int v_id = Integer.parseInt(id.getText().toString());
                String v_alumno = alumno.getText().toString();
                String v_curso = curso.getText().toString();
                int v_nota = Integer.parseInt(nota.getText().toString());

                Alumno alumno = new Alumno ();
                alumno.setId(v_id);
                alumno.setNombre(v_alumno);
                alumno.setCurso(v_curso);
                alumno.setNota(v_nota);

                MainActivity.myAppDataBase.dao_alumno().addAlumno(alumno);
                Toast.makeText(getActivity(),"Guardado",Toast.LENGTH_SHORT).show();
            }
        });

        return  view;
    }

}
