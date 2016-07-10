package com.gaojunhui.bubble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_bubble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_bubble= (TextView) findViewById(R.id.tv_bubble);
        bubble();
    }
    public void bubble(){
        int arr[]={12,31,4,1,52,123,4,1};
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]<arr[j+1]){
                 temp=arr[j];
                arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        String str="冒泡排序:";
        for (int i=0;i<arr.length;i++){
            str=str+arr[i]+",";
            tv_bubble.setText(str);
        }

    }
}
