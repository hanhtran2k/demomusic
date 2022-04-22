package com.example.musicplayer;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicplayer.model.Song;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {
    private RecyclerView rvSongs;
    private ArrayList<Song> listSongs;
    private SongAdapter songAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        rvSongs = findViewById(R.id.rvSongs);
        listSongs = new ArrayList<>();

        createRecently();
        songAdapter = new SongAdapter(listSongs,this);
        rvSongs.setAdapter(songAdapter);
        rvSongs.setLayoutManager(new LinearLayoutManager(this));
    }
    private void createRecently(){
        listSongs.add(new Song(R.drawable.anh, "Kill this love", "Blackpink"));
        listSongs.add(new Song(R.drawable.anh1, "Lemon tree", "Fools Garden"));
        listSongs.add(new Song(R.drawable.anh2, "On the ground", "Rosé-Blackpink"));
        listSongs.add(new Song(R.drawable.anh3, "Wherever you will go", "The Calling"));
        listSongs.add(new Song(R.drawable.anh4, "Say goodbye", "Kim Na Young"));
        listSongs.add(new Song(R.drawable.anh5, "Still life", "Big Bang"));
    }
}
