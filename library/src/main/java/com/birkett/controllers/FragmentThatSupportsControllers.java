/*
 *
 *  Copyright (C) 2012-2013 Alex Birkett
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.birkett.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public abstract class FragmentThatSupportsControllers extends Fragment {

    protected ArrayList<Controller> mControllers;

    protected FragmentThatSupportsControllers() {
        mControllers = new ArrayList<Controller>();
    }

    public void addController(Controller controller) {
        mControllers.add(controller);
    }

    public void removeController(Controller controller) {
        mControllers.remove(controller);
    }

    public List getControllersList() {
        return mControllers;
    }


    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onInflate(activity, attrs, savedInstanceState);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onAttach(activity);
        }
    }

    //public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) { return null; }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCreate(savedInstanceState);
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onViewCreated(view, savedInstanceState);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            view = iterator.next().onCreateView(inflater, container, savedInstanceState, view);
        }
        return view;
    }

    //public View getView() { return null; }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onActivityCreated(savedInstanceState);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onResume();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onSaveInstanceState(outState);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onStop();
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onLowMemory();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDestroyView();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDestroy();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDetach();
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCreateOptionsMenu(menu, inflater);
        }
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onPrepareOptionsMenu(menu);
        }
    }

    @Override
    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onDestroyOptionsMenu();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean returnValue = super.onOptionsItemSelected(item);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onOptionsItemSelected(item);
        }
        return returnValue;
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onOptionsMenuClosed(menu);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Iterator<Controller> iterator = mControllers.iterator();
        while (iterator.hasNext()) {
            iterator.next().onCreateContextMenu(menu, v, menuInfo);
        }
    }
}
