package com.example.brasilturismo.ui.views.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.brasilturismo.R;
import com.example.brasilturismo.ui.interfaces.EstadoOnClick;
import com.example.brasilturismo.ui.model.Estado;


import java.util.List;

public class EstadoAdapter extends RecyclerView.Adapter<EstadoAdapter.ViewHolder> {
        private List<Estado> estadosList;
        private EstadoOnClick listener;

    public EstadoAdapter(List<Estado> estadosList, EstadoOnClick listener) {
        this.estadosList = estadosList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_estado, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Estado estado = estadosList.get(position);
        holder.onBind(estado);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(estado);
            }
        });
    }

    @Override
    public int getItemCount() {
        return estadosList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageEstado;
        private TextView textNomeEstado;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageEstado = itemView.findViewById(R.id.imageViewEstado);
            textNomeEstado = itemView.findViewById(R.id.textNomeEstado);
        }

        public void onBind(Estado estado) {
            Drawable drawable = itemView.getResources().getDrawable(estado.getImagemEstado());
            imageEstado.setImageDrawable(drawable);
            textNomeEstado.setText(estado.getNomeEstado());
        }
    }
}
