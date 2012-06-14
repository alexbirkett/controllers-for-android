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
import android.os.Bundle;

public class BaseControllerActivity extends Activity {

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

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Iterator<Controller> iterator = mControllers.iterator();
		while (iterator.hasNext()) {
			iterator.next().onSaveInstanceState(outState);
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

	@Override
	public void onContentChanged() {
		super.onContentChanged();
		Iterator<Controller> iterator = mControllers.iterator();
		while (iterator.hasNext()) {
			iterator.next().onContentChanged();
		}
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle state) {
		super.onRestoreInstanceState(state);
		Iterator<Controller> iterator = mControllers.iterator();
		while (iterator.hasNext()) {
			iterator.next().onRestoreInstanceState(state);
		}
	}
}
