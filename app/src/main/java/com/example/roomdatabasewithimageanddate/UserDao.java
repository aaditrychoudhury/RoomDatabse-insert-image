package com.example.roomdatabasewithimageanddate;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomdatabasewithimageanddate.User;

import java.util.List;

@Dao
public interface UserDao {
    @Query("Select * from Users")
    List<User> getAllUsers();

    @Insert
    void insertUser(User user);

    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);


}
