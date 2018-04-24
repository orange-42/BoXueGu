package cn.edu.gdmec.android.boxuegu.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

import cn.edu.gdmec.android.boxuegu.activity.bean.CourseBean;
import cn.edu.gdmec.android.boxuegu.fragment.AdBannerFragment;

/**
 * Created by apple on 18/4/24.
 */

public class AdBannerAdapter extends FragmentStatePagerAdapter implements View.OnTouchListener{
    private Handler mHandler;
    private List<CourseBean> cad1;
    public AdBannerAdapter(FragmentManager fm){
        super(fm);
        cad1=new ArrayList<CourseBean>();
    }
    public AdBannerAdapter(FragmentManager fm,Handler handler){
        super(fm);
        mHandler=handler;
        cad1=new ArrayList<CourseBean>();
    }
    /*
    *设置数据更新界面
     */
    public void setDatas(List<CourseBean> cad1){
        this.cad1=cad1;
        notifyDataSetChanged();
    }
    @Override
    public Fragment getItem(int index) {
        Bundle args=new Bundle();
        if(cad1.size()>0){
            args.putString("ad",cad1.get(index % cad1.size()).icon);
        }
        return AdBannerFragment.newInstance(args);
    }


    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }
    /*
    *返回数据集的真实容量大小
     */
    public int getSize(){
        return cad1==null ? 0 : cad1.size();
    }
    @Override
    public int getItemPosition(Object object){
        //防止刷新结果显示列表时出现的数据。重载这个函数，使之默认返回POSITION_NONE

        return POSITION_NONE;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mHandler.removeMessages(CourseView.MSG_AD_SLID);
        return false;
    }
}
