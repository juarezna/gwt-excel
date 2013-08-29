package com.googlecode.gwtexcel.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.gwtexcel.client.ConvertSRV;
import com.tecnick.htmlutils.htmlentities.HTMLEntities;

public class Convert extends RemoteServiceServlet implements ConvertSRV {
	private static final long serialVersionUID = 1L;

	/**
	 * Convert acent to html.<br>
	 */
	public String acentToHTML(String html) throws IllegalArgumentException  {
		   return HTMLEntities.htmlentities(html);  
	}

}
