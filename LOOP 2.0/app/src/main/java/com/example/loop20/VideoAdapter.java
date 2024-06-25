package com.example.loop20;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<Video> videoList;

    public VideoAdapter(List<Video> videoList){
        this.videoList= videoList;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.each_vid, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        holder.setVideoData(videoList.get(position));
    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{

        VideoView videoView;
        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoView= itemView.findViewById(R.id.videoView);
        }

        public void setVideoData(Video video){
            videoView.setVideoPath(video.getVideoUrl());
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();

                    float videoRatio= mp.getVideoWidth()/(float) mp.getVideoHeight();
                    float screenRatio= videoView.getWidth()/(float) videoView.getHeight();
                    float scale= videoRatio/screenRatio;
                    if(scale>=1f){
                        videoView.setScaleX(scale);
                    }
                    else{
                        videoView.setScaleY(1f/scale);
                    }
                }
            });

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.start();
                }
            });
        }

    }
}
