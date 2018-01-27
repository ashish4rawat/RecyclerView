package com.technical.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

        ArrayList<String> myNames ;
        ArrayList<Integer> myImages ;

        public MainAdapter(ArrayList<String> names, ArrayList<Integer> images) {
                myNames = names;
                myImages = images;
        }

        @Override
        public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)  {

                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
                return  new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

                holder.singleName.setText(myNames.get(position));
                holder.imageView.setImageResource(myImages.get(position));

        }

        @Override
        public int getItemCount() {
                return myNames.size();
        }


        public class ViewHolder extends RecyclerView.ViewHolder {

                public TextView singleName;
                public ImageView imageView;

                public ViewHolder(View itemView) {

                        super(itemView);
                        singleName  = (TextView) itemView.findViewById(R.id.singleName) ;
                        imageView  = (ImageView) itemView.findViewById(R.id.imageView) ;
                }
        }
}
