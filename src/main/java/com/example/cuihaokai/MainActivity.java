package com.example.cuihaokai;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cuihaokai.ui.SatinImgFragment;
import com.example.cuihaokai.ui.SatinVideoFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 图片
     */
    private TextView tv_img;
    /**
     * 视频
     */
    private TextView tv_video;
    private SatinImgFragment satinImgFragment;
    private SatinVideoFragment satinVideoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        satinImgFragment = new SatinImgFragment();
        satinVideoFragment = new SatinVideoFragment();
        //初始化fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,satinImgFragment).commit();
    }

    private void initView() {
        tv_img = (TextView) findViewById(R.id.tv_img);
        tv_img.setOnClickListener(this);
        tv_video = (TextView) findViewById(R.id.tv_video);
        tv_video.setOnClickListener(this);
        tv_img.setTextColor(Color.RED);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_img:
                tv_img.setTextColor(Color.RED);
                tv_video.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,satinImgFragment).commit();
                break;
            case R.id.tv_video:
                tv_img.setTextColor(Color.BLACK);
                tv_video.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,satinVideoFragment).commit();
                break;
        }
    }
}
