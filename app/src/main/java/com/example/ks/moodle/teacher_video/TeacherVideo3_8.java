package com.example.ks.moodle.teacher_video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;

public class TeacherVideo3_8 extends Activity {

    private TextView sun3_8Tv;
    private TextView tan3_8Tv;

    @Override

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_8);;

        sun3_8Tv=(TextView)findViewById(R.id.sun3_8);
        tan3_8Tv=(TextView)findViewById(R.id.tan3_8);

        sun3_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TeacherVideo3_8.this,TeacherVideo3_8_1.class);
                startActivity(intent);

            }
        });

        tan3_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TeacherVideo3_8.this,TeacherVideo3_8_2.class);
                startActivity(intent);

            }
        });
    }
}
