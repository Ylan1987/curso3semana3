package com.ylanarchi.curso3semana2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listaMascotas;

    private ArrayList<Mascota> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recicler_view_mascotas);



        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        this.mascotas = cargarMascotas();
        listaMascotas = (RecyclerView)findViewById(R.id.rvContactos);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(linearLayoutManager);

        MascotaAdapter adaptador = new MascotaAdapter(mascotas);

        listaMascotas.setAdapter(adaptador);
    }

    public ArrayList<Mascota> cargarMascotas(){
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Catty",0,R.drawable.ben_jones));
        mascotas.add(new Mascota("Chochi",1,R.drawable.descarga));
        mascotas.add(new Mascota("Pacho",2,R.drawable.aa));
        mascotas.add(new Mascota("Jaco",3,R.drawable.aab));
        mascotas.add(new Mascota("Riri",4,R.drawable.aac));
        mascotas.add(new Mascota("Ronny",5,R.drawable.face_recognition));
        mascotas.add(new Mascota("Papi",6,R.drawable.oval_face));
        mascotas.add(new Mascota("Fifar",7,R.drawable.q2_high_health_f));
        mascotas.add(new Mascota("Huesos",8,R.drawable.round_01_before));
        return mascotas;
    }

    public void inicializarAdaptador(ArrayList<Mascota> mascotas){
        MascotaAdapter adaptador = new MascotaAdapter(mascotas);
    }

    public void onClickEstrella(View v){
        Intent intent = new Intent(MainActivity.this, ReciclerViewMascotas.class);
        for (int i = 0; i < 5;i++){
            intent.putExtra("nombre" + i, mascotas.get(i).getNombre() );
            intent.putExtra("cantidadDeLikes" +i, mascotas.get(i).getCantidadDeLikes() );
            intent.putExtra("foto" + i, mascotas.get(i).getFoto() );
          }
        startActivity(intent);
    }
}

