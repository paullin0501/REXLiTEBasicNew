package com.rexlite.rexlitebasicnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DeviceSearchResultActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private ExpandableListViewAdapter expandableListViewAdapter;
    private List<String> listDataGroup;
    private HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_search_result);

        // initializing the views
        initViews();
        // initializing the listeners
        initListeners();
        // initializing the objects
        initObjects();
        // preparing list data
        initListData();
    }

    /**
     * method to initialize the views
     */
    private void initViews() {
        expandableListView = findViewById(R.id.expandableListView);
    }

    /**
     * method to initialize the listeners
     */
    private void initListeners() {
        // ExpandableListView on child click listener
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
              /*  Toast.makeText(
                        getApplicationContext(),
                        listDataGroup.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataGroup.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();*/
                return false;
            }
        });
        // ExpandableListView Group expanded listener
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
               /* Toast.makeText(getApplicationContext(),
                        listDataGroup.get(groupPosition) + " " + getString(R.string.text_collapsed),
                        Toast.LENGTH_SHORT).show();*/
            }
        });
        // ExpandableListView Group collapsed listener
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                /*Toast.makeText(getApplicationContext(),
                        listDataGroup.get(groupPosition) + " " + getString(R.string.text_collapsed),
                        Toast.LENGTH_SHORT).show();*/
            }
        });
    }
    /**
     * method to initialize the objects
     */
    private void initObjects() {
        // initializing the list of groups
        listDataGroup = new ArrayList<>();
        // initializing the list of child
        listDataChild = new HashMap<>();
        // initializing the adapter object
        expandableListViewAdapter = new ExpandableListViewAdapter(this, listDataGroup, listDataChild);
        // setting list adapter
        expandableListView.setAdapter(expandableListViewAdapter);
    }

    /*
     * Preparing the list data
     *
     * Dummy Items
     */
    private void initListData() {
        // Adding group data
        listDataGroup.add("MaxLite");
        listDataGroup.add("MaxLite2");
        listDataGroup.add("MaxLite3");
        listDataGroup.add("MaxScene");
        // array of strings
        String[] array;
        // list of Max1
        List<String> max1List = new ArrayList<>();
        array = new String[]{"MAXLite M’L-1 01"};
        for (String item : array) {
            max1List.add(item);
        }
        // list of Max2
        List<String>  max2List = new ArrayList<>();
        array =  new String[]{"MAXLite2 M’L-2 02"};
        for (String item : array) {
            max2List.add(item);
        }
        // list of Max3
        List<String> max3List = new ArrayList<>();
        array =  new String[]{"MAXLite3 M’L-3 03"};
        for (String item : array) {
            max3List.add(item);
        }
        // list of MaxScene
        List<String> maxSceneList = new ArrayList<>();
        array =  new String[]{"MAXScene M’S-1 02"};
        for (String item : array) {
            maxSceneList.add(item);
        }
        // Adding child data
        listDataChild.put(listDataGroup.get(0),max1List );
        listDataChild.put(listDataGroup.get(1), max2List);
        listDataChild.put(listDataGroup.get(2), max3List);
        listDataChild.put(listDataGroup.get(3), maxSceneList);
        // notify the adapter
        expandableListViewAdapter.notifyDataSetChanged();
    }


}