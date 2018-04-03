package cn.edu.gdmec.android.boxuegu;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RelativeLayout;

import cn.edu.gdmec.android.boxuegu.activity.utils.AnalysisUtils;

public class FragmentMyinfoFragment extends Fragment {

    private LinearLayout llHead;
    private ImageView ivHeadIcon;
    private TextView tvUserName;
    private RelativeLayout rlSetting;
    private ImageView ivUserinfoIcon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_myinfo, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        llHead = (LinearLayout) view.findViewById(R.id.ll_head);
        ivHeadIcon = (ImageView) view.findViewById(R.id.iv_head_icon);
        tvUserName = (TextView) view.findViewById(R.id.tv_user_name);
        rlSetting = (RelativeLayout) view.findViewById(R.id.rl_setting);
        ivUserinfoIcon = (ImageView) view.findViewById(R.id.iv_userinfo_icon);
    }}
      /*  if(AnalysisUtils.readLoginStatus(getActivity())){
            tvUserName.setText(AnalysisUtils.readLoginUserName(getActivity()));
        }else {
            tvUserName.setText("点击登录");
        }
        llHead.setOnClickListener((View.OnClickListener) this);
        rlCourseHistory.setOnclickListener(this);
        rlSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_head:
                if(AnalysisUtils.readLoginStatus(getActivity())){
                    //跳转到个人资料界面
                }else {
                    //跳转到登录界面
                    Intent intent = new Intent(getActivity().loginActivity)

                }
        }
    }
}
*/
