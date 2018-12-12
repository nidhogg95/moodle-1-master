package com.example.ks.moodle.teacher_video;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import com.example.ks.moodle.R;
        import com.example.ks.moodle.video.ControllerActivity;
        import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo3_3_1 extends Activity {

    private TextView chen3_3_1Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_3_1);

        chen3_3_1Tv=(TextView)findViewById(R.id.chen3_3_1);

        chen3_3_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_3_1.this, VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_02_04.mp4");
                startActivity(intent);
            }
        });
    }
}
