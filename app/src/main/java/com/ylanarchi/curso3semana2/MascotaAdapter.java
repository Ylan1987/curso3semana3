package com.ylanarchi.curso3semana2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import java.util.ArrayList;

/**
 * Created by ylan on 01/02/17.
 */
    public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

        public MascotaAdapter(ArrayList<Mascota> mascotas) {
            this.mascotas = mascotas;
        }

        private ArrayList<Mascota> mascotas;

        @Override
        public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
            return new MascotaViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MascotaViewHolder contactoViewHolder, int position) {
            Mascota mascota = mascotas.get(position);
            contactoViewHolder.imgFotoCV.setImageResource(mascota.getFoto());
            contactoViewHolder.tvCantidadDeLikesCV.setText(mascota.getCantidadDeLikes()+"");
            contactoViewHolder.tvNombreCV.setText(mascota.getNombre());
//        contactoViewHolder.imgFotoCV.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        }

        @Override
        public int getItemCount() {
            return mascotas.size();
        }

        public static class MascotaViewHolder extends RecyclerView.ViewHolder{

            private ImageView imgFotoCV;
            private TextView tvNombreCV;
            private TextView tvCantidadDeLikesCV;
            public MascotaViewHolder(View itemView) {
                super(itemView);
                imgFotoCV = (ImageView)itemView.findViewById(R.id.imgFoto);
                tvNombreCV = (TextView)itemView.findViewById(R.id.tvNombre);
                tvCantidadDeLikesCV = (TextView)itemView.findViewById(R.id.tvCantidadDeLikes);
            }
        }
    }
