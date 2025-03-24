package com.assetyzer.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assetyzer.base.Keyword;
import com.assetyzer.utils.WaitFor;

public class CreateEvent {
	public CreateEvent() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(xpath = "(//div[text()=\"Choose Image\"])[1]")
	private static WebElement chooseImageForEventLogoButton;

	@FindBy(xpath = "//span[@class='flatpickr-day' and @aria-label='March 15, 2025']")
	private static WebElement startDate;

	@FindBy(xpath = "//span[@class='flatpickr-day' and @aria-label='March 17, 2025']")
	private static WebElement endDate;

	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY' and @type='text']")
	private static WebElement dateField;

	@FindBy(xpath = "//input[@placeholder='Enter Ticket Tier Title']")
	private static WebElement ticketTierTitle;

	@FindBy(xpath = "//input[@placeholder='Enter Number of Tickets']")
	private static WebElement numOfTickets;

	@FindBy(xpath = "//input[@placeholder='Enter Amount']")
	private static WebElement amountField;

	@FindBy(xpath = "//input[@placeholder=\"Select Restriction\"]")
	private static WebElement restrictionDropdown;

	@FindBy(name = "info")
	private static WebElement ticketBenefits;
	
	@FindBy(xpath="//button[.//input[@type='radio' and @value='style2']]")
	private static WebElement ticketPrefernce;

	@FindBy(xpath="//span[contains(text(), 'Save and Continue')]")
	private static WebElement saveButtonOn3Step;
	
	public void chooseEventLogo() {
		By fileInputLocator = By.xpath("(//input[@type='file'])[1]");
		WebElement uploadElement = WaitFor.wait.until(ExpectedConditions.presenceOfElementLocated(fileInputLocator));
		Keyword.scrollwindow(uploadElement);
		uploadElement.sendKeys("C:\\Users\\shrey\\Downloads\\1.png");

	}

