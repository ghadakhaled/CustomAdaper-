package com.example.ghada.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayList<customEmployee> list;
    ListView listcustmemployee;
    EmployeeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getEmployee();
        listcustmemployee = findViewById(R.id.listcustmemployee);
         adapter = new EmployeeAdapter(this,list);
        listcustmemployee.setAdapter(adapter);
        listcustmemployee.setOnItemClickListener(this);


    }

    private void getEmployee()
    {

        list =new ArrayList<>();
        list.add(new customEmployee(122,"Ahmed","Ahmed@gmail.com",""));
        list.add(new customEmployee(26,"Khaled","Khaled16@gmail.com",""));
        list.add(new customEmployee(23,"Yaser","Yaser53@gmail.com",""));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Toast.makeText(this," Name is:   "+list.get(position).getName()+"  "+"Id:"+"   "+id, Toast.LENGTH_SHORT).show();

    }
}
