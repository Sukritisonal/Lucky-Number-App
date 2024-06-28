package com.example.luckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.text_view);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.edit_text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = editText.getText().toString();

                // Explicit Intent
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                // Passing the name to second Activity
                intent.putExtra("name", userName);
                startActivity(intent);

            }
        });
    }
}