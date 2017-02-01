package com.ylanarchi.curso3semana2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ylan on 01/02/17.
 */

public class ReciclerViewMascotas extends AppCompatActivity {
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recicler_view_mascotas_limitado_a_5);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarSinEstrella);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Mascota> contactos = cargarMascotas();
        listaContactos = (RecyclerView)findViewById(R.id.rvContactos);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaContactos.setLayoutManager(linearLayoutManager);

        MascotaAdapter adaptador = new MascotaAdapter(contactos);

        listaContactos.setAdapter(adaptador);
    }

    public ArrayList<Mascota> cargarMascotas(){
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        Bundle parametros = getIntent().getExtras();
        for (int i = 0; i < 5;i++){
            mascotas.add(new Mascota(parametros.getString("nombre"+i),parametros.getInt("cantidadDeLikes"+i),parametros.getInt("foto"+i)));
        }
        return mascotas;
    }

    public void inicializarAdaptador(ArrayList<Mascota> mascotas){
        MascotaAdapter adaptador = new MascotaAdapter(mascotas);
    }

}


