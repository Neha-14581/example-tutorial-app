package me.pushkaranand.exampleapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import me.pushkaranand.exampleapp.R;

public class MainActivity extends AppCompatActivity
{
    TextView display;
    EditText name;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        name = findViewById(R.id.user);

        display.setText(getResources().getString(R.string.code));
    }

    public void StartNextActivity(View view)
    {
        String username = name.getText().toString();

        if( !username.isEmpty() || !username.equals(""))
        {
            Toast.makeText(MainActivity.this, username
                    , Toast.LENGTH_LONG).show();


            Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
            intent.putExtra("NAME", username);

            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Enter Something", Toast.LENGTH_SHORT).show();
        }

    }
}
