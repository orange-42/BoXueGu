package cn.edu.gdmec.android.boxuegu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by apple on 18/4/24.
 */

public class ViewPagerIndicator extends LinearLayout {
    private int mCount;
    private int mIndex;
    private Context context;
    public ViewPagerIndicator(Context context){
        this(context, null);
    }
    public ViewPagerIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        setGravity(Gravity.CENTER);//设置此布局居中
    }
    /**
     * 设置滑动到当前小圆点的位置
     */
    public void setCurrentPosition(int currentIndex){
        mIndex=currentIndex;
        removeAllViews();
        int pex=5;
        for(int i=0; i<mCount;i++){
            ImageView imageView = new ImageView(context);
            if(mIndex==i){
                imageView.setImageResource(R.drawable.indicator_on);
            }else {
                imageView.setImageResource(R.drawable.indicator_off);
            }
            imageView.setPadding(pex, 0 ,pex, 0);
            addView(imageView);
        }
    }
    /*
    *设置小圆点的数目
     */
    public void setCount(int count){
        this.mCount=count;
    }
}
