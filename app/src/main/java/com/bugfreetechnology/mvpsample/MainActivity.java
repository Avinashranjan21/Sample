package com.bugfreetechnology.mvpsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter {

    EditText etUsername,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void loginPressed() {

    }

    @Override
    public void showSucess() {

    }

    @Override
    public void emailEmpty() {

    }

    @Override
    public void emailInavlid() {

    }

    @Override
    public void passwordEmpty() {

    }

    @Override
    public void pswwordInavlid() {

    }
}
