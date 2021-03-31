package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button = (Button)findViewById(R.id.button1);
        View.OnClickListener listener = new View.OnClickListener() {
          @Override
            public void onClick(View view){
              Intent intent = new Intent(MainActivity3.this, Exam1Activity.class);
              startActivity(intent);
          }
        };
    }
}