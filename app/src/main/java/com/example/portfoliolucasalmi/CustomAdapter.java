package com.example.portfoliolucasalmi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    private ListData[] listData;
    private final Context CONTEXT;


    public CustomAdapter(ListData[] listData, Context context) {
        this.listData = listData;
        this.CONTEXT = context;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ListData myListData = listData[position];

        holder.titleView.setText(listData[position].getTitle());
        holder.descriptionView.setText(listData[position].getShortDescription());
        holder.imageView.setImageResource(listData[position].getImgId());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(CONTEXT, myListData.getActivity());
                intent.putExtra("photoArray", myListData.getPhotoArray());
                intent.putExtra("Title", myListData.getTitle());
                intent.putExtra("fullDescription", myListData.getFullDescription());
                intent.putExtra("gitHubLink", myListData.getLink());
                CONTEXT.startActivity(intent);


            }
        });

    }


    @Override
    public int getItemCount() {
        return listData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public LinearLayout linearLayout;
        public TextView titleView;
        public TextView descriptionView;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.titleView = (TextView) itemView.findViewById(R.id.title_text);
            this.descriptionView = (TextView) itemView.findViewById(R.id.description_text);
            this.imageView = (ImageView) itemView.findViewById(R.id.image_box);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linear_layout);

        }
    }
}
