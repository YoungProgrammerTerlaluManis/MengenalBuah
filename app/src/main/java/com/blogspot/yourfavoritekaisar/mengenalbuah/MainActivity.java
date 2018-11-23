package com.blogspot.yourfavoritekaisar.mengenalbuah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.logomengena)
    ImageView logomengena;
    @BindView(R.id.btnawal)
    Button btnawal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btnawal)
    public void onViewClicked() {
        Intent pindah = new Intent(this, RecyclerActivity.class);
        startActivity(pindah);
    }
}


