package com.mahmoudsaad.xarkas.data.db;

import android.content.Context;

import com.mahmoudsaad.xarkas.data.db.dao.UserDao;
import com.mahmoudsaad.xarkas.data.db.model.User;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


/**
 * Created on : Feb 01, 2019
 * Author     : mahmoud saad
 */
@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "wave-database";
    private static AppDatabase mInstance;

    public synchronized static AppDatabase getDatabaseInstance(Context context) {
        if (mInstance == null) {
            mInstance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return mInstance;
    }

    public static void destroyInstance() {
        mInstance = null;
    }

    public abstract UserDao userDao();

}