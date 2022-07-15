package com.example.magyarul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView list;

    Random randomizer = new Random();

    private final int[] mImages = new int[]{
            R.drawable.noite1,
            R.drawable.ponte,
            R.drawable.cidade,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarouselView carouselView = (CarouselView) findViewById(R.id.carousel_view);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(this::carrouselImageChange);
        
        list = findViewById(R.id.list_item);

        dados();
    }

    private void carrouselImageChange(int position, ImageView imageView) {
        imageView.setImageResource(mImages[position]);
    }

    public void lista(View v){
        dados();
    }

    public void dados(){
        List<String> subjects = new ArrayList<>();
        subjects.add("Hétfo: o´´ - Segunda-Feira");
        subjects.add("Kedd - Terça-Feira");
        subjects.add("Szerda - Quarta-Feira");
        subjects.add("Csutortok:u,o,o.. - Quinta-Feira");
        subjects.add("Péntek - Sexta-Feira");
        subjects.add("Szombat - Sábado");
        subjects.add("Vasárnap - Domingo");
        subjects.add("Nagyon - Muito");
        subjects.add("Gyors - Veloz");
        subjects.add("Konyv:o.. - Livro");
        subjects.add("Nagy - Grande");
        subjects.add("Szék - Cadeira");
        subjects.add("Virág - Flor");
        subjects.add("Tanár - Professor");
        subjects.add("Egyetem - Universidade");
        subjects.add("Ember - Homem");
        subjects.add("Utca - Rua");
        subjects.add("Mi ez - O que é");
        subjects.add("Drága - Caro");
        subjects.add("Ház - Casa");
        subjects.add("Ma - Hoje");
        subjects.add("Mikor - Quando");

        String randomListElement = subjects.get(randomizer.nextInt(subjects.size()));
        list.setText(randomListElement);
    }
}