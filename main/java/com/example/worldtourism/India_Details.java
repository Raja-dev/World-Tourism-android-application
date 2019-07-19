package com.example.worldfoodblogs;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class India_Details extends AppCompatActivity {

    TextView intitle;
    ImageView img1;
    TextView indes;
    WebView webView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        //getSupportActionBar().hide();

        intitle=(TextView)findViewById(R.id.details_title);
        indes=(TextView)findViewById(R.id.details_des);
        img1=(ImageView)findViewById(R.id.details_img);
        webView_1 = (WebView)findViewById(R.id.webview);
        Intent india = getIntent();
        String place = india.getStringExtra("Name");
        intitle.setText(place);
        int Image = india.getIntExtra("Image", 0);
        img1.setImageResource(Image);
        String details = india.getStringExtra("Des");
        indes.setText(details);

       webView_1.getSettings().setJavaScriptEnabled(true);

        String html = india.getStringExtra("View");
        webView_1.loadData(html, "text/html", null);

    }

    //for inflate menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== R.id.logout) {
            Toast.makeText(this, "Log Out", Toast.LENGTH_SHORT).show();
            finishAffinity();
            Intent intent = new Intent(India_Details.this, LogIn.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
