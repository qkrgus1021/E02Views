package net.skhu;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        Button button = (Button) findViewById(R.id.btnSave);
        EditText editText_content = (EditText) findViewById(R.id.editText_content);
        editText_content.setText("내용: 4주차나 5주차에 구현 시험을 봅니다.");
        EditText editText_title = (EditText) findViewById(R.id.editText_title);
        editText_title.setText("제목: 공지사항 입니다.");
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText_title = (EditText) findViewById(R.id.editText_title);
                String title = editText_title.getText().toString();
                if (isEmptyOrWhiteSpace(title))
                    editText_title.setError("제목을 입력하세요");

                EditText editText_content = (EditText) findViewById(R.id.editText_content);
                String content = editText_content.getText().toString();
                if (isEmptyOrWhiteSpace(content))
                    editText_content.setError("내용을 입력하세요");

                // 메모 데이터를 서버에 전송하는 코드를 구현해야 함.

                String msg = "저장 성공: " + title;
                Toast.makeText(MemoActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        };
        button.setOnClickListener(listener);
    }

    static boolean isEmptyOrWhiteSpace(String s) {
        if (s == null) return true;
        return s.toString().trim().length() == 0;
    }
}
