package com.hooks;

import java.io.IOException;


import com.base.BasePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AppHook extends BasePage {
	
	@Before
	public void beforeAll() throws IOException{
		BasePage.InitializeUrl();
		}
	
	@After
	public void afterAll() {
		BasePage.teardown();
	}
}
