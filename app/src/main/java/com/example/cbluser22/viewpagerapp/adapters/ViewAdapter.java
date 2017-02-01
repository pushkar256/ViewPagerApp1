package com.example.cbluser22.viewpagerapp.adapters;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cbluser22.viewpagerapp.R;
import com.example.cbluser22.viewpagerapp.model.MyModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser22 on 1/2/17.
 */

public class ViewAdapter extends PagerAdapter {

    List<MyModel> mList=new ArrayList<>();
    Activity activity;

    public  ViewAdapter(Activity activity,List<MyModel> mList)
    {
        this.activity=activity;
        this.mList=mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View) object);

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view= LayoutInflater.from(activity).inflate(R.layout.view_item,container,false);
        TextView tv_Name=(TextView)view.findViewById(R.id.tv_name);
        ImageView iv_Image=(ImageView)view.findViewById(R.id.iv_image);
        container.addView(view);
        tv_Name.setText(mList.get(position).name);
        iv_Image.setImageResource(mList.get(position).image);
        return view;
    }
}
