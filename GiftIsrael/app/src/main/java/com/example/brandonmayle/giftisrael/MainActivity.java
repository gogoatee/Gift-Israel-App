package com.example.brandonmayle.giftisrael;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_main, menu);
//        return true;
//    }

    public void popToRecordActivity(View view) {
        Intent intent1 = new Intent(this, RecordActivity.class);
        startActivity(intent1);
    }

    public void popToSearchActivity(View view) {
        Intent intent2 = new Intent(this, SearchActivity.class);
        startActivity(intent2);
    }

    public void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent WebView = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(WebView);
    }

    public void facebookButton(View view) {
        goToUrl("http://facebook.com/GIFTIsraelCharity");
    }

    public void twitterButton(View view) {
        goToUrl("http://twitter.com/GIFTCharity");
    }

    public void instagramButton(View view) {
        goToUrl("http://instagram.com/giftcharity");
    }

    public void youtubeButton(View view) {
        goToUrl("http://youtube.com/user/JGiftTV");
    }

    public void websiteButton(View view) {
        goToUrl("http://jgift.org/");
    }

    public void logOut() {
        Intent intent3 = new Intent(this, SignInActivity.class);
        startActivity(intent3);
    }
}
