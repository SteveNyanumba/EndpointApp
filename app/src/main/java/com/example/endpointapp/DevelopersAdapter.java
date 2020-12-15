package com.example.endpointapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DevelopersAdapter extends RecyclerView.Adapter<DevelopersAdapter.ViewHolder> {

    private List<DeveloperList> developerList;
    private Context mContext;

    public DevelopersAdapter(List<DeveloperList>developerList, Context context){
        this.developerList = developerList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        
    }

    @Override
    public int getItemCount() {
        return developerList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView login;
        public TextView html_url;
        public ImageView avatar_url;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            login = itemView.findViewById(R.id.username);
            avatar_url = itemView.findViewById(R.id.imageView);
            html_url = itemView.findViewById(R.id.html_url);
            linearLayout = itemView.findViewById(R.id.linear_layout);
        }
    }
}
