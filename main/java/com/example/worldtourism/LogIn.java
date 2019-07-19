package com.example.worldfoodblogs;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class LogIn extends AppCompatActivity
{

    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;
    Button login, sign_up;
    EditText e_email, e_pass;

    int backpress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getSupportActionBar().hide();

        e_email=(EditText)findViewById(R.id.Edit_t1);
        e_pass=(EditText)findViewById(R.id.Edit_t2);
        login=(Button)findViewById(R.id.btn_btn);
        sign_up=(Button)findViewById(R.id.btn_btn4);
        openHelper=new MyHelper(this);
        db = openHelper.getReadableDatabase();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e_email.getText().toString();
                String pass = e_pass.getText().toString();

                if (email.equals("")||pass.equals(""))
                {
                    Toast.makeText(LogIn.this,"Please Fillup The Fields",Toast.LENGTH_SHORT).show();
                }
                else {
                cursor = db.rawQuery("SELECT *FROM " + MyHelper.TABLE_NAME + " WHERE " + MyHelper.COL_5 + "=? AND " + MyHelper.COL_4 + "=?", new String[]{email, pass});
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LogIn.this, Content.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Login error", Toast.LENGTH_SHORT).show();
                    }
                 }
                }
            }
        });


        sign_up = (Button) findViewById(R.id.btn_btn4);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(LogIn.this, Registration.class);
                startActivity(intent1);
            }
        });
    }

    //for backpress exit/logout
    @Override
    public void onBackPressed() {
        //for alert
        AlertDialog.Builder alert = new AlertDialog.Builder(LogIn.this);
        alert.setMessage("Click here to Exit");

        //for logout by alert
        alert.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();

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
    }
}
