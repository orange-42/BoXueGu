package cn.edu.gdmec.android.boxuegu.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import cn.edu.gdmec.android.boxuegu.R;

public class SettingActivity extends AppCompatActivity {
   private TextView tv_main_title;
   private TextView tv_back;
   private RelativeLayout rl_title_bar;
   private RelativeLayout rl_modify_psw,rl_security_setting,rl_exit_login;
   public static SettingActivity instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        //设置此界面为竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        instance=this;
        init();
    }
    /*
    *获取界面控件
     */
    private void init(){
        tv_main_title=findViewById(R.id.tv_main_title);
        tv_main_title.setText("设置");
        tv_back=findViewById(R.id.tv_back);
        rl_title_bar=findViewById(R.id.title_bar);
        rl_title_bar.setBackgroundColor(Color.parseColor("#30B4FF"));
        rl_modify_psw=findViewById(R.id.rl_modify_psw);
        rl_security_setting=findViewById(R.id.rl_security_setting);
        rl_exit_login=findViewById(R.id.rl_exit_login);
        tv_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SettingActivity.this.finish();
            }
        });
        //修改密码的点击事件
        rl_modify_psw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(SettingActivity.this,ModifyPswActivity.class);
                startActivity(intent);
                //跳转到修改密码的界面
            }
        });
        //设置密保的点击事件
        rl_security_setting.setOnClickListener(new
        View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SettingActivity.this,FindPswActivity.class);
                intent.putExtra("from","security");
                startActivity(intent);
                //跳转到设置密保的界面
            }
        });
        //退出登录的点击事件
        rl_exit_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(SettingActivity.this,"退出登录成功",
                        Toast.LENGTH_SHORT).show();
                clearLoginStatus();//清楚登录状态和登录时的用户名
                //退出登录成功后把退出成功的状态传递到MainActivity中
                Intent data = new Intent();
                data.putExtra("isLogin",false);
                setResult(RESULT_OK,data);
                SettingActivity.this.finish();
            }
        });
    }
    /*
    *清楚SharedPreferences中的登录状态和登录时的用户名
     */
    private void clearLoginStatus(){
        SharedPreferences sp=getSharedPreferences("LoginInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();//获取编辑器
        editor.putBoolean("isLogin",false); //清楚登录状态
        editor.putString("LoginUserName",""); //清楚用户名
        editor.commit();  //提交修改
    }
}
