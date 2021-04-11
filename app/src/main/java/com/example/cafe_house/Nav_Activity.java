package com.example.cafe_house;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Nav_Activity extends AppCompatActivity implements  View.OnClickListener {

    private AppBarConfiguration mAppBarConfiguration;
    public CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10;
    public FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_logout)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        card1 =(CardView) findViewById(R.id.firstcardview);
        card2 =(CardView) findViewById(R.id.secondcardview);
        card3 =(CardView) findViewById(R.id.thirdcardview);
        card4 =(CardView) findViewById(R.id.fourthcardview);
        card5 =(CardView) findViewById(R.id.fivthcardview);
        card6 =(CardView) findViewById(R.id.sixthcardview);
        card7 =(CardView) findViewById(R.id.seventhcardview);
        card8 =(CardView) findViewById(R.id.eighthcardview);
        card9 =(CardView) findViewById(R.id.ninecardview);
        card10 =(CardView) findViewById(R.id.tencardview);
        floatingActionButton = findViewById(R.id.fab1);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);
        floatingActionButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.logout){
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),SignIn_Activity.class));
                finish();
                return  true;

        }
        return  super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.firstcardview:
                i = new Intent(this, Order_Screen_Pongal.class);
               startActivity(i);
                break;
            case R.id.secondcardview:
                i = new Intent(this, Order_Screen_Kadhi.class);
                startActivity(i);
                break;
            case R.id.thirdcardview:
                i = new Intent(this, Order_Screen_Modurpulav.class);
                startActivity(i);
                break;
            case R.id.fourthcardview:
                i = new Intent(this, Order_Screen_Biryani.class);
                startActivity(i);
                break;
            case R.id.fivthcardview:
                i = new Intent(this, Order_Screen_Pithla.class);
                startActivity(i);
                break;
            case R.id.sixthcardview:
                i = new Intent(this, Order_Screen_Pooran.class);
                startActivity(i);
                break;
            case R.id.seventhcardview:
                i = new Intent(this, Order_Screen_Dosa.class);
                startActivity(i);
                break;
            case R.id.eighthcardview:
                i = new Intent(this, Order_Screen_Idli.class);
                startActivity(i);
                break;
            case R.id.ninecardview:
                i = new Intent(this, Order_Screen_Misal.class);
                startActivity(i);
                break;
            case R.id.tencardview:
                i = new Intent(this, Order_Screen_Roganjosh.class);
                startActivity(i);
                break;
            case R.id.fab1:
                i = new Intent(this, SummaryActivity.class);
                startActivity(i);
                break;


        }
    }







}