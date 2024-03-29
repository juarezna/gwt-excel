package com.googlecode.gwtexcel.client.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwtexcel.client.GWTExcelExport;

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
		flexTable.setText(0, 0, "ãâàáä êèéë îìíï õôòóö ûúùü ÃÀÁÄ ÊÈÉË ÎÌÍÏ ÕÔÒÓÖ ÛÙÚÜÝ ç Ç ñ Ñ ýÿ");
		flexTable.setText(1, 1, "FlexTable2");
		flexTable.setText(2, 2, "FlexTable3");	
		GWTExcelExport gwtExcelExport = new GWTExcelExport(flexTable);
		gwtExcelExport.export();
	}
	
	public void exportGrid() {
		GWTExcelExport gwtExcelExport = new GWTExcelExport(grid);
		gwtExcelExport.setFileExcelName("catapora.xls");
		gwtExcelExport.export();
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
