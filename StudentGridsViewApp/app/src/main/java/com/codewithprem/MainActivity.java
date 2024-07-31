package com.codewithprem;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(R.drawable.image0, " Eva Black", "789 Maple St"));
        students.add(new Student(R.drawable.image1, "Bob Brown", "101 Pine Ave"));
        students.add(new Student(R.drawable.image2, "Carol White", "202 Birch Rd"));
        students.add(new Student(R.drawable.image3, "David Green", "303 Cedar Ln"));
        students.add(new Student(R.drawable.image4, "Alice Johnson", "404 Oak Dr"));
        students.add(new Student(R.drawable.image5, "Frank Blue", "505 Elm St"));
        students.add(new Student(R.drawable.image6, "Grace Adams", "606 Walnut Ave"));
        students.add(new Student(R.drawable.image7, "Henry Clark", "707 Willow Rd"));
        students.add(new Student(R.drawable.image8, "Ivy Lee", "808 Fir Ln"));
        students.add(new Student(R.drawable.image9, "Jack Turner", "909 Spruce St"));

        return students;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Grid View and Adapter here
        GridView gridView = findViewById(R.id.gridView);

        // prepare data
        List<Student> students = getStudents();

        // set up adapter
        StudentAdapter adapter = new StudentAdapter(this, students);
        gridView.setAdapter(adapter);
    }
}