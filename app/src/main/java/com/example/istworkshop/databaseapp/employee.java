package com.example.istworkshop.databaseapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class employee extends AppCompatActivity {
    List<employee1> employeeList;
    SQLiteDatabase mDatabase;
    ListView listViewEmployees;
    employee_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        listViewEmployees=findViewById(R.id.listViewEmplyees);
        employeeList =new ArrayList<>();

        mDatabase=openOrCreateDatabase(MainActivity.DATABASE_NAME,MODE_PRIVATE,null);
        showEmployeesFromDatabase();
    }

    private void showEmployeesFromDatabase() {

        Cursor cursorEmployees = mDatabase.rawQuery("SELECT * FROM employees",null);

        if (cursorEmployees.moveToFirst()){
            do {
                employeeList.add(new employee1(
                        cursorEmployees.getInt(0),
                        cursorEmployees.getString(1),
                        cursorEmployees.getString(2),
                        cursorEmployees.getString(3),
                        cursorEmployees.getDouble(4)


                ));
            } while (cursorEmployees.moveToNext());
        }
        cursorEmployees.close();
        adapter = new employee_adapter(this,R.layout.list_layout_employee,employeeList,mDatabase);
        listViewEmployees.setAdapter(adapter);

        }

    }


