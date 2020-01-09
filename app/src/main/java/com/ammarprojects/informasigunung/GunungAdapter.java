package com.ammarprojects.informasigunung;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GunungAdapter extends RecyclerView.Adapter<GunungAdapter.GunungViewHolder> {
    private ArrayList<Gunung> dataList;
    Context context;

    public GunungAdapter(Context context,ArrayList<Gunung> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public GunungViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.placeitem, parent, false);
        return new GunungViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GunungViewHolder holder, final int position) {
        holder.tvNama.setText(dataList.get(position).getNamaGunung());
        holder.tvLokasi.setText(dataList.get(position).getLokasi());
        holder.ratingGunung.setRating((float)dataList.get(position).getRating());
        holder.tvRating.setText(Float.toString((float) dataList.get(position).getRating()));
        holder.tvUlasan.setText("("+Integer.toString(dataList.get(position).getUlasan())+")");
        holder.imgFoto.setImageResource(dataList.get(position).getFoto());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama", dataList.get(position).getNamaGunung());
                intent.putExtra("lokasi", dataList.get(position).getLokasi());
                intent.putExtra("rating", dataList.get(position).getRating());
                intent.putExtra("ulasan", dataList.get(position).getUlasan());
                intent.putExtra("foto", dataList.get(position).getFoto());
                intent.putExtra("deskripsi", dataList.get(position).getDeskripsi());
                intent.putExtra("ketinggian", dataList.get(position).getKetinggian());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class GunungViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvLokasi, tvRating, tvUlasan;
        RatingBar ratingGunung;
        ImageView imgFoto;
        CardView cardView;

        GunungViewHolder(@NonNull View view) {
            super(view);
            tvNama = view.findViewById(R.id.placename);
            tvLokasi = view.findViewById(R.id.location);
            tvRating = view.findViewById(R.id.ratingText);
            tvUlasan = view.findViewById(R.id.ulasan);
            ratingGunung = view.findViewById(R.id.rating);
            imgFoto = view.findViewById(R.id.placeimage);
            cardView = view.findViewById(R.id.card_list);
        }
    }

}