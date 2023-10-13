package com.bhagataishwarya430.practical3;

import static com.bhagataishwarya430.practical3.R.id.share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.share);
        TextView tt = findViewById(R.id.mytext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = tt.getText().toString();
                Intent intent  = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,msg);
                intent.setType("text/plain");
                Intent shareIntent = Intent.createChooser(intent,"Share to: ");
                if(shareIntent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(shareIntent);
                }

            }
        });
    }






    }
