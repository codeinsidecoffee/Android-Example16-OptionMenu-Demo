package com.mrlonewolfer.example47;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
/*
Create Option Menu when press on option menu at that time show IT Courses List and
then when  press on particular Any item at that time show name which item will select.

Create Context menu:      Context menu set on Listview.
In Listview item will display from string-array that data set
    without Use of any adapter in listview.

    Context menu will show when long press on listview.
    Context menu will show three items (add,delete items from list)

    1)if long press on listview at that time context menu will apper.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment= new MainFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }
}
