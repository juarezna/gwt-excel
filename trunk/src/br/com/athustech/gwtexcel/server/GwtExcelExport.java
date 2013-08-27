package br.com.athustech.gwtexcel.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GwtExcelExport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		exportExcel(request, response);
	}

	private void exportExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fileName = "export.xls";
		String html = request.getParameter("html");			
		byte[] b = html.getBytes();  
		ServletOutputStream outputStream = response.getOutputStream();
		response.reset();
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName+"\"");
		response.setContentType("application/vnd.ms-excel");
		response.setContentLength(b.length);   
		response.addHeader("Pragma", "no-cache");   
		response.setDateHeader("Expires", 0);   
		outputStream.write(b, 0, b.length);  
		outputStream.flush();   
		outputStream.close(); 
	}
}
