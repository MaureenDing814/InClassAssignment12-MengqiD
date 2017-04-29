package com.example.android.inclassassignment11_mengqid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView profile = (ImageView)findViewById(R.id.profile_detail);
        TextView name = (TextView)findViewById(R.id.name_detail);
        TextView gender = (TextView)findViewById(R.id.gender_detail);
        TextView year = (TextView)findViewById(R.id.year_detail);

        Intent intent = getIntent();
        Student students = (Student) intent.getSerializableExtra("A Student");
String studentName = students.getName();
        name.setText(studentName);
        gender.setText(students.getGender());
        year.setText(students.getYear());

        switch (studentName){
            case "Boen Li":profile.setImageResource(R.drawable.boen);break;
            case "Maureen Ding": profile.setImageResource(R.drawable.maureen);break;
            case "Dasheng Zhang": profile.setImageResource(R.drawable.dasheng);break;
            case "Yao Chen": profile.setImageResource(R.drawable.yao);break;
            case "Mengqi Ding": profile.setImageResource(R.drawable.mengqi);break;
            case "Yang Yang": profile.setImageResource(R.drawable.yang);break;
            case "Mike": profile.setImageResource(R.drawable.mike);break;
            case "Ginger": profile.setImageResource(R.drawable.ginger);break;
            case "Cathy Liao": profile.setImageResource(R.drawable.cathy);break;
            case "Sean Ma": profile.setImageResource(R.drawable.sean);break;
            case "Wanshu Wang": profile.setImageResource(R.drawable.wanshu);break;
        }
    }
}
