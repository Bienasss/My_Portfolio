package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String MEMBER_TABLE = "MEMBER_TABLE";
    public static final String COLUMN_FIRST_NAME = "FIRST_NAME";
    public static final String COLUMN_LAST_NAME = "LAST_NAME";
    public static final String COLUMN_ROLE = "ROLE";
    public static final String COLUMN_ID = "ID";

    public DataBaseHelper(@Nullable Context context){
        super(context, "member.db", null, 1);

    }
        @Override
        public void onCreate(SQLiteDatabase db){

        String createTableStatement = "CREATE TABLE " + MEMBER_TABLE + " (" + COLUMN_ID + " PRIMARY KEY AUTOINCREMENT, " + COLUMN_FIRST_NAME + " TEXT, " + COLUMN_LAST_NAME + " TEXT, " + COLUMN_ROLE + " TEXT)";

        db.execSQL(createTableStatement);
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        }

        public boolean addUser(ProjectMemberModel projectMemberModel){

        SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put(COLUMN_FIRST_NAME, projectMemberModel.getFirstName());
            cv.put(COLUMN_LAST_NAME, projectMemberModel.getLastName());
            cv.put(COLUMN_ROLE, projectMemberModel.getRole());

            long insert = db.insert(MEMBER_TABLE, null, cv);
            if (insert == -1){
                return false;
            }
            else{
                return true;
            }



        }
}
