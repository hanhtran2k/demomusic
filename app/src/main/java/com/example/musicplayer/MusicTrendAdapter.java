package com.example.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicplayer.model.Song;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MusicTrendAdapter extends RecyclerView.Adapter<MusicTrendAdapter.ViewHolder> {
    private ArrayList<Song> listMusicTrend;
    private Context context;

    public MusicTrendAdapter(ArrayList<Song> listSongs, Context context) {
        this.listMusicTrend = listSongs;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.musictrend_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Song song = listMusicTrend.get(position);
        holder.txtTenBH.setTextContent(song.getTenBH());
        holder.txtCaSi.setTextContent(song.getCaSi());
        holder.imgAnhNen.setImageResource(song.getAnh());
    }

    @Override
    public int getItemCount() {
        return listMusicTrend.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgAnhNen;
        Text txtTenBH;
        Text txtCaSi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnhNen = itemView.findViewById(R.id.imgAnhNen);
            txtTenBH = itemView.findViewById(R.id.txtTenBH);
            txtCaSi = itemView.findViewById(R.id.txtCaSi);
        }
    }
}
