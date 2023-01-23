package com.appiumlearning.testcases;

import org.testng.annotations.Test;

import com.appiumlearning.pages.ExpandableListPage;
import com.appiumlearning.pages.HomePage;

public class ExpandCollapseTest extends BaseTest {

	
	@Test
	public void expandCollapseTest() {
		new HomePage().clickOnViews().clickMenuItem("Expandable Lists");
		new ExpandableListPage().clickCutomAdaptor();
		new ExpandableListPage().clickPeopleNames();
	}
}
