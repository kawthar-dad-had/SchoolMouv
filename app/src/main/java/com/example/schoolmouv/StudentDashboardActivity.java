package com.example.schoolmouv;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        TextView studentInfo = findViewById(R.id.studentInfo);
        // Ajouter les informations spécifiques pour les élèves
        studentInfo.setText("Bienvenue, élève. Accédez à vos cours et exercices ici.");
    }
}
