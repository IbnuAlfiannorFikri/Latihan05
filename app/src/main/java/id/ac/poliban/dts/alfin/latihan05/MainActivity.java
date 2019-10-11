package id.ac.poliban.dts.alfin.latihan05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btAjax =findViewById(R.id.btAjax);
        Button btRealmadrid = findViewById(R.id.btRealmadrid);
        Button btFiorentina = findViewById(R.id.btFiorentina);
        
        btAjax.setOnClickListener(v -> Toast.makeText(this, "Hi Ajax", Toast.LENGTH_SHORT).show());
        btRealmadrid.setOnClickListener(v -> Toast.makeText(this, "Hi Realmadrid", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(v -> Toast.makeText(this, "Hi fiorentina", Toast.LENGTH_SHORT).show());
    }
}
