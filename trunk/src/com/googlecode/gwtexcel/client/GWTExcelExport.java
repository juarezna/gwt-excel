package com.googlecode.gwtexcel.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLTable;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * This class converts tables from GWT to Excel. 
 * @author juarezna@gmail.com
 */
public class GWTExcelExport {
	String html;

	public GWTExcelExport() {

	}
	
	/**
	 * This constructor method can be used to set the FlexTable.<br>
	 * After that, run convert method.<br> 
	 * @param flexTable = FlexTable with data.<br>
	 */
	public GWTExcelExport(FlexTable flexTable) {
		setTable(flexTable);
	}

	/**
	 * This constructor method can be used to set the Grid.<br>
	 * After that, run convert method.<br>
	 * @param grid = Grid with data.<br>
	 */
	public GWTExcelExport(Grid grid) {
		setTable(grid);
	}

	/**
	 * This method can be used to set the FlexTable.<br>
	 * After that, run convert method.<br> 
	 * @param flexTable = FlexTable with data.<br>
	 */	
	public void setTable(FlexTable flexTable) {
		HTMLTable table = flexTable;
		html = table.getElement().getString();
	}

	/**
	 * This constructor method can be used to set the Grid.<br>
	 * After that, run convert method.<br>  
	 * @param grid = Grid with data.<br>
	 */
	public void setTable(Grid grid) {
		HTMLTable table = grid;
		html = table.getElement().getString();
	}

	/**
	 * Convert GWT tables to Excel.<br>
	 */
	public void convert() {
		export(HTMLEntities.htmlentities(html));
	}
	
	/**
	 * Convert GWT tables to Excel.<br>
	 */
	public void export(String html) {
		if ( ! html.isEmpty()) {
			FormPanel formPanel = new FormPanel();
			String url = GWT.getModuleBaseURL() + "servletGWTExcelExport";
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
	
	
}
