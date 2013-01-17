package com.birkett.controllers;

import android.content.Context;
import android.util.AttributeSet;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ContextMenu;

public class FragmentController {

    protected Context mContext;

    protected FragmentController(Context context) {
        mContext = context;
    }

    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) { }

    /**
     * @deprecated
     */
    @java.lang.Deprecated
    public void onInflate(AttributeSet attrs, Bundle savedInstanceState) { }

    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) { }

    public void onAttach(Activity activity) { }

    //public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) { return null; }

    public void onCreate(Bundle savedInstanceState) { }

    public void onViewCreated(View view, Bundle savedInstanceState) { }

   // public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) { return null; }

   // public View getView() { return null; }

    public void onActivityCreated(Bundle savedInstanceState) { }

    public void onStart() { }

    public void onResume() { }

    public void onSaveInstanceState(Bundle outState) { }

    public void onConfigurationChanged(Configuration newConfig) { }

    public void onPause() { }

    public void onStop() { }

    public void onLowMemory() { }

    public void onTrimMemory(int level) { }

    public void onDestroyView() { }

    public void onDestroy() { }

    public void onDetach() { }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) { }

    public void onPrepareOptionsMenu(Menu menu) { }

    public void onDestroyOptionsMenu() { }

    public boolean onOptionsItemSelected(MenuItem item) { return false; }

    public void onOptionsMenuClosed(Menu menu) { }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { }

}
