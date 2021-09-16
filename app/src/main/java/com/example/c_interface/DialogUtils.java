package com.example.c_interface;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class DialogUtils {
    private Context mContent;
    private View mLayoutView;

    private Button btn1,btn2;
    private OnClickListenr onClickListenr;


    public DialogUtils(Context context){
        this.mContent = context;
        mLayoutView = LayoutInflater.from(mContent).inflate(R.layout.dialog,null);

        init(mLayoutView);
    }

    private void init(View view) {
        btn1 = view.findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOnClickListen(v);
            }
        });
    }


    public void setOnClickListen(OnClickListenr onClickListen){
    }

}

