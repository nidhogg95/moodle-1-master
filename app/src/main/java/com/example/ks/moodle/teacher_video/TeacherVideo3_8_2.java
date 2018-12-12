package com.example.ks.moodle.teacher_video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.video.ControllerActivity;
import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo3_8_2 extends Activity {

    private TextView tan3_8_1Tv;
    private TextView tan3_8_2Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_8_2);

        tan3_8_1Tv=(TextView)findViewById(R.id.tan3_8_1);
        tan3_8_2Tv=(TextView)findViewById(R.id.tan3_8_2);

        tan3_8_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_8_2.this, VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_03_01_01.mp4");
                startActivity(intent);
            }
        });

        tan3_8_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_8_2.this,VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_03_01_02.mp4");
                startActivity(intent);
            }
        });

    }
}
