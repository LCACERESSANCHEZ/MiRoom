package com.example.user.miroom;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AlumnoAdapter extends RecyclerView.Adapter<AlumnoAdapter.ViewHolder> {

    private List<Alumno> alumnoList;

    public AlumnoAdapter(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.alumno_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Alumno alumno = alumnoList.get(position);
        holder.mId.setText(Integer.toString(alumno.getId()));
        holder.mAlumno.setText(alumno.getNombre());
        holder.mCurso.setText(alumno.getCurso());
        holder.mNota.setText(String.valueOf(alumno.getNota()));
    }


    @Override
    public int getItemCount() {
        return alumnoList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mId,mAlumno,mCurso, mNota;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mId = itemView.findViewById(R.id.mId);
            mAlumno = itemView.findViewById(R.id.mAlumno);
            mCurso = itemView.findViewById(R.id.mCurso);
            mNota = itemView.findViewById(R.id.mNota);
        }


    }
}
