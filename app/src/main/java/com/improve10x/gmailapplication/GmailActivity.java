package com.improve10x.gmailapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.improve10x.gmailapplication.databinding.ActivityGmailBinding;

public class GmailActivity extends AppCompatActivity {

    private ActivityGmailBinding binding;
    private GmailItem[] gmailItems;

    private GmailItemsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGmailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Primary");
        createGmailData();
        setAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        binding.gmailRv.setLayoutManager(new LinearLayoutManager(this));
        binding.gmailRv.setAdapter(adapter);
    }

    private void setAdapter() {
        adapter = new GmailItemsAdapter(gmailItems);
    }

    private void createGmailData() {
        gmailItems = new GmailItem[3];
        gmailItems[0] = new GmailItem();
        gmailItems[0].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        gmailItems[0].name = "me,Tom2";
        gmailItems[0].message = "Thank you for being the best team ever!";
        gmailItems[0].description = "were going to miss you too! bearn in t...";
        gmailItems[0].time = "10.14PM";

        gmailItems[1] = new GmailItem();
        gmailItems[1].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        gmailItems[1].name = "me,Tom2";
        gmailItems[1].message = "Thank you for being the best team ever!";
        gmailItems[1].description = "were going to miss you too! bearn in t...";
        gmailItems[1].time = "10.40AM";

        gmailItems[2] = new GmailItem();
        gmailItems[2].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        gmailItems[2].name = "me,Tom2";
        gmailItems[2].message = "Thank you for being the best team ever!";
        gmailItems[2].description = "were going to miss you too! bearn in t...";
        gmailItems[2].time = "10.00AM";
    }
}