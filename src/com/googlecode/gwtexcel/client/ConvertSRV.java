package com.googlecode.gwtexcel.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("servletConvert")
public interface ConvertSRV extends RemoteService {

	String acentToHTML(String html);
	
	public static class Instance {
		private static ConvertSRVAsync instance;
		public static ConvertSRVAsync getInstance() {
			if (instance == null) {
				instance = (ConvertSRVAsync) GWT.create(ConvertSRV.class);
			}
			return instance;
		}
	}	

}


