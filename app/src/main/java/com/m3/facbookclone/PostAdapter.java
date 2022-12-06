package com.m3.facbookclone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.Viewholder> {
    List<Posts>post_items;

    public PostAdapter(List<Posts> post_items) {
        this.post_items = post_items;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //viewholder >>view>>layinf>>con
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_posts,parent,false);
        Viewholder viewholder=new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Posts posts=post_items.get(position);
        holder.name_post.setText(posts.getName_post());
        if (likeClickListener!=null){
            holder.post_like.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //
                    likeClickListener.onItemClick(holder.getAdapterPosition(),posts);
                }
            });



            if (commentsClickListener!=null){
                holder.post_comment.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        commentsClickListener.onItemClick(holder.getAdapterPosition(),posts);
                    }
                });

                if (shareClickListener!=null){
                    holder.post_share.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            shareClickListener.onItemClick(holder.getAdapterPosition(),posts);
                        }
                    });



                }



            }






        }

    }

    @Override
    public int getItemCount() {
        if(post_items==null)return 0;
        return post_items.size();
    }

    public void setLikeClickListener(onItemClickListener likeClickListener) {
        this.likeClickListener = likeClickListener;
    }

    public void setCommentsClickListener(onItemClickListener commentsClickListener) {
        this.commentsClickListener = commentsClickListener;
    }

    public void setShareClickListener(onItemClickListener shareClickListener) {
        this.shareClickListener = shareClickListener;
    }

    onItemClickListener likeClickListener;
    onItemClickListener commentsClickListener;
    onItemClickListener shareClickListener;

    interface onItemClickListener{
        void onItemClick(int position,Posts posts);


    }

    class Viewholder extends RecyclerView.ViewHolder {
        TextView name_post;
        ImageView post_image;
        ImageView post_content;
        Button post_like;
        Button post_comment;
        Button post_share;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name_post=itemView.findViewById(R.id.name_post);
            post_image=itemView.findViewById(R.id.post_img);
            post_content=itemView.findViewById(R.id.post_content);
            post_like=itemView.findViewById(R.id.like_btn);
            post_comment =itemView.findViewById(R.id.comment_btn);
            post_share=itemView.findViewById(R.id.share_btn);



        }
    }

}
