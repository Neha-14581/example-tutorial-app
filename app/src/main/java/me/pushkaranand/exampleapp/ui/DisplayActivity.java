package me.pushkaranand.exampleapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import me.pushkaranand.exampleapp.R;

public class DisplayActivity extends AppCompatActivity
{
    TextView nameDisp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        nameDisp = findViewById(R.id.nameDisp);

        Intent intent = getIntent();

        try
        {

            String name = intent.getStringExtra("NAME");
            nameDisp.setText(name);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Toast.makeText(this, "No name passed", Toast.LENGTH_SHORT).show();
        }

    }
}
