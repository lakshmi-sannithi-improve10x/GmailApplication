package com.improve10x.gmailapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.gmailapplication.databinding.GmailItemsBinding;
import com.squareup.picasso.Picasso;

public class GmailItemsAdapter extends RecyclerView.Adapter<GmailItemViewHolder> {
    private GmailItem[] items;

    public GmailItemsAdapter(GmailItem[] gmailItems){
        items = gmailItems;
    }

    @NonNull
    @Override
    public GmailItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        GmailItemsBinding binding = GmailItemsBinding.inflate(inflater,parent,false);
        GmailItemViewHolder viewHolder = new GmailItemViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GmailItemViewHolder holder, int position) {
        GmailItem item = items[position];
        holder.binding.nameTxt.setText(item.name);
        holder.binding.messageTxt.setText(item.message);
        holder.binding.descriptionTxt.setText(item.description);
        holder.binding.timeTxt.setText(item.time);
        Picasso.get().load(item.imageUrl).into(holder.binding.imageIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
