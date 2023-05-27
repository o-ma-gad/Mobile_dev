package com.tede.tede.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tede.tede.R;
import com.tede.tede.model.Teacher;

import java.util.List;

public class TeacherListAdapter extends RecyclerView.Adapter<TeacherListAdapter.TeacherViewHolder> {
    Context context;
    List<Teacher> teachers;

    public TeacherListAdapter(Context context, List<Teacher> teachers) {
        this.context = context;
        this.teachers = teachers;
    }

    @NonNull
    @Override
    public TeacherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View teacherItems = LayoutInflater.from(context).inflate(R.layout.teacher_plane, parent, false);
        return new TeacherListAdapter.TeacherViewHolder(teacherItems);
    }

    @Override
    public void onBindViewHolder(@NonNull TeacherViewHolder holder, int position) {
        holder.teacherImage.setImageResource(R.drawable.ded_logo);
        holder.fullName.setText(teachers.get(position).getFullName());
    }

    @Override
    public int getItemCount() {
        return teachers.size();
    }

    public static final class TeacherViewHolder extends RecyclerView.ViewHolder {
        ImageView teacherImage;
        TextView fullName, rating;
        public TeacherViewHolder(@NonNull View itemView) {
            super(itemView);
            teacherImage = itemView.findViewById(R.id.logoImage);
            fullName = itemView.findViewById(R.id.fullName);
            rating = itemView.findViewById(R.id.rating);
        }
    }



}
