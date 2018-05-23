package com.example.cuihaokai.ui.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.cuihaokai.R;
import com.example.cuihaokai.bean.SainVideoBean;
import com.example.cuihaokai.bean.SatinBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class RvVideoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<SainVideoBean.DataBean> list;
    private Context context;
    private final LayoutInflater inflater;

    public RvVideoAdapter(List<SainVideoBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.rvvideo_item, parent, false);
        RvVideoViewHolder rvVideoViewHolder = new RvVideoViewHolder(view);
        return rvVideoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RvVideoViewHolder rvVideoViewHolder = (RvVideoViewHolder) holder;

        rvVideoViewHolder.img.setImageURI(list.get(position).getProfile_image());
        rvVideoViewHolder.tv_name.setText(list.get(position).getName());
        rvVideoViewHolder.tv_title.setText(list.get(position).getText());
        //加载视频
        rvVideoViewHolder.video_view.setMediaController(new MediaController(context));
        rvVideoViewHolder.video_view.setVideoURI(Uri.parse(list.get(position).getVideouri()));
        rvVideoViewHolder.video_view.start();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class RvVideoViewHolder extends RecyclerView.ViewHolder{
        SimpleDraweeView img;
        TextView tv_name;
        TextView tv_title;
        VideoView video_view;

        public RvVideoViewHolder(View view) {
            super(view);
            this.img = (SimpleDraweeView) view.findViewById(R.id.img);
            this.tv_name = (TextView) view.findViewById(R.id.tv_name);
            this.tv_title = (TextView) view.findViewById(R.id.tv_title);
            this.video_view = (VideoView) view.findViewById(R.id.video_view);
        }
    }
}
