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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewController extends Controller {

    protected View mView;

    public ViewController(Context context) {
        super(context);
    }

    public View getView() {
        return mView;
    }

    public void setView(View view) {
       mView = view;
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
