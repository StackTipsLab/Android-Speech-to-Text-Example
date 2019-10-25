package com.stacktips.speechtotext.views;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class DefaultActivity extends AppCompatActivity {

    protected abstract int getLayoutId();

    protected abstract void setActivityBinding();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getLayoutId() == 0)
            return;

        setActivityBinding();
    }


}
