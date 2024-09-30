package com.example.schoolmouv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText username, password;
    private RadioGroup userTypeGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        userTypeGroup = findViewById(R.id.userTypeGroup);
        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String usernameStr = username.getText().toString().trim();
            String passwordStr = password.getText().toString().trim();

            if (usernameStr.isEmpty() || passwordStr.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                return;
            }

            // Vérification du profil
            int selectedId = userTypeGroup.getCheckedRadioButtonId();
            RadioButton selectedRadioButton = findViewById(selectedId);
            String userType = selectedRadioButton.getText().toString();

            if (userType.equals("Parent")) {
                // Rediriger vers l'interface parent
                Intent intent = new Intent(LoginActivity.this, ParentDashboardActivity.class);
                startActivity(intent);
            } else {
                // Rediriger vers l'interface élève
                Intent intent = new Intent(LoginActivity.this, StudentDashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
