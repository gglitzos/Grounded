package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        link = findViewById(R.id.ulink);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinks();
            }
        });
    }

    public void openLinks(){
        Intent intent = new Intent(this, Links.class);
        startActivity(intent);

    }
}
