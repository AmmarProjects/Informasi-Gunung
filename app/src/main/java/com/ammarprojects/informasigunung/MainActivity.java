package com.ammarprojects.informasigunung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerList;
    RecyclerView.LayoutManager layoutManager;
    private GunungAdapter gunungAdapter;
    ArrayList<Gunung> contentArrayList;
    TextView greetingTV;
    private String greeting = null;
    private String nama = "Ammar";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingTV = findViewById(R.id.greetingTV);
        greeting();
        addData();

        gunungAdapter = new GunungAdapter(MainActivity.this, contentArrayList);

        recyclerList = (RecyclerView) findViewById(R.id.recycler_list);
        contentArrayList = new ArrayList<>();
        layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerList.setLayoutManager(layoutManager);
        recyclerList.setAdapter(gunungAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.account) {
            Intent intent = new Intent(MainActivity.this, AkunActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void greeting(){
        Date dt = new Date();
        int hours = dt.getHours();

        if(hours>=5 && hours<=10){
            greeting = "Selamat Pagi";
        } else if(hours>=10 && hours<15){
            greeting = "Selamat Siang";
        } else if(hours>=15 && hours<18){
            greeting = "Selamat Sore";
        } else if(hours>=18 && hours<=24 || hours>=0 && hours<5){
            greeting = "Selamat Malam";
        }

        greetingTV.setText(greeting + ", " + nama);
    }

    private void addData(){
        contentArrayList = new ArrayList<>();
        contentArrayList.add(new Gunung("Gunung Semeru", "Malang, Jawa Timur", "Gunung Semeru adalah sebuah gunung berapi  di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut (mdpl). Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatra dan Gunung Rinjani di Nusa Tenggara Barat. Kawah di puncak Gunung Semeru dikenal dengan nama Jonggring Saloko. Gunung Semeru secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Malang dan Kabupaten Lumajang, Provinsi Jawa Timur. Gunung ini termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.", R.drawable.semeru, "3676",1581,4.5f));
        contentArrayList.add(new Gunung("Gunung Arjuno", "Malang, Jawa Timur", "Gunung Arjuno adalah sebuah gunung berapi di Jawa Timur, Indonesia dengan ketinggian 3.339 mdpl. Gunung Arjuno secara administratif terletak di perbatasan Kota Batu, Kabupaten Malang, dan Kabupaten Pasuruan dan berada di bawah pengelolaan Taman Hutan Raya Raden Soerjo. Gunung Arjuno merupakan gunung tertinggi kedua di Jawa Timur setelah Gunung Semeru. Biasanya gunung ini dicapai dari tiga titik pendakian yang cukup dikenal yaitu dari Lawang, Tretes dan Batu.", R.drawable.arjuno, "3339", 406, 4.3f));
        contentArrayList.add(new Gunung("Gunung Raung", "Banyuwangi, Jawa Timur", "Gunung Raung adalah gunung berapi yang terletak di ujung timur Pulau Jawa, Indonesia. Secara administratif, kawasan gunung ini termasuk dalam wilayah tiga kabupaten di wilayah Besuki, Jawa Timur, yaitu Banyuwangi, Bondowoso, dan Jember. Secara geografis, lokasi gunung ini berada dalam kawasan kompleks Pegunungan Ijen dan menjadi puncak tertinggi dari gugusan pegunungan tersebut. Dihitung dari titik tertinggi, Terdapat empat titik puncak, yaitu Puncak Bendera, Puncak 17, Puncak Tusuk Gigi, dan, yang tertinggi, Puncak Sejati (3.344 m).", R.drawable.raung, "3332",518,4.2f));
        contentArrayList.add(new Gunung("Gunung Lawu", "Magetan, Jawa Timur", "Gunung Lawu terletak di perbatasan Provinsi Jawa Tengah dan Jawa Timur. Gunung Lawu terletak di antara tiga kabupaten yaitu Kabupaten Karanganyar, Jawa Tengah, Kabupaten Ngawi, dan Kabupaten Magetan, Jawa Timur. Gunung Lawu memiliki tiga puncak, Puncak Hargo Dalem, Hargo Dumiling dan Hargo Dumilah. Yang terakhir ini adalah puncak tertinggi.", R.drawable.lawu, "3265",1318,4.4f));
        contentArrayList.add(new Gunung("Gunung Welirang", "Malang, Jawa Timur", "Gunung Welirang adalah sebuah gunung berapi aktif dengan ketinggian 3.156 mdpl yang secara administratif terletak di perbatasan Kota Batu, Kabupaten Pasuruan, dan Kabupaten Mojokerto, Jawa Timur, Indonesia. Gunung Welirang berada dalam pengelolaan Taman Hutan Raya Raden Soerjo. Gunung Welirang bersebelahan dengan Gunung Arjuno, Gunung Kembar I, dan Gunung Kembar II. Puncak Gunung Welirang terletak pada satu punggungan yang sama dengan puncak gunung Arjuno, sehingga kompleks ini sering disebut juga dengan Arjuno-Welirang.", R.drawable.welirang, "3156",86,4.6f));
        contentArrayList.add(new Gunung("Gunung Argopuro", "Probolinggo, Jawa Timur", "Gunung Argopuro adalah sebuah gunung berapi kompleks yang terdapat di Jawa Timur, Indonesia. Gunung Argopuro mempunyai ketinggian setinggi 3.088 mdpl. Argopuro memiliki trek pendakian terpanjang di Pulau Jawa yaitu sekitar 63 Km. Gunung ini berada dalam wilayah Kabupaten Probolinggo, Kabupaten Lumajang, Kabupaten Jember, Kabupaten Bondowoso, dan Kabupaten Situbondo, dengan puncak Rengganis ada di wilayah Kabupaten Jember.", R.drawable.argopuro, "3088",296,4.2f));
        contentArrayList.add(new Gunung("Gunung Butak", "Malang, Jawa Timur", " Gunung Butak merupakan salah satu gunung di kompleks Pegunungan Kawi yang terhampar di perbatasan Malang dan Blitar. Terdapat empat jalur yang dapat dilewati pendaki untuk mencapai puncak Butak, yakni melalui Gunung Panderman (Malang), melalui Batu (Malang), melalui Perkebunan Teh Sirah Kencong (Blitar) dan melalui Desa Wonosari (Malang).", R.drawable.butak, "3868",214,4.6f));
        contentArrayList.add(new Gunung("Gunung Ijen", "Banyuwangi, Jawa Timur","Gunung Ijen adalah sebuah gunung berapi yang terletak di perbatasan antara Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.386 mdpl dan terletak berdampingan dengan Gunung Marapi. Salah satu fenomena alam yang paling terkenal dari Gunung Ijen adalah blue fire di dalam kawah yang terletak di puncaknya. Pendakian gunung ini bisa dimulai dari dua tempat. Pendaki bisa berangkat dari Banyuwangi ataupun dari Bondowoso.", R.drawable.ijen, "2799",2409,4.7f));
        contentArrayList.add(new Gunung("Gunung Bromo", "Malang, Jawa Timur","Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut (mdpl) dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.", R.drawable.bromo, "2329", 5861,    4.6f));
        contentArrayList.add(new Gunung("Gunung Kelud", "Kediri, Jawa Timur","Gunung kelud merupakan sebuah gunung berapi di Provinsi Jawa Timur, Indonesia, yang tergolong aktif. Gunung ini berada di perbatasan antara Kabupaten Kediri, Kabupaten Blitar, dan Kabupaten Malang, kira-kira 35 km sebelah timur pusat Kota Kediri dan 25 km sebelah utara pusat Kota Blitar.  Puncak Kelud adalah yang tertinggi, berposisi agak di timur laut kawah. Puncak-puncak lainnya adalah Puncak Gajahmungkur di sisi barat dan Puncak Sumbing di sisi selatan.", R.drawable.kelud, "1653", 1583, 4.4f));
    }
}
