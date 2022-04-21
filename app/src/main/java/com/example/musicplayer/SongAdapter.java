package com.example.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private ArrayList<Song> listSongs;
    private Context context;

    public SongAdapter(ArrayList<Song> listSongs, Context context) {
        this.listSongs = listSongs;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.song_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Song song = listSongs.get(position);
        holder.txtSong.setTextContent(song.getTenBH());
        holder.txtSinger.setTextContent(song.getCaSi());
        holder.imgAnh.setImageResource(song.getAnh());
    }

    @Override
    public int getItemCount() {
        return listSongs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgAnh;
        Text txtSong;
        Text txtSinger;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnh = itemView.findViewById(R.id.imgAnh);
            txtSong = itemView.findViewById(R.id.txtSong);
            txtSinger = itemView.findViewById(R.id.txtSinger);
        }
    }
}
