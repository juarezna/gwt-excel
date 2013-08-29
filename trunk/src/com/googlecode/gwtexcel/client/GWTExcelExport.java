package com.googlecode.gwtexcel.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLTable;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * This class is responsible for receiving and converting tables from GWT to Excel. 
 * @author juarezna@gmail.com
 */
public class GWTExcelExport {
	String html;

	public GWTExcelExport() {

	}
	
	/**
	 * This constructor method can be used to send the FlexTable.<br>
	 * After that, run convert method.<br> 
	 * @param flexTable = FlexTable with data.<br>
	 */
	public GWTExcelExport(FlexTable flexTable) {
		setTable(flexTable);
	}

	/**
	 * This constructor method can be used to send the Grid.<br>
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
	 * Convert GWT tables to Excel. 
	 */
	public void convert() {
		if ( ! html.isEmpty()) {
			FormPanel formPanel = new FormPanel();
			String url = GWT.getModuleBaseURL() + "servletGWTExcelExport";
			formPanel.setMethod(FormPanel.METHOD_POST);
			formPanel.setAction(url);
			Hidden hf=new Hidden();
			hf.setName("html");
			hf.setValue(noAcent(html));
			formPanel.add(hf);
			RootPanel.get().add(formPanel);
			formPanel.submit();
		}
	}

	public void setHtml(String html) {
		this.html = html;
	}	
	
	public String noAcent(String content) {
		return content.replaceAll("[„‚‡·‰]", "a")  
				.replaceAll("[ÍËÈÎ]", "e")  
				.replaceAll("[ÓÏÌÔ]", "i")  
				.replaceAll("[ıÙÚÛˆ]", "o")  
				.replaceAll("[˚˙˘¸]", "u")  
				.replaceAll("[√¬¿¡ƒ]", "A")  
				.replaceAll("[ »…À]", "E")  
				.replaceAll("[ŒÃÕœ]", "I")  
				.replaceAll("[’‘“”÷]", "O")  
				.replaceAll("[€Ÿ⁄‹]", "U")  
				.replaceAll("›","Y")  
				.replaceAll("Á", "c")  
				.replaceAll("«", "C")  
				.replaceAll("Ò", "n")  
				.replaceAll("—", "N")
				.replaceAll("[˝ˇ]","y");  
	}  
	

}
