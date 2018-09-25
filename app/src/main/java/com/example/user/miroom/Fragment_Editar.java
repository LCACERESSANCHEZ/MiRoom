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
public class Fragment_Editar extends Fragment {
    private EditText etId, etAlumno, etCurso, etNota;
    private Button btnEditar;

    public Fragment_Editar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment__editar, container, false);

        etId = (EditText)view.findViewById(R.id.etId);
        etAlumno = (EditText)view.findViewById(R.id.etAlumno);
        etCurso = (EditText)view.findViewById(R.id.etCurso);
        etNota = (EditText)view.findViewById(R.id.etNota);
        btnEditar = (Button)view.findViewById(R.id.btnEditar);

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = Integer.parseInt(etId.getText().toString());
                String alum = etAlumno.getText().toString();
                String curso = etCurso.getText().toString();
                int nota = Integer.parseInt(etNota.getText().toString());

                Alumno alumno = new Alumno();
                alumno.setId(id);
                alumno.setNombre(alum);
                alumno.setCurso(curso);
                alumno.setNota(nota);

                MainActivity.myAppDataBase.dao_alumno().updateAlumno(alumno);
                Toast.makeText(getActivity(),"EDITADO",Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }

}
