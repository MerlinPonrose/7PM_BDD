package com.bdd.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.bdd.utility.BaseClass;

import cucumber.api.java.en.When;

public class DataTable_step extends BaseClass{
	
	
	@When("User click the username text box and enter the value")
	public void user_click_the_username_text_box_and_enter_the_value(io.cucumber.datatable.DataTable data) throws InterruptedException, IOException {
	
			/*	
			 * asList()
		List<String> l1 = data.asList();
		
		int size = l1.size();
		
		for(int i=0;i<size;i++)
		{
			sigin.enteremail(l1.get(i));
		}*/
		
		
	/*	asLists()
	 * List<List<String>> l2 = data.asLists();
		
		sigin.enteremail(l2.get(0).get(0));
		sigin.enterpass(l2.get(0).get(1));*/
		
		
		Map<String, String> asMap = data.asMap(String.class, String.class);
		
		System.out.println(asMap.keySet());
		
		System.out.println(asMap.values());
		
		sigin.enteremail(asMap.get("Username"));
	  
	}

}
