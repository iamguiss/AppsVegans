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

        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                        getApplicationContext(),2
        ));
    }
}