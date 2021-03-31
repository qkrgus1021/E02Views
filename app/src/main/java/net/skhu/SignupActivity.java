package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button button = (Button)this.findViewById(R.id.button);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isError =false;
                EditText editText_loginId = (EditText)SignupActivity.this.findViewById(R.id.editText_loginId);
                String loginId = editText_loginId.getText().toString();
                if (isEmptyOrWhiteSpace(loginId)) {
                    editText_loginId.setError("로그인 아이디를 입력하세요");
                    isError=true;
                }
                EditText editText_password = (EditText)findViewById(R.id.editText_Password);
                String password = editText_password.getText().toString();
                if (isEmptyOrWhiteSpace(password)) {
                    editText_password.setError("비밀번호를 입력하세요");
                    isError=true;
                }
                EditText editText_password2 = (EditText)findViewById(R.id.editText_Password2);
                String password2 = editText_password2.getText().toString();
                if (password.equals(password2) == false) {
                    editText_password2.setError("비밀번호가 일치하지 않습니다");
                    isError=true;
                }
                EditText editText_email = (EditText)findViewById(R.id.editText_EmailAddress);
                String email = editText_email.getText().toString();

                // 회원 가입 데이터를 서버에 전송하는 코드를 구현해야 함.
                if(isError==false) {
                String msg = "회원가입 성공: " + loginId + " " + email;
                Toast.makeText(SignupActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            }
        };
        button.setOnClickListener(listener);
        Button button2 = (Button)this.findViewById(R.id.button2);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this,MemoActivity.class);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(listener2);
    }

    static boolean isEmptyOrWhiteSpace(String s) {
        if (s == null) return true;
        return s.trim().length() == 0;
    }
}
