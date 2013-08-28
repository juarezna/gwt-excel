package com.googlecode.gwtexcel.client.test;

import com.googlecode.gwtexcel.client.Export;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class Test extends Composite {

	private static TestUiBinder uiBinder = GWT.create(TestUiBinder.class);
	@UiField FlexTable flexTable;
	@UiField Grid grid;
	@UiField Button button1;
	@UiField Button button2;

	interface TestUiBinder extends UiBinder<Widget, Test> {
	}

	public Test() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void exportFlexTable() {
		//flextTable
		flexTable.setText(0, 0, "Column0");
		flexTable.setText(1, 1, "Column1");
		flexTable.setText(2, 2, "Column2");	
		Export GwtExcelExport = new Export(flexTable);
	}
	
	public void exportGrid() {
		Export GwtExcelExport = new Export(grid);
	}	
	
	@UiHandler("button1")
	void onButton1Click(ClickEvent event) {
		exportFlexTable();
	}
	@UiHandler("button2")
	void onButton2Click(ClickEvent event) {
		exportGrid();
	}
}
