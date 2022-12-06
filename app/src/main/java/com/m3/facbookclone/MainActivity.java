package com.m3.facbookclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    StoryAdapter storyAdapter;
    PostAdapter postAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1=findViewById(R.id.stories);
        recyclerView2=findViewById(R.id.posts);
        List<Story>data1=creatData1();

        storyAdapter=new StoryAdapter(data1);
        List<Posts>data2=creatData2();
        postAdapter=new PostAdapter(data2);
        recyclerView1.setAdapter(storyAdapter);
        recyclerView2.setAdapter(postAdapter);
        postAdapter.setLikeClickListener(new PostAdapter.onItemClickListener() {
            @Override
            public void onItemClick(int position, Posts posts) {
                Toast.makeText(MainActivity.this, "Like", Toast.LENGTH_SHORT).show();
            }
        });

        postAdapter.setCommentsClickListener(new PostAdapter.onItemClickListener() {
            @Override
            public void onItemClick(int position, Posts posts) {
                Toast.makeText(MainActivity.this, "comment", Toast.LENGTH_SHORT).show();

            }
        });
        postAdapter.setShareClickListener(new PostAdapter.onItemClickListener() {
            @Override
            public void onItemClick(int position, Posts posts) {
                Toast.makeText(MainActivity.this, "share", Toast.LENGTH_SHORT).show();

            }
        });

    }
    List<Story> creatData1 (){

        List<Story>storys=new ArrayList<>();
        storys.add(new Story("batman"));
        storys.add(new Story("superman"));
        storys.add(new Story("aquaman"));
        for (int i=0;i<1000;i++){
            storys.add(new Story("Story"+" "+i));

        }
    return storys;
    }

        List<Posts> creatData2 (){

            List<Posts>posts=new ArrayList<>();
            posts.add(new Posts("batman"));
            posts.add(new Posts("superman"));
            posts.add(new Posts("aquaman"));
            for (int i=0;i<1000;i++){
                posts.add(new Posts("post"+i));

            }
            return posts;
    }
    
    
}