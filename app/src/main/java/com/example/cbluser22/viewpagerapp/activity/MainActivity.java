package com.example.cbluser22.viewpagerapp.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cbluser22.viewpagerapp.R;
import com.example.cbluser22.viewpagerapp.adapters.FragmentsAdapter;
import com.example.cbluser22.viewpagerapp.adapters.ViewAdapter;
import com.example.cbluser22.viewpagerapp.fragments.Fragment1;
import com.example.cbluser22.viewpagerapp.fragments.Fragment2;
import com.example.cbluser22.viewpagerapp.fragments.Fragment3;
import com.example.cbluser22.viewpagerapp.model.MyModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  /*  Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    FragmentManager manager;
    ViewPager viewpager;
    FragmentsAdapter fAdapter;
    List<Fragment> fList=new ArrayList<>();*/

    List<MyModel> mList=new ArrayList<>();
    ViewAdapter viewadapter;
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //manager =getSupportFragmentManager();

        init();
        viewpager.setAdapter(viewadapter);

       // initAdapter();
        //fAdapter=new FragmentsAdapter(getSupportFragmentManager(),fList);
        //viewpager.setAdapter(fAdapter);
    }

    private void initAdapter() {

     /*   fList.add(fragment1);
        fList.add(fragment2);
        fList.add(fragment3);
*/



    }

    private void init() {

       viewpager=(ViewPager)findViewById(R.id.viewpager);
       /* fragment1=new Fragment1();
        fragment2=new Fragment2();
        fragment3=new Fragment3();
*/
        mList.add(new MyModel("Kay Kay",R.drawable.logo_adidas));
        mList.add(new MyModel("Apoorv",R.drawable.logo_adidas));
        mList.add(new MyModel("Rajat",R.drawable.logo_adidas));
        mList.add(new MyModel("Aswani",R.drawable.logo_adidas));
        mList.add(new MyModel("Samarpit",R.drawable.logo_adidas));
        mList.add(new MyModel("Pushkar",R.drawable.logo_adidas));
        mList.add(new MyModel("AB1",R.drawable.logo_adidas));

        viewadapter=new ViewAdapter(this,mList);


    }


}
