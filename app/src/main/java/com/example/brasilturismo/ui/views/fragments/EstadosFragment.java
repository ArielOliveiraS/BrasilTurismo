package com.example.brasilturismo.ui.views.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.brasilturismo.R;
import com.example.brasilturismo.ui.interfaces.EstadoOnClick;
import com.example.brasilturismo.ui.model.Estado;
import com.example.brasilturismo.ui.views.activity.DetalheEstado;
import com.example.brasilturismo.ui.views.adapter.EstadoAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EstadosFragment extends Fragment implements EstadoOnClick {
    private RecyclerView recyclerView;
    private EstadoAdapter adapter;
    public static final String ESTADO_KEY = "estado";


    public EstadosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_estados, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewEstados);

        adapter = new EstadoAdapter(exibeEstados(),this);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


    //    Estado estado = getIntent().getExtras().getParcelable(ESTADO_KEY);



        return view;
    }

    private List<Estado> exibeEstados(){
        List<Estado> estadosList = new ArrayList<>();

        estadosList.add(new Estado(R.drawable.acre, "Acre"));
        estadosList.add(new Estado(R.drawable.alagoas, "Alagoas"));
        estadosList.add(new Estado(R.drawable.amapa, "Amapa"));
        estadosList.add(new Estado(R.drawable.amazonas, "Amazonas"));
        estadosList.add(new Estado(R.drawable.bahia, "Bahia"));
        estadosList.add(new Estado(R.drawable.ceara, "Ceará"));
        estadosList.add(new Estado(R.drawable.espiritosanto, "Espírito Santo"));
        estadosList.add(new Estado(R.drawable.goias, "Goiás"));
        estadosList.add(new Estado(R.drawable.maranhao, "Maranhão"));
        estadosList.add(new Estado(R.drawable.matogrosso, "Mato Grosso"));
        estadosList.add(new Estado(R.drawable.matogrossodosul, "Mato Grosso do Sul"));
        estadosList.add(new Estado(R.drawable.minasgerais, "Minas Gerais"));
        estadosList.add(new Estado(R.drawable.para, "Pará"));
        estadosList.add(new Estado(R.drawable.paraiba, "Paraíba"));
        estadosList.add(new Estado(R.drawable.parana, "Paraná"));
        estadosList.add(new Estado(R.drawable.pernambuco, "Pernambuco"));
        estadosList.add(new Estado(R.drawable.piaui, "Piauí"));
        estadosList.add(new Estado(R.drawable.rj, "Rio de Janeiro"));
        estadosList.add(new Estado(R.drawable.riograndedosul, "Rio Grande do Sul"));
        estadosList.add(new Estado(R.drawable.riograndedonorte, "Rio Grande do Norte"));
        estadosList.add(new Estado(R.drawable.rondonia, "Rondônia"));
        estadosList.add(new Estado(R.drawable.roraima, "Roraima"));
        estadosList.add(new Estado(R.drawable.santacatarina, "Santa Catarina"));
        estadosList.add(new Estado(R.drawable.sp, "São Paulo"));
        estadosList.add(new Estado(R.drawable.sergipe, "Sergipe"));
        estadosList.add(new Estado(R.drawable.tocantins, "Tocantins"));


        return estadosList;
    }

    @Override
    public void onClick(Estado estado) {
        Intent intent = new Intent(getContext(), DetalheEstado.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(ESTADO_KEY, estado);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
