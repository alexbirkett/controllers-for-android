package com.birkett.controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentViewController extends FragmentController {

        protected View mView;

        protected FragmentViewController(Context context) {
            super(context);
        }

        public View getView() {
            return mView;
        }

        public void setContentView(int layoutResId) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(layoutResId, null, false);
        }

        public View findViewById(int id) {
            return mView.findViewById(id);
        }

        public void detachViewFromParent() {
            ViewGroup viewGroup = (ViewGroup) mView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(mView);
            }
        }

}
