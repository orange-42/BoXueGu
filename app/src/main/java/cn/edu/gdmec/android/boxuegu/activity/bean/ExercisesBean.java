package cn.edu.gdmec.android.boxuegu.activity.bean;

/**
 * Created by Mr.Zhang on 2018/4/9.
 */

public class ExercisesBean {
    public int id;   //每章习题
    public String title;  //每章习题标题
    public String content; // 每章习题的题目
    public int background; //每章习题边的序号背景
    public int subjectId; //每道习题的Id
    public String subject;   //每道习题的题干
    public String a;  //每道题的A选项
    public String b;  //每道题的B选项
    public String c;   //每道题的C选项
    public String d;   //每道题的D选项
    public int answer; //每道题的正确选项
    /*
    *select为0表示所选项是对的，1表示选中A选项是错的，2表示选中的B选项是错的，
    * 3表示选中的C选项是错的，4表示选中的D是错的
     */
    public int select;
}
