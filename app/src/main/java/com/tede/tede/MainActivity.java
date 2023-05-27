package com.tede.tede;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Button> buttons;
    private static final int[] BUTTON_IDS = {
            R.id.button_iit,
            R.id.button_iii,
            R.id.button_ikb,
            R.id.button_iptip,
            R.id.button_iri,
            R.id.button_itu,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons = new ArrayList<Button>();
        for(int id : BUTTON_IDS) {
            Button button = (Button)findViewById(id);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent switcher = new Intent(MainActivity.this, InstituteTeacherActivity.class);
                    startActivity(switcher);
                }
            });
            buttons.add(button);
        }
    }
}