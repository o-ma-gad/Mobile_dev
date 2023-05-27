package com.tede.tede;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.tede.tede.adapter.TeacherListAdapter;
import com.tede.tede.api.ApiConnection;
import com.tede.tede.model.Teacher;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class InstituteTeacherActivity extends AppCompatActivity {
    RecyclerView teacherRecycler;
    TeacherListAdapter teacherListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute_teacher);

        ApiConnection apiConnection = new ApiConnection();
        setTeacherRecycler(apiConnection.getTeachersByInstituteId(1));

        ImageView imageView = findViewById(R.id.logoImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switcher = new Intent(InstituteTeacherActivity.this, MainActivity.class);
                InstituteTeacherActivity.this.startActivity(switcher);
            }
        });
    }

    private void setTeacherRecycler(List<Teacher> teacherList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        teacherRecycler = findViewById(R.id.teacherRecycler);
        teacherRecycler.setLayoutManager(layoutManager);

        teacherListAdapter = new TeacherListAdapter(this, teacherList);
        teacherRecycler.setAdapter(teacherListAdapter);
    }
}