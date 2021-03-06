package com.example.ks.moodle.teacher_video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.video.ControllerActivity;
import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo3_1_3 extends Activity {
    private TextView xuqiudingyiTv;
    private TextView fenlei3_1_3Tv;
    private TextView panduanxuqiuTv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_1_3);

        xuqiudingyiTv=(TextView)findViewById(R.id.xuqiudingyi);
        fenlei3_1_3Tv=(TextView)findViewById(R.id.fenlei3_1_3);
        panduanxuqiuTv=(TextView)findViewById(R.id.panduanxuqiu);

        xuqiudingyiTv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(TeacherVideo3_1_3.this, VideoActivity2.class);
            intent.putExtra("url","http://222.29.159.116/mp4files/102300000163B082/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_02_01_02.mp4");
            startActivity(intent);
        }
        });
        fenlei3_1_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo3_1_3.this, VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_02_01_03.mp4");
                startActivity(intent);
            }
        });


        panduanxuqiuTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo3_1_3.this, VideoActivity2.class);
                intent.putExtra("url","http://222.29.159.119/mp4files/10250000016D72E8/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_02_01_04.mp4");
                startActivity(intent);
            }
        });
    }
}
