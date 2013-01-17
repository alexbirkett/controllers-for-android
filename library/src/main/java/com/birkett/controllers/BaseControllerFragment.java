package com.birkett.controllers;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class BaseControllerFragment extends Fragment {

    private ArrayList<FragmentController> mControllers;

    protected BaseControllerFragment() {
        mControllers = new ArrayList<FragmentController>();
    }

    public void addController(FragmentController controller) {
        mControllers.add(controller);
    }

    public void removeController(FragmentController controller) {
        mControllers.remove(controller);
    }

    protected abstract void createControllers();

    /**
     * @deprecated
     */
    @java.lang.Deprecated
    @Override
    public void onInflate(AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(attrs, savedInstanceState);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onInflate(attrs, savedInstanceState);
        }
    }

    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onInflate(activity, attrs, savedInstanceState);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onAttach(activity);
        }
    }

    //public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) { return null; }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createControllers();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCreate(savedInstanceState);
        }
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onViewCreated(view, savedInstanceState);
        }
    }

    //public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) { return null; }

    //public View getView() { return null; }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onActivityCreated(savedInstanceState);
        }
    }

    public void onStart() {
        super.onStart();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onStart();
        }
    }

    public void onResume() {
        super.onResume();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onResume();
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onSaveInstanceState(outState);
        }
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onConfigurationChanged(newConfig);
        }
    }

    public void onPause() {
        super.onPause();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onPause();
        }
    }

    public void onStop() {
        super.onStop();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onStop();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onLowMemory();
        }
    }

    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onTrimMemory(level);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDestroyView();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDestroy();
        }
    }

    public void onDetach() {
        super.onDetach();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDetach();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCreateOptionsMenu(menu, inflater);
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onPrepareOptionsMenu(menu);
        }
    }

    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDestroyOptionsMenu();
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        boolean returnValue = super.onOptionsItemSelected(item);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onOptionsItemSelected(item);
        }
        return returnValue;
    }

    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onOptionsMenuClosed(menu);
        }
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Iterator<FragmentController> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCreateContextMenu(menu, v, menuInfo);
        }
    }
}
