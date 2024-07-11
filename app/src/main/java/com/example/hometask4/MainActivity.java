package com.example.hometask4;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText summ;
    TextView percentValue;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        summ = findViewById(R.id.numberField);
        percentValue = findViewById(R.id.percentValue);
        result = findViewById(R.id.resultField);

        summ.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int temp = Integer.parseInt(summ.getText().toString()) % Integer.parseInt(percentValue.getText().toString());
                result.setText(temp);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

    }
}