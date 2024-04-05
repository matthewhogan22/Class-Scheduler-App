package com.example.test;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.*;

import android.widget.Button;

public class SeeCoursesActivity extends AppCompatActivity implements RecyclerViewInterface {
    private Button addEvent;

    private static ArrayList<Event> masterList = new ArrayList<>();
    private RecyclerView recyclerView;
    private static CourseRecyclerViewAdapter adapter;
    private Button accountButton;

    //Plan to scan through the .txt and put data into

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_view);

        recyclerView = findViewById(R.id.coursesRecyclerView);
        adapter = new CourseRecyclerViewAdapter(this, masterList, this);
        accountButton = findViewById(R.id.addAccountButton);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeeCoursesActivity.this, LoginPage.class);
                startActivity(intent);
            }
        });

    }

    public void addCourse(View view) {
        startActivity(new Intent(SeeCoursesActivity.this, AddCourseActivity.class));
    }

    public void seeAssignments(View view) {
        startActivity(new Intent(SeeCoursesActivity.this, SeeAssignmentsActivity.class));
    }

    public void seeExams(View view) {
        startActivity(new Intent(SeeCoursesActivity.this, SeeExamsActivity.class));
    }

    public void goToToDo(View view) {
        startActivity(new Intent(SeeCoursesActivity.this, ToDoListActivity.class));
    }

//    public void goToAccount(View view) {
//        Intent intent = new Intent(SeeCoursesActivity.this, LoginPage.class);
//        startActivity(intent);
//    }

    @Override
    public void whenClicked(int pos) {
//        Intent intent1 = new Intent(SeeCoursesActivity.this, AddCourseActivity.class);
//        intent1.putExtra("pos", pos);
//        startActivity(intent1);
//        masterList.remove(pos);
    }

    public static ArrayList<Event> getMasterList() {
        return masterList;
    }

    public static CourseRecyclerViewAdapter getAdapter() {
        return adapter;
    }

    public static void itemRemovedCourse(int pos) {
        adapter.notifyItemRemoved(pos);
    }


}