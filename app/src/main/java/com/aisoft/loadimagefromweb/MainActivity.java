package com.aisoft.loadimagefromweb;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {



    ImageView img;
    Button btn;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
        btn = findViewById(R.id.btn);


//Picasso Implemention
        Picasso.get()
                .load("https://assets-global.website-files.com/602a4bbeeccd0a59a2d46a59/64f71afdd6d9bec063caf5f9_tatoo-mehendi-designs.png")
                .resize(100, 100)
                .placeholder(R.drawable.internet)
                .centerCrop()
                .into(img);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Picasso.get()
                        .load("https://image.wedmegood.com/resized-nw/600X/wp-content/uploads/2023/08/83412cb055d2e48e60368b24f19b22b9.jpg")
                        .resize(100, 100)
                        .placeholder(R.drawable.internet)
                        .centerCrop()
                        .error(R.drawable.internet)
                        .into(img);


            }
        });



    }
}