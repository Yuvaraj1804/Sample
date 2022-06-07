package org.dataprovider;

import org.testng.annotations.DataProvider;

public class datas {
	
	@DataProvider(name="Register")
	public Object[][] Data() {
		
		Object[][] obj=new Object[][] {
			{"Yuvaraj98","Inaraht@04"},
			{"yuvaraj","12345678"},
			{"yuva@98","951753985"},
			{"raja@789","sdfghjkl"}
		};
		return obj;
	}

}
