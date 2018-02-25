package com.example.android.hylda_1202154346_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
    RecyclerView recv;
    adapter adp;
    List<list> daftarmineral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //set titlebar jadi Daftar Mineral
        setTitle("Daftar Mineral");

        //membuat array list baru dengan nama daftarmineral
        daftarmineral = new ArrayList<>();
        //mendapat penanganan recycler view
        recv = findViewById(R.id.rvmenu);
        recv.setHasFixedSize(true);
        //kondisi ketika orientasi menjadi landscape
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            //maka akan menampilkan 2 grid
            recv.setLayoutManager(new GridLayoutManager(menu.this, 2));
            //jika orientasi menjadi portrait
        }else {
            //maka akan menampilkan satu grid saja
            recv.setLayoutManager(new GridLayoutManager(menu.this, 1));
        }
        //menjalankan fungsi input data
        inputdata();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            recv.setLayoutManager(new GridLayoutManager(menu.this, 2));
        }else {
            recv.setLayoutManager(new GridLayoutManager(menu.this, 1));
        }
    }

    public void inputdata(){
        daftarmineral.add(new list(R.drawable.ades, "Ades", "Mineral merk Ades. \nAdes adalah merek air mineral dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia"));
        daftarmineral.add(new list(R.drawable.amidis,"Amidis", "Mineral merk Amidis. \nAMIDIS dikenal dengan air minum kesehatan yang diproses melalui sistem distilasi dan banyak yang menggunakannya untk proses penyembuhan juga dirumah sakit"));
        daftarmineral.add(new list(R.drawable.aqua, "Aqua", "Mineral merk Aqua. \nAqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk. Banyak sekali warga indonesia yang menyebut semua merk mineral dengan sebutan Aqua"));
        daftarmineral.add(new list(R.drawable.cleo, "Cleo", "Mineral merk Cleo. \nAir Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001"));
        daftarmineral.add(new list(R.drawable.club, "Club", "Mineral merk Club. \nClub adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk."));
        daftarmineral.add(new list(R.drawable.equil, "Equil", "Mineral merk Equil. \nEquil adalah air mineral anorganik yang di produksi oleh PT Equilindo Asri. Sedang pemilik PT Equilindo Asri adalah Morgen Sutanto. Untuk lokasi industrinya berada di Vila D’Equilibrium, dan pabrik pengemasan Equil terletak di kaki Gunung Salak, Sukabumi, Jawa Barat."));
        daftarmineral.add(new list(R.drawable.evian, "Evian", "Mineral merk Evian. \nEvian adalah air mineral alami berasal dari satu sumber di puncak pegunungan Alpen, Perancis. Setiap tetesnya melewati perjalanan dan proses alam selama 15 tahun sebelum muncul di mata air. Pembentukan mineral terjadi selama proses alami tersebut, melewati lapisan es dan bebatuan, dalam komposisi yang unik. "));
        daftarmineral.add(new list(R.drawable.leminerale, "leMinerale", "Mineral merk leMinerale. \nLe Minerale adalah  air mineral yang dikenal dengan 'ada manis-manisnya' dan berasal dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis."));
        daftarmineral.add(new list(R.drawable.nestle, "Nestle", "Mineral merk Nestle. \nNestlé Pure Life Mineral Water yang berasal dari segala kemurnian mata air pilihan dan diproses secara higienis. Spesifikasi Produk. Jenis Produk: Air Mineral. Isi: 1500ml."));
        daftarmineral.add(new list(R.drawable.pristine, "Pristine", "Mineral merk Pristine. \nPristine adalah air alkali dengan ph 8 yang bermanfaat untuk kesehatan, air minum kemasan praktis dan ekonomis."));
        daftarmineral.add(new list(R.drawable.vit, "Vit", "Mineral merk Vit. \nVIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta."));
        //membuat adapter baru yang menghubungkan kelas ini dengan data yang ingin ditampilkan
        adp = new adapter(this,daftarmineral);
        //menguhubungkan recycler view dengan adapter
        recv.setAdapter(adp);
    }
}
