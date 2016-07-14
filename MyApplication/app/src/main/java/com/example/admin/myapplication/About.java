package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Admin on 6/7/2559.
 */
public class About extends Activity {
    private Button blak;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        blak = (Button) findViewById(R.id.back);

        Intent intent = this.getIntent();
        final String ID = intent.getStringExtra("ID");
        final int id = intent.getExtras().getInt("id");
        blak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), detailactivity.class);
                intent.putExtra("id", id);
                intent.putExtra("ID", ID);
                startActivity(intent);
                finish();
            }
        });
    }
}
