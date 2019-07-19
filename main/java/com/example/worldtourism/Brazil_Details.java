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

public class Brazil_Details extends AppCompatActivity {

    TextView btitle;
    ImageView img8;
    TextView bdes;
    WebView webView_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        //getSupportActionBar().hide();


        btitle=(TextView)findViewById(R.id.details_title);
        bdes=(TextView)findViewById(R.id.details_des);
        img8=(ImageView)findViewById(R.id.details_img);
        webView_8 = (WebView)findViewById(R.id.webview);
        Intent india = getIntent();
        String place = india.getStringExtra("Name");
        btitle.setText(place);
        int Image = india.getIntExtra("Image", 0);
        img8.setImageResource(Image);
        String details = india.getStringExtra("Des");
        bdes.setText(details);

       webView_8.getSettings().setJavaScriptEnabled(true);

        String html = india.getStringExtra("View");
        webView_8.loadData(html, "text/html", null);

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
            Intent intent = new Intent(Brazil_Details.this, LogIn.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
