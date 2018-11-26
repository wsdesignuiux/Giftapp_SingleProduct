package com.wolfsoft.giftapp_singleproduct;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

import adapter.Single_Product_Adapter;
import adapter.ViewpagerAdapter_Single_Product;
import me.relex.circleindicator.CircleIndicator;
import model.Single_Product_Model;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout l1, l2, l3;

    private ViewpagerAdapter_Single_Product viewpagerAdapter_single_product;
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;


    private Single_Product_Adapter single_product_adapter;
    private RecyclerView recyclerView;
    private ArrayList<Single_Product_Model> single_product_modelArrayList;

    Integer imageView1[] = {R.drawable.birthday, R.drawable.birthday2, R.drawable.birthday3};
    String txtprice[] = {"Price", "Price", "Price"};
    String txtproductname[] = {"Product name", "Product name", "Product name"};
    String txtreviews[] = {"(430)", "(430)", "(321)"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);

        l1.setBackground(getResources().getDrawable(R.drawable.rect2));
        l2.setBackground(getResources().getDrawable(R.drawable.rect1));
        l3.setBackground(getResources().getDrawable(R.drawable.rect1));

        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        CircleIndicator circleIndicator = (CircleIndicator) findViewById(R.id.circleindicator);
        viewpagerAdapter_single_product = new ViewpagerAdapter_Single_Product(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapter_single_product);
        circleIndicator.setViewPager(viewPager);
        viewpagerAdapter_single_product.registerDataSetObserver(circleIndicator.getDataSetObserver());

        recyclerView = findViewById(R.id.recyclerview2);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        single_product_modelArrayList = new ArrayList<>();

        for (int i = 0; i < imageView1.length; i++) {
            Single_Product_Model view = new Single_Product_Model(imageView1[i], txtprice[i], txtproductname[i], txtreviews[i]);
            single_product_modelArrayList.add(view);
        }
        single_product_adapter = new Single_Product_Adapter(MainActivity.this, single_product_modelArrayList);
        recyclerView.setAdapter(single_product_adapter);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.l1:

                l1.setBackground(getResources().getDrawable(R.drawable.rect2));
                l2.setBackground(getResources().getDrawable(R.drawable.rect1));
                l3.setBackground(getResources().getDrawable(R.drawable.rect1));
                break;

            case R.id.l2:

                l1.setBackground(getResources().getDrawable(R.drawable.rect1));
                l2.setBackground(getResources().getDrawable(R.drawable.rect2));
                l3.setBackground(getResources().getDrawable(R.drawable.rect1));
                break;

            case R.id.l3:

                l1.setBackground(getResources().getDrawable(R.drawable.rect1));
                l2.setBackground(getResources().getDrawable(R.drawable.rect1));
                l3.setBackground(getResources().getDrawable(R.drawable.rect2));
                break;


        }

    }
}
