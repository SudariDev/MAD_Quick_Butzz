package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

//import com.example.madd_pharmacyapp.Seller.SellerProductCategoryActivity;
import com.google.firebase.database.DatabaseReference;

public class EditDelivery extends AppCompatActivity {

    private Button btn_confirmDelChange;
    private DatabaseReference DeliveryRef;
    private EditText name2,phone2,addr2,city2;
    private String DeliveryId = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_delivery);
    }
}