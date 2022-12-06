package com.m3.facbookclone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.viewHolder> {
    List<Story>itemsStory;

    public StoryAdapter(List<Story> itemsStory) {
        this.itemsStory = itemsStory;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //viewHolder>view>infLATER>CONTEXT
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_stories,parent,false);
        viewHolder viewHolder= new viewHolder(view);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Story story= itemsStory.get(position);
        holder.status_name.setText(story.getStatus_name());
    }

    @Override
    public int getItemCount() {
        if (itemsStory==null)return 0;
        return itemsStory.size();
    }

    interface onItemClickListener{
        void onItemClick(int postion,Story story);



    }

    class viewHolder extends RecyclerView.ViewHolder {
        TextView status_name;
        ImageView story_content;
        ImageView story_img;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        status_name=itemView.findViewById(R.id.status_name);
        story_content=itemView.findViewById(R.id.story_content);
        story_img=itemView.findViewById(R.id.story_img);

        }
    }
}
