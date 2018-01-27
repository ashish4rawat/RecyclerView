package com.technical.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ArrayList<String> names ;
        ArrayList<Integer> images ;
        RecyclerView mRecyclerView;
        RecyclerView.LayoutManager mlayoutManager;
        RecyclerView.Adapter mAdapter;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                names = new ArrayList<>();
                images = new ArrayList<Integer>();
                mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

                for (int i = 0; i < 30; i++) {

                        names.add("See the beauty of Valley of Flowers in Uttarakhand. #BeenThere , #SeenThat, Guys if you want a trip then Ping me");
                        images.add(R.drawable.photography);

                }


                mRecyclerView.setHasFixedSize(true);
                mlayoutManager = new LinearLayoutManager(this);
                mAdapter = new MainAdapter(names,images);
                mRecyclerView.setLayoutManager(mlayoutManager);
                mRecyclerView.setAdapter(mAdapter);





        }
}
