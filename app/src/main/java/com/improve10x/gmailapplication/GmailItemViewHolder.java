package com.improve10x.gmailapplication;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.gmailapplication.databinding.GmailItemsBinding;

public class GmailItemViewHolder extends RecyclerView.ViewHolder {
    GmailItemsBinding binding;

    public GmailItemViewHolder(GmailItemsBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