	public void eventoverview() {
		WebElement enterLabel = WaitFor.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder=\"Enter Label (Less Than 20 Characters)\"]")));
		Keyword.scrollwindow(enterLabel);
		enterLabel.sendKeys("RockNightFest");

		WebElement enterTitle = WaitFor.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder=\"Enter Event Title (Less Than 50 Characters)\"]")));
		Keyword.scrollwindow(enterTitle);
		enterTitle.sendKeys("Rock Night Festival 2025");

		WebElement aboutEvent = WaitFor.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//textarea[@placeholder=\"About the Event\"]")));
		Keyword.scrollwindow(aboutEvent);
		aboutEvent.sendKeys(
				"Join us for an electrifying night of music, lights, and unforgettable performances at Rock Night Festival 2025! "
						+ "Featuring top rock bands, a stunning stage setup, and an energetic crowd, this is the ultimate event for rock music lovers.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void eventBanner() {
		WebElement eventBanner = WaitFor.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[2]")));
		Keyword.scrollwindow(eventBanner);
		eventBanner.sendKeys("C:\\Users\\shrey\\Downloads\\1.png");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void eventDate() {
		
		// Set Event Date
		WebElement dateField = WaitFor.wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//input[@placeholder='DD/MM/YYYY' and @type='text']")));

		// Scroll to the date input field
		Keyword.scrollwindowintoView(dateField);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Click the date field to open the calendar
		dateField.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Select Start Date - March 15
		WebElement startDate = WaitFor.wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//span[@class='flatpickr-day' and @aria-label='March 21, 2025']")));
		Keyword.scrollwindowintoView(startDate);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startDate.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Wait to ensure the date is registered

		// Select End Date - March 17
		WebElement endDate = WaitFor.wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//span[@class='flatpickr-day' and @aria-label='March 23, 2025']")));
		Keyword.scrollwindowintoView(endDate);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		endDate.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Ensure selection registers

		// Optional: Close the calendar if it remains open
		dateField.sendKeys(Keys.TAB); // Moves focus away, closing the popup

		// Wait for the calendar to disappear (if necessary)
		WaitFor.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("flatpickr-calendar")));

		System.out.println("Successfully selected range: March 21 - March 23, 2025");

		// Select Start Time
		// Select Start Time
		WebElement startTimeInput = WaitFor.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("startTimeInput")));

		Keyword.scrollwindow(startTimeInput);
		startTimeInput.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		startTimeInput.sendKeys(Keys.ENTER); // Press Enter to confirm

		// Select End Time
		WebElement endTimeInput = WaitFor.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("endTimeInput")));
		Keyword.scrollwindowintoView(endTimeInput); // Scroll into view
		endTimeInput.click(); // Click to open Flatpickr
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		endTimeInput.sendKeys(Keys.ENTER); // Press Enter to confirm




		// Set Timezone
		WebElement timezoneField = WaitFor.wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Select Timezone']")));
		Keyword.scrollwindowintoView(timezoneField);

		// js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block:
		// 'center'});", timezoneField);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timezoneField.click();
		WebElement gmtOption = WaitFor.wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[contains(text(), 'GMT +03:00')]")));
		Keyword.scrollwindowintoView(gmtOption);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		gmtOption.click();
	}

	public void eventLocation() {
		// Set Event Location
		WebElement searchField = Keyword.driver
				.findElement(By.xpath("//input[@class='maplibregl-ctrl-geocoder--input']"));
		Keyword.scrollwindowintoView(searchField);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchField.sendKeys("Karve Nagar");
		searchField.sendKeys(Keys.ENTER);
		WebElement firstSuggestion = WaitFor.wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='suggestions']/li[1]")));
		Keyword.scrollwindowintoView(firstSuggestion);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		firstSuggestion.click();
	}

	public void aboutevent() {
		// Set Event Header and Description
		WebElement headerField = WaitFor.wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@placeholder='Header (Less Than 20 Charatcters)']")));
		headerField.sendKeys("Rock Night Festival 2025");

		WebElement descriptionField = WaitFor.wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//textarea[@placeholder='Description About Event']")));
		descriptionField
				.sendKeys("Join industry leaders, innovators, and tech enthusiasts at the Tech Innovation Summit 2025. "
						+ "This event will showcase the latest advancements in AI, robotics, and software development. "
						+ "Expect engaging panel discussions, hands-on workshops, and networking opportunities that will shape the future of technology. "
						+ "Get inspired and collaborate with like-minded professionals to build the next big thing!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Enter Hosted By and Presented By Details
		WebElement hostedByField = WaitFor.wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Hosted By']")));
		hostedByField.sendKeys("InnovateX Solutions ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Scroll and upload file
		WebElement fileInput1 = WaitFor.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[3]")));
		Keyword.scrollwindow(fileInput1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileInput1.sendKeys("C:\\Users\\shrey\\Downloads\\1.png");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Wait for the 'Presented By' input field
		WebElement presentedByField = WaitFor.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='presented By']")));
		Keyword.scrollwindow(presentedByField);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Enter text using sendKeys() to properly trigger events
		presentedByField.clear(); // Ensure the field is empty before entering text
		presentedByField.sendKeys("TechWorld Innovation");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Manually trigger input events to simulate real user input
		Keyword.scrollwindow(presentedByField);
		Keyword.scrollwindow(presentedByField);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Optional: Move focus away to ensure validation occurs
		presentedByField.sendKeys(Keys.TAB);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// File Upload (Additional Image)
		WebElement fileInput2 = WaitFor.wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[4]")));
		Keyword.scrollwindow(fileInput2);
		fileInput2.sendKeys("C:\\Users\\shrey\\Downloads\\1.png");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Enter Event Agenda
		WebElement agendaTextArea = Keyword.driver.findElement(By.xpath("//textarea[@placeholder='Agenda for Event']"));
		agendaTextArea.clear();
		agendaTextArea.sendKeys(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla facilisi. Suspendisse potenti. "
						+ "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Integer eget libero nec lorem viverra fermentum. "
						+ "Etiam vel neque in lacus posuere molestie. Quisque euismod, lacus vel malesuada consequat, quam augue ultricies nunc, sit amet varius mauris elit at quam. "
						+ "Donec auctor, odio sit amet feugiat scelerisque, lacus ligula efficitur leo, et dictum quam est in lorem. Suspendisse.");

	}

	public void eventType() {
		// Event Type Selection (Concert Option)
		// Event Type Selection (Concert Option)
		try {
			WebElement dropdown = WaitFor.wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id,'event-type_dropdown')]")));
			Keyword.scrollwindowintoView(dropdown);
			Thread.sleep(500);
			dropdown.click();
			WebElement concertOption = WaitFor.wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//li[span[contains(text(), 'Concert')]]")));
			concertOption.click();
			System.out.println("Concert option selected successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Artist Name and Role
		WebElement artistName = WaitFor.wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Artist Name']")));
		artistName.sendKeys("Arijit");

		// Find the hidden file input element
		WebElement fileInput = Keyword.driver.findElement(By.xpath("(//input[@type='file' and @accept='image/*'])[5]"));
		Keyword.fileUploadHiddenElement(fileInput);
		// Upload the image
		fileInput.sendKeys("C:\\Users\\shrey\\Downloads\\1.png"); // Provide valid image path

		WebElement roleInput = WaitFor.wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Role']")));
		roleInput.sendKeys("Singer");

		WebElement descriptionBox = Keyword.driver.findElement(By.xpath("//textarea[@placeholder='Description']"));
		descriptionBox.sendKeys("This is a dummy description for testing automation.");

		// Wait for some time (just to verify)
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Test executed successfully!");
	}

	public void eventTicket() {
		// Enter Event Facebook URL
		WebElement facebookInput = WaitFor.wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Facebook URL']")));
		Keyword.scrollwindowintoView(facebookInput);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		facebookInput.sendKeys("https://www.facebook.com/dummyevent");

		// Handle Checkboxes
		List<WebElement> checkboxes = WaitFor.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
				By.xpath("(//input[@type='checkbox'][not(@disabled)])[position() <= 3]")));
		for (WebElement checkbox : checkboxes) {
			Keyword.scrollwindowintoView(checkbox);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Keyword.enableField(checkbox);
			if (!checkbox.isSelected()) {
				checkbox.click();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		// Verify if all checkboxes are selected
		for (int i = 0; i < checkboxes.size(); i++) {
			System.out.println("Checkbox " + (i + 1) + " selected: " + checkboxes.get(i).isSelected());
		}

	}

	public void eventContact() {
		WebElement phoneNumberInput = WaitFor.wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Phone Number']")));
		Keyword.scrollwindowintoView(phoneNumberInput);

		try {
			Thread.sleep(1000); // Adjust time as needed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		phoneNumberInput.sendKeys("919890877289");

		WebElement submitButton = WaitFor.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//span[@class=\"w-full active:bg-[#047860] py-[10px] rounded-[6px] flex justify-center gap-[12px] items-center bg-[#05A987] text-[#FFF]\"]")));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submitButton.click();

		System.out.println("save and continue on step 2Test executed successfully!");

	}

	public void ticketTier() {
		// Enter "Gold" in the "Enter Ticket Tier Title" field
		WaitFor.visiblityOfElement(ticketTierTitle);
		ticketTierTitle.sendKeys("Gold");

		// Enter 100 in "Enter Number of Tickets" field

		numOfTickets.sendKeys("100");

		// Enter 1000 in "Enter Amount" field
		amountField.sendKeys("1000");

		WebElement restrictionDropdown = WaitFor.wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder=\"Select Restriction\"]")));

		// Scroll to the element to ensure visibility
		Keyword.scrollwindow(restrictionDropdown);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Allow UI to adjust

		// Click using JavaScript to bypass interception issues
		JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
		js.executeScript("arguments[0].click();", restrictionDropdown);
		// Find the "Transferable" option
		WebElement transferableOption = WaitFor.wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//ul[contains(@class, 'options-list')]//li[span[text()='Transferable']]")));

		// Scroll into view
		js.executeScript("arguments[0].scrollIntoView(true);", transferableOption);

		// Click using JavaScript Executor to bypass interception issues
		js.executeScript("arguments[0].click();", transferableOption);

		System.out.println(" 'Transferable' option selected successfully!");

		ticketBenefits.sendKeys("This is a sample benefit description for Gold Tier.");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement tierCheckbox = Keyword.driver.findElement(By.xpath("//input[@type='checkbox']"));
		Keyword.toClick(tierCheckbox);

		// Save and Continue
		WebElement saveAndContinueBtn = WaitFor.wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Save and Continue')]")));

		Keyword.scrollwindowintoView(saveAndContinueBtn);
		saveAndContinueBtn.click();

		System.out.println("Ticket Tier Form Filled Successfully!");
		WaitFor.elementToBeClickableMethod(ticketPrefernce);
		ticketPrefernce.click();
		
		WebElement saveButtonOn3Step=Keyword.driver.findElement(By.xpath("//span[contains(text(), 'Save and Continue')]"));
		js.executeScript("arguments[0].click();", saveButtonOn3Step);

		Keyword.scrollwindowintoView(saveButtonOn3Step);
		Keyword.clickOn(saveButtonOn3Step);
		
		//button[text()="Save and Continue "]
		
		// Locate the "Save and Continue" button using XPath
		//WebElement saveButton4 = Keyword.driver.findElement(By.xpath("//button[@class=\"submit-button w-full active:bg-[#047860] py-[10px] rounded-[6px] flex justify-center gap-[12px] items-center bg-[#05A987] text-[#FFF]\"]"));
		 WebElement saveAndContinueBtn4 = WaitFor.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(., 'Save and Continue')]")));

         // Scroll into view
        Keyword.scrollwindowintoView(saveAndContinueBtn4);
         try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Give it time to scroll

         // Click using JavaScript if normal click fails
         Keyword.jsClick(saveAndContinueBtn4);
      //   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveAndContinueBtn4);

         System.out.println("Clicked on Save and Continue");

     
     }

		
		
	}


