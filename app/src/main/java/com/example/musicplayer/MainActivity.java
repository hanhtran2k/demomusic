package com.example.musicplayer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.musicplayer.model.Song;
import com.example.musicplayer.screen.favorite.favoritefragment.FavoriteFragment;
import com.example.musicplayer.screen.home.homefragment.HomeFragment;
import com.example.musicplayer.screen.music.musicfragment.MusicFragment;
import com.example.musicplayer.screen.notifications.notificationsfragment.NotificationsFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = getSupportActionBar();

        toolbar.setTitle("Discover");
        loadFragment(new HomeFragment());
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull @androidx.annotation.NonNull MenuItem menuItem) {
            Fragment fragment;
            switch (menuItem.getItemId()) {
                case R.id.action_home:
                    toolbar.setTitle("Discover");
                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.action_music:
                    toolbar.setTitle("My Gifts");
                    fragment = new MusicFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.action_favorite:
                    toolbar.setTitle("Cart");
                    fragment = new FavoriteFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.action_notifications:
                    toolbar.setTitle("Profile");
                    fragment = new NotificationsFragment();
                    loadFragment(fragment);
                    return true;
            }

            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flContent, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}