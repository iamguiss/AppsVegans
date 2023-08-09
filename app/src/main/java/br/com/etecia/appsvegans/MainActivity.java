package br.com.etecia.appsvegans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;
    RecyclerView idRecyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idListaFilmes);

        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("apocalipse",
                        "Esse filme é uma merda",
                        "comedia",
                        R.drawable.apocalipe));
        listaFilmes.add(
                new Filmes("Desejos",
                        "Esse filme é uma merda",
                        "terror",
                        R.drawable.desejos));
        listaFilmes.add(
                new Filmes("Ponta bala",
                        "Esse filme é uma merda",
                        "romantico",
                        R.drawable.pontabala));
        listaFilmes.add(
                new Filmes("menina",
                        "Esse filme é uma merda",
                        "terror",
                        R.drawable.menina));
        listaFilmes.add(
                new Filmes("?",
                        "Esse filme é uma merda",
                        "interrogação",
                        R.drawable.interrogacao));
        listaFilmes.add(
                new Filmes("2067",
                        "Esse filme é uma merda",
                        "tempo",
                        R.drawable.doismilesessetnaesete));


        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2
        ));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);
    }
}