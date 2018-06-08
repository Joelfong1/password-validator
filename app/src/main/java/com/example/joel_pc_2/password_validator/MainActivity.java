package com.example.joel_pc_2.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final EditText inputPass = findViewById(R.id.inputPass);
    final TextView validatePass = findViewById(R.id.validatePass);
    final Validator validator = new Validator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button validateButton = findViewById(R.id.validateButton);
        validateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(validator.validate(inputPass.getText().toString()) == 5)
                    validatePass.setText("Password is strong enough!");
                else
                    validatePass.setText("Not Strong!");
            }
        });
    }
}
