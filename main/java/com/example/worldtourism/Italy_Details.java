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

public class Italy_Details extends AppCompatActivity {

    TextView ittitle;
    ImageView img3;
    TextView itdes;
    WebView webView_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        //getSupportActionBar().hide();


        ittitle=(TextView)findViewById(R.id.details_title);
        itdes=(TextView)findViewById(R.id.details_des);
        img3=(ImageView)findViewById(R.id.details_img);
        webView_3 = (WebView)findViewById(R.id.webview);
        Intent india = getIntent();
        String place = india.getStringExtra("Name");
        ittitle.setText(place);
        int Image = india.getIntExtra("Image", 0);
        img3.setImageResource(Image);
        String details = india.getStringExtra("Des");
        itdes.setText(details);

       webView_3.getSettings().setJavaScriptEnabled(true);

        String html = india.getStringExtra("View");
        webView_3.loadData(html, "text/html", null);

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
            Intent intent = new Intent(Italy_Details.this, LogIn.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
