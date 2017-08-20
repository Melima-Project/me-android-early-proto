package me.hda.melima.hdamelme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import me.hda.melima.hdamelme.login.Login;


public class Melme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melme);
        new Login().PerformUserLogin();
        //new GetProduct().PerformGetProduct();
        String authToken = Login.getAuthToken();
        System.out.println("authToken " + authToken);
    }
}

