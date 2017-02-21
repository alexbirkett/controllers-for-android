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
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
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
    @Deprecated
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        for (Controller controller : mControllers) {
            controller.onInflate(activity, attrs, savedInstanceState);
        }
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        for (Controller controller : mControllers) {
            controller.onInflate(context, attrs, savedInstanceState);
        }
    }

    @Override
    @Deprecated
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        for (Controller controller : mControllers) {
            controller.onAttach(activity);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        for (Controller controller : mControllers) {
            controller.onAttach(context);
        }
    }

    //public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) { return null; }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (Controller controller : mControllers) {
            controller.onCreate(savedInstanceState);
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        for (Controller controller : mControllers) {
            controller.onViewCreated(view, savedInstanceState);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        for (Controller controller : mControllers) {
            view = controller.onCreateView(inflater, container, savedInstanceState, view);
        }
        return view;
    }

    //public View getView() { return null; }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        for (Controller controller : mControllers) {
            controller.onActivityCreated(savedInstanceState);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        for (Controller controller : mControllers) {
            controller.onStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        for (Controller controller : mControllers) {
            controller.onResume();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for (Controller controller : mControllers) {
            controller.onSaveInstanceState(outState);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        for (Controller controller : mControllers) {
            controller.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        for (Controller controller : mControllers) {
            controller.onPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        for (Controller controller : mControllers) {
            controller.onStop();
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        for (Controller controller : mControllers) {
            controller.onLowMemory();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        for (Controller controller : mControllers) {
            controller.onDestroyView();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        for (Controller controller : mControllers) {
            controller.onDestroy();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        for (Controller controller : mControllers) {
            controller.onDetach();
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        for (Controller controller : mControllers) {
            controller.onCreateOptionsMenu(menu, inflater);
        }
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        for (Controller controller : mControllers) {
            controller.onPrepareOptionsMenu(menu);
        }
    }

    @Override
    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        for (Controller controller : mControllers) {
            controller.onDestroyOptionsMenu();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean returnValue = super.onOptionsItemSelected(item);
        for (Controller controller : mControllers) {
            controller.onOptionsItemSelected(item);
        }
        return returnValue;
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        for (Controller controller : mControllers) {
            controller.onOptionsMenuClosed(menu);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        for (Controller controller : mControllers) {
            controller.onCreateContextMenu(menu, v, menuInfo);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        for (Controller controller : mControllers) {
            controller.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        for (Controller controller : mControllers) {
            controller.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
        for (Controller controller : mControllers) {
            controller.onMultiWindowModeChanged(isInMultiWindowMode);
        }
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        for (Controller controller : mControllers) {
            controller.onPictureInPictureModeChanged(isInPictureInPictureMode);
        }
    }
}
