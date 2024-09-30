package com.example.schoolmouv;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ParentDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_dashboard);

        TextView parentInfo = findViewById(R.id.parentInfo);
        // Ajouter les informations spécifiques pour les parents, comme les progressions des élèves
        parentInfo.setText("Bienvenue, parent. Vous pouvez consulter les informations de vos élèves ici.");
    }
}
