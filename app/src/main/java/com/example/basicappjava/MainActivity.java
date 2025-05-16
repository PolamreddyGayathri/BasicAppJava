package com.example.basicappjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameField, passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameField = findViewById(R.id.editTextUsername);
        passwordField = findViewById(R.id.editTextPassword);
    }

    public void onLoginClick(View view) {
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString(); // can be any value

        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra("username", username); // pass username to next screen
        startActivity(intent);
    }

}
