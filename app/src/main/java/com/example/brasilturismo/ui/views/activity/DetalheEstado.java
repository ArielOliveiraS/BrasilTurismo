package com.example.brasilturismo.ui.views.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brasilturismo.R;

public class DetalheEstado extends AppCompatActivity {
    private ImageView imgBannereEstado;
    private TextView nomeEstado;
    private TextView capitalEstado;
    private TextView destaqueEstado;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_estado);
        initViews();
//        PontoTuristico pontoTuristico = getIntent().getExtras().getParcelable(PONTOTURISTICO_KEY);
//        Drawable drawable = getResources().getDrawable(pontoTuristico.getImgBebida());
//        imgBannereEstado.setImageDrawable(drawable);
//        nomeEstado.setText(pontoTuristico.getNomeEstado());
//
    }


    private void initViews() {
        imgBannereEstado = findViewById(R.id.imageBannerEstado);
        nomeEstado = findViewById(R.id.detalheNomeEstado);
        capitalEstado = findViewById(R.id.detalheCapitalEstado);
        destaqueEstado = findViewById(R.id.detalheDestaqueEstado);
        recyclerView = findViewById(R.id.recyclerViewDetalheEstado);
    }

}