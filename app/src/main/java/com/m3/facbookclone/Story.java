package com.m3.facbookclone;

import android.widget.ImageView;
import android.widget.TextView;

public class Story {
    String story_content;
    String story_img;
    String status_name;

    public Story(String status_name) {
        this.status_name = status_name;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public String getStory_content() {
        return story_content;
    }

    public void setStory_content(String story_content) {
        this.story_content = story_content;
    }

    public String getStory_img() {
        return story_img;
    }

    public void setStory_img(String story_img) {
        this.story_img = story_img;
    }
}

