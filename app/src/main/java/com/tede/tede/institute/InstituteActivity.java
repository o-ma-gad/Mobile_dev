//package com.tede.tede.institute;
//
//import android.os.Bundle;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.tede.tede.R;
//
//import java.util.List;
//
//public class InstituteActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_institute);
//
//        String instituteName = getIntent().getStringExtra("INSTITUTE_NAME");
//
//        new InstituteTeachers() {
//            @Override
//            protected void onPostExecute(List<Teacher> teachersList) {
//                TextView textView = findViewById(R.id.textView);
//                StringBuilder stringBuilder = new StringBuilder();
//                for (Teacher teacher : teachersList) {
//                    stringBuilder.append(teacher.getFullName()).append("\n");
//                }
//                textView.setText(stringBuilder.toString());
//            }
//        }.execute(instituteName);
//    }
//}
