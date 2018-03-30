package com.wx.wheelview.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wx.wheelview.adapter.BaseWheelAdapter;

/**
 * @description
 * @auhor niupengkai
 * @time 2018.03.30 10:51
 */

public class MyAdapter extends BaseWheelAdapter<Bean> {
    private Context mContext;

    public MyAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    protected View bindView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.myitem, null);
            viewHolder = new ViewHolder();
            viewHolder.t1 = (TextView) convertView.findViewById(R.id.tv_parking);
            viewHolder.t2 = (TextView) convertView.findViewById(R.id.tv_wagon_num);
            viewHolder.t3 = (TextView) convertView.findViewById(R.id.tv_departure_time);
            viewHolder.t4 = (ImageView) convertView.findViewById(R.id.iv_status);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Bean bean = getItem(position);
        viewHolder.t1.setText(bean.getId());
        viewHolder.t2.setText(bean.getName());
        viewHolder.t3.setText(bean.getTime());
        viewHolder.t4.setImageResource(R.mipmap.ic_launcher);
        return convertView;
    }

    static class ViewHolder {
        private TextView t1;
        private TextView t2;
        private TextView t3;
        private ImageView t4;
    }
}
