package com.example.android.inclassassignment11_mengqid;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Maureen_Ding on 4/18/17.
 */

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
        private ArrayList<Student> mDataset;
    Context mContext;

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public static class ViewHolder extends RecyclerView.ViewHolder {
            // each data item is just a string in this case
            public ImageView mProfile;
            public TextView mName;
            public TextView mGender;
            public TextView mYear;

            public ViewHolder(View v) {
                super(v);
                //v: Linear Layout
                mProfile = (ImageView)v.findViewById(R.id.profile);
                mName = (TextView)v.findViewById(R.id.name);
                mGender = (TextView)v.findViewById(R.id.gender);
                mYear = (TextView)v.findViewById(R.id.year);
            }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public MyAdapter(ArrayList<Student> myDataset, Context context) {
            mDataset= myDataset;
            mContext=context;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
            // create a new view
            LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
            // set the view's size, margins, paddings and layout parameters
            //A list of linear layout
            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            String name = mDataset.get(position).getName();
                holder.mName.setText(name);
                holder.mGender.setText(mDataset.get(position).getGender());
                holder.mYear.setText(mDataset.get(position).getYear());

            switch (name){
                case "Boen Li": holder.mProfile.setImageResource(R.drawable.boen);break;
                case "Maureen Ding": holder.mProfile.setImageResource(R.drawable.maureen);break;
                case "Dasheng Zhang": holder.mProfile.setImageResource(R.drawable.dasheng);break;
                case "Yao Chen": holder.mProfile.setImageResource(R.drawable.yao);break;
                case "Mengqi Ding": holder.mProfile.setImageResource(R.drawable.mengqi);break;
                case "Yang Yang": holder.mProfile.setImageResource(R.drawable.yang);break;
                case "Mike": holder.mProfile.setImageResource(R.drawable.mike);break;
                case "Ginger": holder.mProfile.setImageResource(R.drawable.ginger);break;
                case "Cathy Liao": holder.mProfile.setImageResource(R.drawable.cathy);break;
                case "Sean Ma": holder.mProfile.setImageResource(R.drawable.sean);break;
                case "Wanshu Wang": holder.mProfile.setImageResource(R.drawable.wanshu);break;
            }

            holder.mName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, DetailActivity.class);
                    intent.putExtra("A Student", mDataset.get(holder.getAdapterPosition()));
                    mContext.startActivity(intent);
                }
                });
                                            }

                // Return the size of your dataset (invoked by the layout manager)
                @Override
                public int getItemCount() {
                    return mDataset.size();
                }
            }