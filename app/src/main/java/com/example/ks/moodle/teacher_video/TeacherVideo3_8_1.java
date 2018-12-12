package com.example.ks.moodle.teacher_video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.video.ControllerActivity;
import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo3_8_1 extends Activity {

    private TextView sun3_8_1Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_8_1);

        sun3_8_1Tv=(TextView)findViewById(R.id.sun3_8_1);

        sun3_8_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TeacherVideo3_8_1.this, VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_02_13.mp4");
                startActivity(intent);

            }
        });
    }
}
