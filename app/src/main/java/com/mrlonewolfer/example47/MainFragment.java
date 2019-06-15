package com.mrlonewolfer.example47;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    ListView listView;
    AdapterView.AdapterContextMenuInfo info;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main, container, false);
        listView=view.findViewById(R.id.listView);
        registerForContextMenu(listView);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                return false;
            }
        });
    return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        MenuInflater myinflater = getActivity().getMenuInflater();
        myinflater.inflate(R.menu.option_menu, menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.javaP:
                Toast.makeText(getContext(), "You Selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.dotnetP:
                Toast.makeText(getContext(), "You Selected : "+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.androidP:
                Toast.makeText(getContext(), "You Selected : "+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.phpP:
                Toast.makeText(getContext(), "You Selected : "+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater myinflater = getActivity().getMenuInflater();
        myinflater.inflate(R.menu.list_view_context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

         info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.Cadd:
                Toast.makeText(getContext(), "You Going TO Perform : "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Cdelete:
                Toast.makeText(getContext(), "You Going TO Perform : "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Cedit:
                Toast.makeText(getContext(), "You Going TO Perform : "+item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }
}
