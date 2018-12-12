package com.example.ks.moodle.teacher_video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.video.ControllerActivity;

public class TeacherVideo3_3 extends Activity {

    private TextView chen3_3Tv;
    private TextView sun3_3Tv;

    @Override

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_3);

        chen3_3Tv=(TextView)findViewById(R.id.chen3_3);
        sun3_3Tv=(TextView)findViewById(R.id.sun3_3);

        chen3_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_3.this,TeacherVideo3_3_1.class);
                startActivity(intent);
            }
        });
        sun3_3Tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(TeacherVideo3_3.this,TeacherVideo3_3_2.class);
            startActivity(intent);
        }
    });
    }
}
