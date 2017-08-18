package com.varunkumar.recycle_view_demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by varun on 8/18/2017.
 */

public class RowAdapter extends  RecyclerView.Adapter<RowAdapter.RowHolder>{

    Context context;
    List<RowBean> data;
    LayoutInflater inflater;

    public RowAdapter (Context context, List<RowBean> data){

        this.context= context;
        this.data=data;
        inflater= LayoutInflater.from(context);

    }


    @Override
    public RowHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.row,parent,false);
        RowHolder holder= new RowHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RowHolder holder, int position) {

        holder.title.setText(data.get(position).getTitl());
        holder.title.setText(data.get(position).getDiscp());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {

        TextView title,discription;
        public RowHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.title_p);
            discription = (TextView) itemView.findViewById(R.id.disc_p);
        }
    }
}
