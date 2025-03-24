package com.assetyzerTickets;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assetyzer.base.TestBase;
import com.assetyzer.pages.AssetyzerDashboard;
import com.assetyzer.pages.CreateEvent;
import com.assetyzer.pages.HomePage;

public class CreateEventTestcases extends TestBase{
	
	@Test
	public void createEventFlow() {
		 // Perform login
        HomePage homepage = new HomePage();
        homepage.loginFlow();

        // Navigate to Assetyzer Dashboard and Create Event
        AssetyzerDashboard assetyzerDashboard = new AssetyzerDashboard();
        assetyzerDashboard.clickOnBegin();
        assetyzerDashboard.clickOnGetStarted();

        CreateEvent createEvent = new CreateEvent();
        createEvent.chooseEventLogo();
        createEvent.eventoverview();
        createEvent.eventBanner();
        createEvent.eventDate();
        createEvent.eventLocation();
        createEvent.aboutevent();
        createEvent.eventType();
        createEvent.eventTicket();
        createEvent.eventContact();
        createEvent.ticketTier();
        

		
		
		
	}
	

}
