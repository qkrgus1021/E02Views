package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = (Button)findViewById(R.id.button1);
        View.OnClickListener listener = new View.OnClickListener(){
          @Override
          public void onClick(View view){
            EditText editText = (EditText)findViewById(R.id.editText1);
            editText.getText();
          }
        };
        button.setOnClickListener(listener);
    }
}