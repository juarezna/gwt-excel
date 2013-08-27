package br.com.athustech.gwtexcel.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
/**
 * 
 * 
 * @author juarezna@gmail.com
  */
public class GwtExcel implements EntryPoint {
	private Test test;
	
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		
		VerticalPanel verticalPanel = new VerticalPanel();
		rootPanel.add(verticalPanel,0,0);
		
		test = new Test();
		verticalPanel.add(test);
	}
}
