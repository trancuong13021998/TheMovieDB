package com.example.themoviedbapplication.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.bumptech.glide.Glide;
import com.example.themoviedbapplication.R;
import com.example.themoviedbapplication.model.Movie;
import com.example.themoviedbapplication.view.MovieFragment;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ItemHolder> {
    Context context;
    ArrayList<Movie> movieArrayList;

    public MovieAdapter(Context context, ArrayList<Movie> movieArrayList) {
        this.context = context;
        this.movieArrayList = movieArrayList;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dong_movie,parent,false);
        ItemHolder itemHolder = new ItemHolder(v);
        return itemHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        holder.BinData(movieArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return movieArrayList.size();
    }
    public class ItemHolder extends RecyclerView.ViewHolder{
        TextView txtenphim,txtthoigian;
        ImageView imganhphim;
        Movie movie;
        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            txtenphim = (TextView)itemView.findViewById(R.id.txt_ten_phim);
            txtthoigian =(TextView)itemView.findViewById(R.id.txt_thoi_gian_phim);
            imganhphim = (ImageView) itemView.findViewById(R.id.img_hinhanhphim);
        }
        public void BinData(Movie movie){
            this.movie = movie;
            txtthoigian.setText(movie.getThoiluong());
            txtenphim.setText(movie.getTenphim());
            Glide.with(context).load(movie.getAnhphim()).into(imganhphim);
        }
    }
}
