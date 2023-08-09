package br.com.etecia.appsvegans;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {
    
    private Context mContexto;

    private List<Filmes> lstFilmes;

    public MyAdapter(Context mContexto, List<Filmes> lstFilmes) {
        this.mContexto = mContexto;
        this.lstFilmes = lstFilmes;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(mContexto);

        view = inflater.inflate(R.layout.modelo_veganos, parent, false);

        return new RecyclerView.ViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.idTituloFilmes.setText((lstFilmes.get(position).getTitulo()));
        holder.idImagemFilmes.setImageResource(lstFilmes.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
    
        TextView idTituloFilmes;
        ImageView idImagemFilmes;
        CardView idCardFilmes;
        public myViewHolder(@NonNull View itemView) {

            super(itemView);
        idTituloFilmes = itemView.findViewById(R.id.idTituloFilmes);
        idImagemFilmes = itemView.findViewById(R.id.idImgFilmes);
            idCardFilmes = itemView.findViewById(R.id.idCardFilmes);


        }
    }




}
