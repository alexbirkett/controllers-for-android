/*
 * 
 *  Copyright (C) 2012 Alex Birkett
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

package no.birkettconsulting.controllers;

import java.util.Iterator;
import java.util.Vector;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public abstract class BaseControllerActivity extends FragmentActivity {

	private Vector<Controller> mControllers;

	protected BaseControllerActivity() {
		mControllers = new Vector<Controller>();
	}

	public void addController(Controller controller) {
		mControllers.add(controller);
	}

	public void removeController(Controller controller) {
		mControllers.remove(controller);
	}

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Iterator<Controller> iterator = mControllers.iterator();
		while (iterator.hasNext()) {
			iterator.next().onCreate(savedInstanceState);
		}
	}
	
		
	protected void onDestroy() {
		super.onDestroy();
		Iterator<Controller> iterator = mControllers.iterator();
		while (iterator.hasNext()) {
			iterator.next().onDestroy();
		}
		
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Iterator<Controller> iterator = mControllers.iterator();
		while (iterator.hasNext()) {
			iterator.next().onPause();
		}
	}
	

	@Override
	protected void onResume() {
		super.onResume();
		Iterator<Controller> iterator = mControllers.iterator();
		while (iterator.hasNext()) {
			iterator.next().onResume();
		}
	}

}
