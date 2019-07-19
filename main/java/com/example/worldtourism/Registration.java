package com.example.worldfoodblogs;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Registration extends AppCompatActivity {

    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button sign_up;
    EditText e_name, e_password, e_cpassword, e_email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        getSupportActionBar().hide();

        openHelper = new MyHelper(this);
        e_name = (EditText)findViewById(R.id.Edit_t3);
        e_password = (EditText)findViewById(R.id.Edit_t4);
        e_cpassword = (EditText)findViewById(R.id.Edit_t5);
        e_email = (EditText)findViewById(R.id.Edit_t6);
        sign_up=(Button)findViewById(R.id.btn_btn2);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db=openHelper.getWritableDatabase();
                String name=e_name.getText().toString();
                String pass=e_password.getText().toString();
                String cpass=e_cpassword.getText().toString();
                String email=e_email.getText().toString();

                if(TextUtils.isEmpty(name) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(cpass) || TextUtils.isEmpty(email)){
                    Toast.makeText(Registration.this,"Empty field",Toast.LENGTH_SHORT).show();
                }
                else if(!pass.equals(cpass)){

                    Toast.makeText(Registration.this,"Password and Confirm Password should be same!",Toast.LENGTH_SHORT).show();
                }
                else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(MyHelper.COL_2, name);
                    contentValues.put(MyHelper.COL_3, pass);
                    contentValues.put(MyHelper.COL_4, cpass);
                    contentValues.put(MyHelper.COL_5, email);
                    long id = db.insert(MyHelper.TABLE_NAME, null, contentValues);
                    Toast.makeText(getApplicationContext(), "register successfully",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Registration.this, LogIn.class);
                    startActivity(intent);
                }

            }
        });
    }
}

