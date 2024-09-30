package com.example.schoolmouv;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationActivity extends AppCompatActivity {

    private EditText firstName, lastName, email, username, password, studentName, studentGrade;
    private RadioGroup userTypeGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // Initialisation des éléments
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        studentName = findViewById(R.id.studentName);
        studentGrade = findViewById(R.id.studentGrade);
        userTypeGroup = findViewById(R.id.userTypeGroup);
        Button registerButton = findViewById(R.id.registerButton);

        // Logique de l'inscription
        registerButton.setOnClickListener(v -> {
            String firstNameStr = firstName.getText().toString().trim();
            String lastNameStr = lastName.getText().toString().trim();
            String emailStr = email.getText().toString().trim();
            String usernameStr = username.getText().toString().trim();
            String passwordStr = password.getText().toString().trim();
            String studentNameStr = studentName.getText().toString().trim();
            String studentGradeStr = studentGrade.getText().toString().trim();

            // Vérification des entrées
            if (firstNameStr.isEmpty() || lastNameStr.isEmpty() || emailStr.isEmpty() || usernameStr.isEmpty() || passwordStr.isEmpty()) {
                Toast.makeText(RegistrationActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                return;
            }

            // Gestion de l'inscription selon le type d'utilisateur
            int selectedId = userTypeGroup.getCheckedRadioButtonId();
            RadioButton selectedRadioButton = findViewById(selectedId);
            String userType = selectedRadioButton.getText().toString();

            if (userType.equals("Parent")) {
                // Gérer l'inscription du parent, y compris les élèves concernés
                // Ici, vous pouvez ajouter la logique pour envoyer les informations à un serveur ou une base de données.
                // Par exemple, stockez les informations du parent et des élèves.
                Toast.makeText(this, "Inscription du parent réussie !", Toast.LENGTH_SHORT).show();
            } else {
                // Gérer l'inscription de l'élève
                // Ajouter la logique nécessaire pour enregistrer l'élève.
                Toast.makeText(this, "Inscription de l'élève réussie !", Toast.LENGTH_SHORT).show();
            }

            finish();
            // TODO : Envoyer les données à la base de données ou serveur pour stockage et validation
        });
    }
}