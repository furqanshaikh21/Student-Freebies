package com.example.myapplication3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Method to open the first website
    public void openWebsite1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/in-edu/store" ));
        startActivity(browserIntent);
    }

    // Method to open the second website
    public void openWebsite2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lenovo.com/in/en/d/students-offer/?orgRef=https%253A%252F%252Ffreeforstudents.org%252F&irclickid=2RQUS6whtxyKRBu2ikTj-W-VUkCx8CVHEzLcWM0&irgwc=1&Program=9634&pid=2032346&acid=ww%3Aaffiliate%3Alx67i4&cid=in%3Aaffiliate%3Afiv7n7"));
        startActivity(browserIntent);
    }

    // Method to open the third website
    public void openWebsite3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/in/offer/student-discount/"));
        startActivity(browserIntent);
    }
    // Method to open the first website
    public void openWebsite4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://aws.amazon.com/education/awseducate/"));
        startActivity(browserIntent);
    }

    // Method to open the second website
    public void openWebsite5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/product/notion-for-education?utm_source=affl&utm_medium=troycooper1364&pscd=affiliate.notion.so&ps_partner_key=dHJveWNvb3BlcjEzNjQ&ps_xid=aeRWhfbdq3aIjz&gsxid=aeRWhfbdq3aIjz&gspk=dHJveWNvb3BlcjEzNjQ"));
        startActivity(browserIntent);
    }

    // Method to open the third website
    public void openWebsite6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com/education/"));
        startActivity(browserIntent);
    }
    // Method to open the third website
    public void openWebsite7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.autodesk.com/education/edu-software/overview"));
        startActivity(browserIntent);
    }
    public void openWebsite8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jetbrains.com/community/education/#students"));
        startActivity(browserIntent);
    }
    public void openWebsite9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/education/students"));
        startActivity(browserIntent);
    }
    public void openWebsite10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.microsoft.com/en-in/education/products/office"));
        startActivity(browserIntent);
    }
    public void openWebsite11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://support.apple.com/en-gb/106008"));
        startActivity(browserIntent);
    }
    public void openWebsite12(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spotify.com/in-en/student/"));
        startActivity(browserIntent);
    }
    public void openWebsite13(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ynab.com/college"));
        startActivity(browserIntent);
    }


    // Add more methods for additional cards if needed
}
