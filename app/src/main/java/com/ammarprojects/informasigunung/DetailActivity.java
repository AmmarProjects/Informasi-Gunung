package com.ammarprojects.informasigunung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvNama, tvLokasi, tvRating, tvUlasan, tvKetinggian, tvDeskripsi;
    ImageView imgFoto;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.placename);
        tvLokasi = findViewById(R.id.location);
        tvRating = findViewById(R.id.ratingText);
        tvUlasan = findViewById(R.id.ulasan);
        tvKetinggian = findViewById(R.id.ketinggian);
        tvDeskripsi = findViewById(R.id.deskripsi);
        imgFoto = findViewById(R.id.imagedetail);
        ratingBar = findViewById(R.id.rating);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tvNama.setText(extras.getString("nama"));
            tvLokasi.setText(extras.getString("lokasi"));
            tvRating.setText(Float.toString(extras.getFloat("rating")));
            tvUlasan.setText(Integer.toString(extras.getInt("ulasan")));
            tvDeskripsi.setText(extras.getString("deskripsi"));
            tvKetinggian.setText(extras.getString("ketinggian")+ " mdpl");

            ratingBar.setRating(extras.getFloat("rating"));
            imgFoto.setImageResource(extras.getInt("foto"));
        }
    }
}
