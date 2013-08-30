GWT-Excel

How can I use?

Download and add in your classpath:
gwt-excel-1.0.x.jar

Add in your .gwt.xml:
<inherits name='com.googlecode.gwtexcel.GWTExcel'/>

Add in your web.xml:
<servlet>
  <servlet-name>GWTExcel</servlet-name>
  <servlet-class>com.googlecode.gwtexcel.server.Export</servlet-class>
</servlet>
  <servlet-mapping>
  <servlet-name>GWTExcel</servlet-name>
  <url-pattern>/YOUR_PROJECT_NAME/servletGWTExcelExport</url-pattern>
</servlet-mapping>

Add in your GWT Event (onClick, onKeyUp...):
GWTExcelExport gwtExcelExport = new GWTExcelExport(flexTable);
gwtExcelExport.setFileExcelName("myExcelFile.xls");
gwtExcelExport.export();

or

GWTExcelExport gwtExcelExport = new GWTExcelExport();
gwtExcelExport.setTable(flexTable);
gwtExcelExport.setFileExcelName("myExcelFile.xls");
gwtExcelExport.export();
