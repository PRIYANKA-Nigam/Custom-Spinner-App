package com.example.customspinnerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=(Spinner)findViewById(R.id.custom);
        ArrayList<customList> customLists=new ArrayList<>();
        customLists.add(new customList("Icon",R.drawable.ic_baseline_explore_24));
        customLists.add(new customList("casino",R.drawable.ic_baseline_casino_24));
        customLists.add(new customList("Emoji",R.drawable.ic_baseline_emoji_emotions_24));
        customLists.add(new customList("Action",R.drawable.ic_baseline_emoji_events_24));
        customLists.add(new customList("Record",R.drawable.ic_baseline_fiber_smart_record_24));
        customLists.add(new customList("filter",R.drawable.ic_baseline_filter_b_and_w_24));
        customLists.add(new customList("group",R.drawable.ic_baseline_group_work_24));
        customLists.add(new customList("gamePad",R.drawable.ic_baseline_gamepad_24));
        customLists.add(new customList("Ruled",R.drawable.ic_baseline_horizontal_split_24));
        CustomAdapter customAdapter=new CustomAdapter(this,customLists);
        if(spinner!=null){
            spinner.setAdapter(customAdapter);
            spinner.setOnItemSelectedListener(this); } }@Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        customList customList=(customList)parent.getSelectedItem();
        Toast.makeText(this,customList.getSpinnerText(),Toast.LENGTH_SHORT).show(); }@Override
    public void onNothingSelected(AdapterView<?> parent) { }}