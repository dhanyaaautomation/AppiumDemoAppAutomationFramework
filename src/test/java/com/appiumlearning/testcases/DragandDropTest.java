package com.appiumlearning.testcases;

import java.net.MalformedURLException;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appiumlearning.pages.DragandDropPage;
import com.appiumlearning.pages.HomePage;
import com.appiumlearning.pages.PreferenceLandingPage;
import com.appiumlearning.pages.ViewsLandingPage;

public class DragandDropTest extends BaseTest {

	
	@Test(enabled=false)
	public void tapTest() throws MalformedURLException {
		
		new HomePage().clickOnViews().clickMenuItem("Drag and Drop");
		new DragandDropPage().performDragAndDrop();
		
		Assertions.assertThat(new DragandDropPage().getSuccessMessage())
		.isEqualTo("Dropped!");	
		
	}
	
	@Test
	public void selectCheckboxPreferenecTest() {
		WebElement element = new HomePage().clickOnPreference()
		.selectCheckboxPreference();
		
		if(element.isSelected()) {
			Assert.assertTrue(true);
		}
		
	}
}
