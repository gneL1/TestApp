package com.example.testapp.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//该类在系统创建的时候回调
public abstract class BaseFragment extends Fragment {
    protected Context mContext;


    //onCreate是指创建该fragment类似于Activity.onCreate,你可以在其中初始化除了view之外的东西
    //onCreateView是创建该fragment对应的视图，你必须在这里创建自己的视图并返回给调用者
    //onViewCreated在onCreateView执行完后立即执行
    //onCreateView返回的就是fragment要显示的view
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return initView();
    }

    public abstract View initView();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    public void initData() {
    }

    protected void onCreate() {

    }



}
