package com.example.root.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewdesign = (TextView) findViewById(R.id.textViewdesign);
        TextView textViewpcd = (TextView) findViewById(R.id.textViewpcd);
        Button button2 = (Button) findViewById(R.id.button2);

        TextView tvData1 = (TextView) findViewById(R.id.textView2);
        tvData1.setText(getIntent().getStringExtra("username"));

        textViewdesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openWebPage("http://bse.kemdikbud.go.id/index.php/buku/filters?kategori=buk u_judul&cari=desain");
            }
            });
     }

    private void openWebPage(String s) {
    }
}

