package com.birkett.controllers;

public interface ListControllerObserver {
    void onListItemClick(android.widget.ListView listView, android.view.View view, int position, long id);
}