package com.googlecode.gwtexcel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.gwtexcel.client.test.Test;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTExcel implements EntryPoint {
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		
		VerticalPanel verticalPanel = new VerticalPanel();
		rootPanel.add(verticalPanel);
		
		Test test = new Test();
		verticalPanel.add(test);
	}
}
