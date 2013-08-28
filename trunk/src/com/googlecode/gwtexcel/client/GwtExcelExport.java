package com.googlecode.gwtexcel.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLTable;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtExcelExport {

	public GwtExcelExport(FlexTable flexTable) {
		HTMLTable table = flexTable;
		String html = table.getElement().getString();
		excel(html);
	}
	
	public GwtExcelExport(Grid grid) {
		HTMLTable table = grid;
		String html = table.getElement().getString();
		excel(html);
	}
	
	private void excel(String html) {
		FormPanel formPanel = new FormPanel();
		String url = GWT.getModuleBaseURL() + "servletGwtExcel";
		formPanel.setMethod(FormPanel.METHOD_POST);
		formPanel.setAction(url);
		Hidden hf=new Hidden();
		hf.setName("html");
		hf.setValue(html);
		formPanel.add(hf);
		RootPanel.get().add(formPanel);
		formPanel.submit();
	}	
}
