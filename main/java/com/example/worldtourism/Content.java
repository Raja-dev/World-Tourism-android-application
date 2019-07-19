package com.example.worldfoodblogs;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Content extends AppCompatActivity {
    GridView GV;
    String arr[]={"India", "France", " Italy", "United Kingdom", "United States", "China",
            "Egypt", "Brazil"};
    int images[]={R.drawable.india, R.drawable.eiffeltower, R.drawable.venicecanals, R.drawable.stonehenge, R.drawable.statueofliberty, R.drawable.greatwallchina,
            R.drawable.egyptianmuseum, R.drawable.amazonrainforests};
    int backpress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
        getSupportActionBar().hide();

        GV=(GridView) findViewById(R.id.grid_v1);
        final MyAdapter myAdapter= new MyAdapter();
        GV.setAdapter(myAdapter);
        GV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               if(i==0){
                   Intent intent6=new Intent(Content.this, India.class);
                   startActivity(intent6);
                }
                if(i==1){
                    Intent intent6=new Intent(Content.this, France.class);
                    startActivity(intent6);
                }
                if(i==2){
                    Intent intent6=new Intent(Content.this, Italy.class);
                    startActivity(intent6);
                }
                if(i==3){
                    Intent intent6=new Intent(Content.this, UK.class);
                    startActivity(intent6);
                }
                if(i==4){
                    Intent intent6=new Intent(Content.this, US.class);
                    startActivity(intent6);
                }
                if(i==5){
                    Intent intent6=new Intent(Content.this, China.class);
                    startActivity(intent6);
                }
                if(i==6){
                    Intent intent6=new Intent(Content.this, Egypt.class);
                    startActivity(intent6);
                }
                if(i==7){
                    Intent intent6=new Intent(Content.this, Brazil.class);
                    startActivity(intent6);
                }
            }
        });

    }

    private class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return arr.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater inflater= getLayoutInflater();
            view=inflater.inflate(R.layout.grid_content, null);
            ImageView img = (ImageView)view.findViewById(R.id.img);
            TextView text = (TextView)view.findViewById(R.id.text);
            img.setImageResource(images[i]);
            text.setText(arr[i]);
            return view;
        }
    }

    //for backpress exit/logout


    @Override
   public void onBackPressed() {

       // backpress = (backpress + 1);

        //for alert
        AlertDialog.Builder alert = new AlertDialog.Builder(Content.this);
        alert.setTitle("Log Out");
        alert.setMessage("Click here to Log Out");

        //for logout by alert
        alert.setPositiveButton("Log Out", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                  finishAffinity();
                   Intent bp = new Intent(Content.this, LogIn.class);
                    startActivity(bp);
            }
        });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = alert.create();
        alertDialog.show();

        //super.onBackPressed();
    }
}
