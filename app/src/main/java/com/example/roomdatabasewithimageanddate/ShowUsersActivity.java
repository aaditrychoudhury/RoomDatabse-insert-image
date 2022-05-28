package com.example.roomdatabasewithimageanddate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ShowUsersActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_users);

        recyclerView = findViewById(R.id.userRecyclerView);

        userDao = UserDatabase.getDBInstance(this).userDao();
        UserRecycler userRecycler = new UserRecycler(userDao.getAllUsers());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(userRecycler);
    }
}