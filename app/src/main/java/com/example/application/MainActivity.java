package com.example.application;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout drawer;
    ConstraintLayout cons_home,cons_cashpoint,cons_scancode,cons_promotion,cons_myaccount;
    Button btn_home,btn_cashpoint,btn_scancode,btn_promotion,btn_myaccount,btn_home_color,btn_cashpoint_color,btn_scancode_color,btn_promotion_color,btn_myaccount_color;
    TextView text_home,text_cashpoint,text_scancode,text_promotion,text_myaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // cons initilize
        cons_home=findViewById(R.id.cons_home);
        cons_cashpoint=findViewById(R.id.cons_cashpoint);
        cons_scancode=findViewById(R.id.cons_scancode);
        cons_promotion=findViewById(R.id.cons_promotion);
        cons_myaccount=findViewById(R.id.cons_myaccount);

        // btn initilize
        btn_home=findViewById(R.id.btn_home);
        btn_cashpoint=findViewById(R.id.btn_cashpoint);
        btn_scancode=findViewById(R.id.btn_scancode);
        btn_promotion=findViewById(R.id.btn_promotion);
        btn_myaccount=findViewById(R.id.btn_myaccount);

        // text initilize
        text_home=findViewById(R.id.text_home);
        text_cashpoint=findViewById(R.id.text_cashpoint);
        text_scancode=findViewById(R.id.text_scancode);
        text_promotion=findViewById(R.id.text_promotion);
        text_myaccount=findViewById(R.id.text_myaccount);

        // btn coloe
        btn_home_color=findViewById(R.id.btn_home_color);
        btn_cashpoint_color=findViewById(R.id.btn_cashpoint_color);
        btn_scancode_color=findViewById(R.id.btn_scancode_color);
        btn_promotion_color=findViewById(R.id.btn_promotion_color);
        btn_myaccount_color=findViewById(R.id.btn_myaccount_color);

        // onclick
        cons_home.setOnClickListener(MainActivity.this);
        cons_cashpoint.setOnClickListener(MainActivity.this);
        cons_scancode.setOnClickListener(MainActivity.this);
        cons_promotion.setOnClickListener(MainActivity.this);
        cons_myaccount.setOnClickListener(MainActivity.this);

        btn_home.setOnClickListener(MainActivity.this);
        btn_cashpoint.setOnClickListener(MainActivity.this);
        btn_scancode.setOnClickListener(MainActivity.this);
        btn_promotion.setOnClickListener(MainActivity.this);
        btn_myaccount.setOnClickListener(MainActivity.this);



        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }else
        {
            super.onBackPressed();
        }
        super.onBackPressed();
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.cons_home:
                text_home.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_cashpoint.setTextColor(getResources().getColor(R.color.black));
                text_scancode.setTextColor(getResources().getColor(R.color.black));
                text_promotion.setTextColor(getResources().getColor(R.color.black));
                text_myaccount.setTextColor(getResources().getColor(R.color.black));

                btn_home_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.transparent));


                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Home()).commit();
                break;
            case R.id.cons_cashpoint:
                text_cashpoint.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_home.setTextColor(getResources().getColor(R.color.black));
                text_scancode.setTextColor(getResources().getColor(R.color.black));
                text_promotion.setTextColor(getResources().getColor(R.color.black));
                text_myaccount.setTextColor(getResources().getColor(R.color.black));

                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_home_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.transparent));

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Cashpoint()).commit();
                break;
            case R.id.cons_scancode:
                text_scancode.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_cashpoint.setTextColor(getResources().getColor(R.color.black));
                text_home.setTextColor(getResources().getColor(R.color.black));
                text_promotion.setTextColor(getResources().getColor(R.color.black));
                text_myaccount.setTextColor(getResources().getColor(R.color.black));

                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_home_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.transparent));

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Scancode()).commit();
                break;
            case R.id.cons_promotion:
                text_promotion.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_cashpoint.setTextColor(getResources().getColor(R.color.black));
                text_scancode.setTextColor(getResources().getColor(R.color.black));
                text_home.setTextColor(getResources().getColor(R.color.black));
                text_myaccount.setTextColor(getResources().getColor(R.color.black));

                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_home_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.transparent));

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Promotion()).commit();
                break;
            case R.id.cons_myaccount:
                text_myaccount.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_cashpoint.setTextColor(getResources().getColor(R.color.black));
                text_scancode.setTextColor(getResources().getColor(R.color.black));
                text_promotion.setTextColor(getResources().getColor(R.color.black));
                text_home.setTextColor(getResources().getColor(R.color.black));

                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_home_color.setBackgroundColor(getResources().getColor(R.color.transparent));

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Myaccount()).commit();
                break;

            case R.id.btn_home:
                text_home.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_cashpoint.setTextColor(getResources().getColor(R.color.black));
                text_scancode.setTextColor(getResources().getColor(R.color.black));
                text_promotion.setTextColor(getResources().getColor(R.color.black));
                text_myaccount.setTextColor(getResources().getColor(R.color.black));

                btn_home_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.transparent));

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Home()).commit();
                break;
            case R.id.btn_cashpoint:
                text_cashpoint.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_home.setTextColor(getResources().getColor(R.color.black));
                text_scancode.setTextColor(getResources().getColor(R.color.black));
                text_promotion.setTextColor(getResources().getColor(R.color.black));
                text_myaccount.setTextColor(getResources().getColor(R.color.black));

                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_home_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.transparent));

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Cashpoint()).commit();
                break;
            case R.id.btn_scancode:
                text_scancode.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_cashpoint.setTextColor(getResources().getColor(R.color.black));
                text_home.setTextColor(getResources().getColor(R.color.black));
                text_promotion.setTextColor(getResources().getColor(R.color.black));
                text_myaccount.setTextColor(getResources().getColor(R.color.black));

                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_home_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.transparent));

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Scancode()).commit();
                break;
            case R.id.btn_promotion:
                text_promotion.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_cashpoint.setTextColor(getResources().getColor(R.color.black));
                text_scancode.setTextColor(getResources().getColor(R.color.black));
                text_home.setTextColor(getResources().getColor(R.color.black));
                text_myaccount.setTextColor(getResources().getColor(R.color.black));

                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_home_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.transparent));

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Promotion()).commit();
                break;
            case R.id.btn_myaccount:
                text_myaccount.setTextColor(getResources().getColor(R.color.design_default_color_primary));
                text_cashpoint.setTextColor(getResources().getColor(R.color.black));
                text_scancode.setTextColor(getResources().getColor(R.color.black));
                text_promotion.setTextColor(getResources().getColor(R.color.black));
                text_home.setTextColor(getResources().getColor(R.color.black));

                btn_myaccount_color.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary));
                btn_cashpoint_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_scancode_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_promotion_color.setBackgroundColor(getResources().getColor(R.color.transparent));
                btn_home_color.setBackgroundColor(getResources().getColor(R.color.transparent));

                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Fragment_Myaccount()).commit();
                break;

        }
    }
}