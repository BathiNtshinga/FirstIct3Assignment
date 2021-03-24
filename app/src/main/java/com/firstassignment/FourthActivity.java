package com.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FourthActivity extends AppCompatActivity {

    String description = "Passing Messages from Third Activity ";
    EditText editText;
    Button btn = (Button) findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        editText= (EditText) findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String namevalue = editText.getText().toString();
                Intent intent = new Intent(FourthActivity.this, FifthActivity.class);
                intent.putExtra("Name",namevalue);
                startActivity(intent);
            }
        });
    }
}