package com.example.pillassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText name, lastName, email, password;
    private Button submitButton, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inicializar los elementos de la UI
        name = findViewById(R.id.editTextName);
        lastName = findViewById(R.id.editTextLastName);
        email = findViewById(R.id.editTextEmailRegister);
        password = findViewById(R.id.editTextPasswordRegister);
        submitButton = findViewById(R.id.btnSubmitRegister);
        btn_back = findViewById(R.id.btn_Back);

        // Acción del botón de registro
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userLastName = lastName.getText().toString();
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();

                // Validaciones sencillas
                if (userName.isEmpty() || userLastName.isEmpty() || userEmail.isEmpty() || userPassword.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Por favor, llena todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí puedes realizar el registro con Firebase o cualquier otro sistema
                    Toast.makeText(RegisterActivity.this, "Registrando usuario...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
