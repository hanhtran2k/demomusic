package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMusicTrend, rvRecently;
    private ArrayList<Song> listMusicTrend, listRecently;
    private MusicTrendAdapter musicTrendAdapter;
    private SongAdapter songAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMusicTrend = findViewById(R.id.rvMusicTrend);
        rvRecently = findViewById(R.id.rvRecently);

        listMusicTrend = new ArrayList<>();
        listRecently = new ArrayList<>();

        createMusicTrend();
        musicTrendAdapter = new MusicTrendAdapter(listMusicTrend,this);
        rvMusicTrend.setAdapter(musicTrendAdapter);
        rvMusicTrend.setLayoutManager(new LinearLayoutManager(this));

        createRecently();
        songAdapter =  new SongAdapter(listRecently, this);
        rvRecently.setAdapter(songAdapter);
        rvRecently.setLayoutManager(new LinearLayoutManager(this));
    }
    private void createMusicTrend(){
        listMusicTrend.add(new Song(R.drawable.anh1, "Lemon tree", "Fools Garden"));
        listMusicTrend.add(new Song(R.drawable.anh2, "Lemon tree", "Fools Garden"));
    }

    private void createRecently(){
        listRecently.add(new Song(R.drawable.anh1, "Lemon tree", "Fools Garden"));
        listRecently.add(new Song(R.drawable.anh2, "Lemon tree", "Fools Garden"));
    }
}