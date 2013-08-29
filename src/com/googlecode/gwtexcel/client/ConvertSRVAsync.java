package com.googlecode.gwtexcel.client;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface ConvertSRVAsync {
	
	void acentToHTML(String html, AsyncCallback<String> callback) throws IllegalArgumentException;
	
}
