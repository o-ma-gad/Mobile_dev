package com.tede.tede;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.tede.tede.adapter.TeacherListAdapter;
import com.tede.tede.model.Teacher;
import com.tede.tede.api.ApiConnection;

import java.util.ArrayList;
import java.util.List;

public class InstituteTeacherActivity extends AppCompatActivity {
    RecyclerView teacherRecycler;
    TeacherListAdapter teacherListAdapter;

    ApiConnection teachers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute_teacher);

        List<Teacher> teacherList = teachers.getTeachersByInstituteId(2);
//        teacherList.add(new Teacher(423,(float) 23.56, "Абайдуллина А.Г."));
//        teacherList.add(new Teacher(424,(float) 24.56, "Некрасова О.П."));
//        teacherList.add(new Teacher(423,(float) 23.56, "Абайдуллина А.Г."));
//        teacherList.add(new Teacher(424,(float) 24.56, "Некрасова О.П."));
//        teacherList.add(new Teacher(423,(float) 23.56, "Абайдуллина А.Г."));
//        teacherList.add(new Teacher(424,(float) 24.56, "Некрасова О.П."));
//        teacherList.add(new Teacher(423,(float) 23.56, "Абайдуллина А.Г."));
//        teacherList.add(new Teacher(424,(float) 24.56, "Некрасова О.П."));
//        teacherList.add(new Teacher(423,(float) 23.56, "Абайдуллина А.Г."));
//        teacherList.add(new Teacher(424,(float) 24.56, "Некрасова О.П."));
//        teacherList.add(new Teacher(423,(float) 23.56, "Абайдуллина А.Г."));
//        teacherList.add(new Teacher(424,(float) 24.56, "Некрасова О.П."));

        
        setTeacherRecycler(teacherList);


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
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(this, 2);

        teacherRecycler = findViewById(R.id.teacherRecycler);
        teacherRecycler.setLayoutManager(layoutManager);
        teacherRecycler.setLayoutManager(gridLayoutManager);

        teacherListAdapter = new TeacherListAdapter(this, teacherList);
        teacherRecycler.setAdapter(teacherListAdapter);
    }
}