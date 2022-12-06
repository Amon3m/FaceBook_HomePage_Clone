package com.m3.facbookclone;

import android.widget.ImageView;
import android.widget.TextView;

public class Posts {
    String name_post;
    String post_image;
    String post_content;

    public String getName_post() {
        return name_post;
    }

    public void setName_post(String name_post) {
        this.name_post = name_post;
    }

    public String getPost_image() {
        return post_image;
    }

    public void setPost_image(String post_image) {
        this.post_image = post_image;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public Posts(String name_post) {
        this.name_post = name_post;
    }
}
