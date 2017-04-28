package com.example.android.inclassassignment11_mengqid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private ArrayList<Student> mDataset;
    private ArrayList<Student> students;
    private Random generator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDataset = new ArrayList<>();
        students = new ArrayList<>();
        Student newStudent = new Student("Boen Li", "male", "not graduated");
        Student newStudent1 = new Student("Maureen Ding", "female", "not graduated");
        Student newStudent2 = new Student("Dasheng Zhang", "male", "graduated");
        Student newStudent3 = new Student("Yao Chen", "female", "not graduated");
        Student newStudent4 = new Student("Mengqi Ding", "female", "graduated");
        Student newStudent5 = new Student("Yang Yang", "male", "not graduated");
        Student newStudent6 = new Student("Mike", "male", "not graduated");
        Student newStudent7 = new Student("Ginger", "female", "not graduated");
        Student newStudent8 = new Student("Cathy Liao", "female", "not graduated");
        Student newStudent9 = new Student("Sean Ma", "male", "graduated");
        Student newStudent10 = new Student("Wanshu Wang", "female", "not graduated");
        students.add(newStudent);
        students.add(newStudent1);
        students.add(newStudent2);
        students.add(newStudent3);
        students.add(newStudent4);
        students.add(newStudent5);
        students.add(newStudent6);
        students.add(newStudent7);
        students.add(newStudent8);
        students.add(newStudent9);
        students.add(newStudent10);
        mAdapter = new MyAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);

        for (int i = 0; i < 3; i++) {
            addNewStudent();
        }

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public void addStudent(MenuItem item) {
        addNewStudent();
    }

    public void addNewStudent()
    {
        int position = generator.nextInt(9);
        Student addStudent = students.get(position);
        mDataset.add(addStudent);
        mAdapter.notifyDataSetChanged();
    }
}
