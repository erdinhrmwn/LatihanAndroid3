package com.example.latihanandroid3.Recyclez;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.latihanandroid3.R;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    private List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup view, int i) {
        View itemView = LayoutInflater.from(view.getContext())
                .inflate(R.layout.movie_list, view, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        Movie movie = movieList.get(i);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        public RelativeLayout itemlist;

        public MyViewHolder(@NonNull View v) {
            super(v);
            title = (TextView) v.findViewById(R.id.title);
            genre = (TextView) v.findViewById(R.id.genre);
            year = (TextView) v.findViewById(R.id.year);
            itemlist = (RelativeLayout) v.findViewById(R.id.itemlist);
        }
    }
}
