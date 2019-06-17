package cn.edu.swufe.mymusic.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import cn.edu.swufe.mymusic.R;
import cn.edu.swufe.mymusic.activities.AlbumListActivity;

public class MusicGridAdapterSecond extends RecyclerView.Adapter<MusicGridAdapterSecond.ViewHolder>{
    private Context mContext;
    public MusicGridAdapterSecond(Context context){
           mContext=context;
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_grid_music,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        //加载网络图片到IamgeView上
        Glide.with(mContext)
                .load("http://img5.imgtn.bdimg.com/it/u=1617389534,3923952619&fm=26&gp=0.jpg" )
                .into(viewHolder.ivIcon);

        //添加点击事件
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,AlbumListActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivIcon;
        View itemView;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            ivIcon=itemView.findViewById(R.id.iv_icon);
        this.itemView=itemView;
        }
    }
}
