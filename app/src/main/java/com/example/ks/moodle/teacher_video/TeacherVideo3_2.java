package com.example.ks.moodle.teacher_video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;

public class TeacherVideo3_2 extends Activity {

    private TextView sun3_2Tv;
    private TextView tan3_2Tv;

    @Override

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_2);

        sun3_2Tv=(TextView)findViewById(R.id.sun3_2);
        tan3_2Tv=(TextView)findViewById(R.id.tan3_2);

        sun3_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_2.this,TeacherVideo3_2_1.class);
                startActivity(intent);
            }
        });

        tan3_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_2.this,TeacherVideo3_2_2.class);
                startActivity(intent);
            }
        });
    }


}
