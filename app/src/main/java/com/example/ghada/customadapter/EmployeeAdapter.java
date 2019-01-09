package com.example.ghada.customadapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EmployeeAdapter extends BaseAdapter
{
    public Context context;
    public ArrayList<customEmployee> employes;

    public EmployeeAdapter(Context context, ArrayList<customEmployee> employes)
    {
        this.context = context;
        this.employes = employes;
    }

    @Override
    public int getCount()
    {
        return employes.size();
    }

    @Override
    public Object getItem(int position)
    {
        return employes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return employes.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView=LayoutInflater.from(context).inflate(R.layout.customemployees,null);
        TextView Nameemploye = convertView.findViewById(R.id.Nameemploye);
        TextView id_emp      = convertView.findViewById(R.id.id_emp);
        TextView email_employee= convertView.findViewById(R.id.email_employee);

        customEmployee employees = (customEmployee) getItem(position); //To see design of postion Employee

        Nameemploye.setText(employees.getName());
        email_employee.setText(employees.getEmail());
        id_emp.setText(String.valueOf(employees.getId()));


        return convertView;
    }
}

