package com.example.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("TAG1").setIndicator("강아지");
        tabSpecSong.setContent(R.id.imageView1);
        tabHost.addTab(tabSpecSong);

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("TAG2").setIndicator("고양이");
        tabSpecArtist.setContent(R.id.imageView2);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("TAG3").setIndicator("말");
        tabSpecAlbum.setContent(R.id.imageView3);
        tabHost.addTab(tabSpecAlbum);
    }
}