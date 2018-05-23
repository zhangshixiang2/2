package com.example.cuihaokai.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cuihaokai.R;
import com.example.cuihaokai.bean.SatinBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class RvImgAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<SatinBean.DataBean> list;
    private Context context;
    private final LayoutInflater inflater;

    public RvImgAdapter(List<SatinBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.rvimg_item, parent, false);
        RvImgViewHolder rvImgViewHolder=new RvImgViewHolder(view);
        return rvImgViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RvImgViewHolder rvImgViewHolder= (RvImgViewHolder) holder;

        rvImgViewHolder.img.setImageURI(list.get(position).getProfile_image());
        rvImgViewHolder.tv_name.setText(list.get(position).getName());
        rvImgViewHolder.tv_title.setText(list.get(position).getText());
        rvImgViewHolder.img2.setImageURI(list.get(position).getImage1());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class RvImgViewHolder extends RecyclerView.ViewHolder{
        SimpleDraweeView img;
        TextView tv_name;
        TextView tv_title;
        SimpleDraweeView img2;

        public RvImgViewHolder(View view) {
            super(view);
            this.img = (SimpleDraweeView) view.findViewById(R.id.img);
            this.tv_name = (TextView) view.findViewById(R.id.tv_name);
            this.tv_title = (TextView) view.findViewById(R.id.tv_title);
            this.img2 = (SimpleDraweeView) view.findViewById(R.id.img2);
        }
    }
}
