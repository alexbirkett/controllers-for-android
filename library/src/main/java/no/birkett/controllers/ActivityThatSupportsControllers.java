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

package no.birkett.controllers;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

@SuppressLint("NewApi")
public abstract class ActivityThatSupportsControllers extends FragmentActivity {

    protected ArrayList<Controller> mControllers;

    protected ActivityThatSupportsControllers() {
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
    public void onContentChanged() {
        super.onContentChanged();
        for (Controller controller : mControllers) {
            controller.onContentChanged();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        for (Controller controller : mControllers) {
            controller.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);
        for (Controller controller : mControllers) {
            controller.onApplyThemeResource(theme, resid, first);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (Controller controller : mControllers) {
            controller.onCreate(savedInstanceState);
        }
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Dialog dialog = null;
        for (Controller controller : mControllers) {
            dialog = controller.onCreateDialog(id);
            if (dialog != null) {
                break;
            }
        }
        return dialog;
    }

    @Override
    protected Dialog onCreateDialog(int id, Bundle args) {
        Dialog dialog = null;
        for (Controller controller : mControllers) {
            dialog = controller.onCreateDialog(id, args);
            if (dialog != null) {
                break;
            }
        }
        return dialog;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        for (Controller controller : mControllers) {
            controller.onDestroy();
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        for (Controller controller : mControllers) {
            controller.onNewIntent(intent);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        for (Controller controller : mControllers) {
            controller.onPause();
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        for (Controller controller : mControllers) {
            controller.onPostCreate(savedInstanceState);
        }
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        for (Controller controller : mControllers) {
            controller.onPostResume();
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
        super.onPrepareDialog(id, dialog);
        for (Controller controller : mControllers) {
            controller.onPrepareDialog(id, dialog);
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void onPrepareDialog(int id, Dialog dialog, Bundle args) {
        super.onPrepareDialog(id, dialog, args);
        for (Controller controller : mControllers) {
            controller.onPrepareDialog(id, dialog, args);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        for (Controller controller : mControllers) {
            controller.onRestart();
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        for (Controller controller : mControllers) {
            controller.onRestoreInstanceState(savedInstanceState);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        for (Controller controller : mControllers) {
            controller.onResume();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for (Controller controller : mControllers) {
            controller.onSaveInstanceState(outState);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        for (Controller controller : mControllers) {
            controller.onStart();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        for (Controller controller : mControllers) {
            controller.onStop();
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        for (Controller controller : mControllers) {
            controller.onTitleChanged(title, color);
        }
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        for (Controller controller : mControllers) {
            controller.onUserLeaveHint();
        }
    }

    @Override
    public void onActionModeFinished(ActionMode mode) {
        super.onActionModeFinished(mode);
        for (Controller controller : mControllers) {
            controller.onActionModeFinished(mode);
        }
    }

    @Override
    public void onActionModeStarted(ActionMode mode) {
        super.onActionModeStarted(mode);
        for (Controller controller : mControllers) {
            controller.onActionModeStarted(mode);
        }
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        for (Controller controller : mControllers) {
            controller.onAttachFragment(fragment);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (Controller controller : mControllers) {
            controller.onAttachedToWindow();
        }
    }

    @Override
    public void onBackPressed() {
        Iterator<Controller> iterator = mControllers.iterator();
        boolean consumed = false;
        while (iterator.hasNext() && !consumed) {
            consumed = iterator.next().onBackPressed();
        }
        if (!consumed) {
            super.onBackPressed();
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
    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
        for (Controller controller : mControllers) {
            controller.onContextMenuClosed(menu);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
            ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        for (Controller controller : mControllers) {
            controller.onCreateContextMenu(menu, v, menuInfo);
        }
    }

    @Override
    public CharSequence onCreateDescription() {
        CharSequence sequence = super.onCreateDescription();

        if (sequence == null) {
            for (Controller controller : mControllers) {
                sequence = controller.onCreateDescription();
                if (sequence != null) {
                    break;
                }
            }
        }
        return sequence;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        boolean returnValue = super.onCreateOptionsMenu(menu);
        for (Controller controller : mControllers) {
            if (controller.onCreateOptionsMenu(menu, inflater)) {
                returnValue = true;
            }
        }
        return returnValue;
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        boolean returnValue = super.onCreatePanelMenu(featureId, menu);
        for (Controller controller : mControllers) {
            if (controller.onCreatePanelMenu(featureId, menu)) {
                returnValue = true;
            }
        }
        return returnValue;
    }

    @Override
    public View onCreatePanelView(int featureId) {
        View view = super.onCreatePanelView(featureId);
        if (view == null) {
            for (Controller controller : mControllers) {
                view = controller.onCreatePanelView(featureId);
                if (view != null) {
                    break;
                }
            }
        }
        return view;
    }

    @Override
    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        boolean result = super.onCreateThumbnail(outBitmap, canvas);

        if (!result) {
            for (Controller controller : mControllers) {
                result = controller.onCreateThumbnail(outBitmap, canvas);

                if (result) {
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public View onCreateView(View parent, String name, Context context,
            AttributeSet attrs) {
        View view = super.onCreateView(parent, name, context, attrs);

        if (view == null) {
            for (Controller controller : mControllers) {
                view = controller.onCreateView(parent, name, context,
                    attrs);
                if (view != null) {
                    break;
                }
            }
        }
        return view;
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View view = super.onCreateView(name, context, attrs);

        if (view == null) {
            for (Controller controller : mControllers) {
                view = controller.onCreateView(name, context,
                    attrs);
                if (view != null) {
                    break;
                }
            }
        }
        return view;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (Controller controller : mControllers) {
            controller.onDetachedFromWindow();
        }
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        boolean consumed = super.onGenericMotionEvent(event);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onGenericMotionEvent(event);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean consumed = super.onKeyDown(keyCode, event);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onKeyDown(keyCode, event);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        boolean consumed = super.onKeyLongPress(keyCode, event);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onKeyLongPress(keyCode, event);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        boolean consumed = super.onKeyMultiple(keyCode, repeatCount, event);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onKeyMultiple(keyCode, repeatCount, event);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        boolean consumed = super.onKeyShortcut(keyCode, event);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onKeyShortcut(keyCode, event);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        boolean consumed = super.onKeyUp(keyCode, event);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onKeyUp(keyCode, event);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        for (Controller controller : mControllers) {
            controller.onLowMemory();
        }
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        boolean consumed = super.onMenuItemSelected(featureId, item);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onMenuItemSelected(featureId, item);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        boolean consumed = super.onMenuOpened(featureId, menu);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onMenuOpened(featureId, menu);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean consumed = super.onOptionsItemSelected(item);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onOptionsItemSelected(item);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        for (Controller controller : mControllers) {
            controller.onOptionsMenuClosed(menu);
        }
    }

    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
        for (Controller controller : mControllers) {
            controller.onPanelClosed(featureId, menu);
        }
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean consumed = super.onPrepareOptionsMenu(menu);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onPrepareOptionsMenu(menu);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        boolean consumed = super.onPreparePanel(featureId, view, menu);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onPreparePanel(featureId, view, menu);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        Object object = super.onRetainCustomNonConfigurationInstance();

        if (object == null) {
            for (Controller controller : mControllers) {
                object = controller.onRetainNonConfigurationInstance();
                if (object != null) {
                    break;
                }
            }
        }
        return object;
    }

    @Override
    public boolean onSearchRequested() {
        boolean consumed = super.onSearchRequested();
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onSearchRequested();
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean consumed = super.onTouchEvent(event);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onTouchEvent(event);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        boolean consumed = super.onTrackballEvent(event);
        if (!consumed) {
            for (Controller controller : mControllers) {
                consumed = controller.onTrackballEvent(event);
                if (consumed) {
                    break;
                }
            }
        }
        return consumed;
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        for (Controller controller : mControllers) {
            controller.onTrimMemory(level);
        }
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        for (Controller controller : mControllers) {
            controller.onUserInteraction();
        }
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        super.onWindowAttributesChanged(params);
        for (Controller controller : mControllers) {
            controller.onWindowAttributesChanged(params);
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        for (Controller controller : mControllers) {
            controller.onWindowFocusChanged(hasFocus);
        }
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        ActionMode actionMode = super.onWindowStartingActionMode(callback);

        if (actionMode == null) {
            for (Controller controller : mControllers) {
                actionMode = controller.onWindowStartingActionMode(callback);
                if (actionMode != null) {
                    break;
                }
            }
        }
        return actionMode;
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

    @Override
    public void onStateNotSaved() {
        super.onStateNotSaved();
        for (Controller controller : mControllers) {
            controller.onStateNotSaved();
        }
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        for (Controller controller : mControllers) {
            controller.onResumeFragments();
        }
    }
}
