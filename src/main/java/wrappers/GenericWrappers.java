package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{

	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObject() {
		
		
		try {
			prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void unloadObject() {
		prop=null;
	}
	
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		
			
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				} else if(browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "./drivers/geckdriver.exe");
					driver = new FirefoxDriver();
				} else if(browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdrievr.ie.driver", "./driver/IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}
				
				driver.manage().window().maximize();
				
				driver.get(url);
				
				reportStep("The browser "+browser+" is launched with the given url "+url+" successfully", "Pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			reportStep("The browser "+browser+" is not launched due to session not created error", "Fail");
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
			reportStep("The browser "+browser+" is not launched as the urs doesnt contain http/https", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The browser "+browser+" is not launched due to unknown error", "Fail");
		
		}
		
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+idValue+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id "+idValue+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with id "+idValue+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+idValue+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "Fail");
		} finally {
			
		}
	
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			
			reportStep("The element with name "+nameValue+" is entered with date "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with name "+nameValue+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with name "+nameValue+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with name "+nameValue+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with name "+nameValue+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with name "+nameValue+"is not entered with data "+data+" due to unknown error", "Fail");
		} finally {
			
		}
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			waitProperty(2000);
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathValue+"is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "Fail");
		} finally {
			
		} 
		
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.getTitle();
			if(actualText.equals(title)) {
				reportStep("The title of the page "+actualText+" is matched with the expected title "+title, "Pass");
			} else {
				reportStep("The title of the page "+actualText+" is not matched with the expected titele "+title, "Fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("The title of the page "+title+" is not verified due to unknown error", "Fail");
		} finally {
			
		}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if (actualText.equals(text)) {
				reportStep("The element with id "+id+" is holding the text "+actualText+" is matched with the expected text "+text, "Pass");
			} else {
				reportStep("The element with id "+id+" is holding the text "+actualText+" is not matched with the expected text "+text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exceptions
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with is "+id+" is not matched with the text "+text+" due to unknown error", "Fail");
		} finally {
			
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is matched with the expected text "+text, "Pass");
			}else {
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with the expected text "+text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpath+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The  element with xpath "+xpath+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpath+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpath+" is not matched with the text "+text+" due to unknown error", "Fail");
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.contains(text)) {
				reportStep("The element with xpath "+xpath+" contains the text "+actualText+" expected text "+text, "Pass");
			} else {
				reportStep("The element with xpath "+xpath+" contains the text "+actualText+" is not contains the expected text "+text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpath+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpath+" is not stable in the application ", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep(" the element with xpath "+xpath+" does not contains with the "+text+" due to unknown error", "Fail");
		} finally {
			
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			reportStep("The element with id "+id+" is clicked successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" click is  intercepted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("the element with id "+id+" is not been clicked due to unknown error", "Fail");
		} finally {
			
		}
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByClassName(classVal).click();
			reportStep("The element with calssname "+classVal+" is been clicked successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The elemene with classname "+classVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with classname "+classVal+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			reportStep("The element with classname "+classVal+" click is intercepted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with classname "+classVal+" is not stable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with classname "+classVal+" is not interactable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with classname "+classVal+" is not been clicked due to unknown error", "Fail");
		} finally {
			
		}
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			reportStep("The element with name "+name+" is been clicked successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with name "+name+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" click is intercepted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not stable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with name "+name+" is not interactable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The elemebt with name "+name+" is not been clicked due to unknown error", "Fail");
		} finally {
			
		}
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			reportStep("the element with linktext "+name+" is been clicked successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with linktext "+name+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+" click is intercepted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+" is not stable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+" is not interactable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+" is not been clicked due to unknown error", "Fail");
		} finally {
			
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			reportStep("The element with linktext "+name+" is been clicked successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with linktext "+name+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+" click is intercepted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+" is not stable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+"is not interactable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with linktext "+name+" is not been clicked due to unknown error", "Fail");
		} finally {
			
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			waitProperty(2000);
			reportStep("The element with xpath "+xpathVal+" is been clicked successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The elemebt with xpath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" click is intercepted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not been clicked due to unknown error", "Fail");
		} 
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			waitProperty(2000);
			reportStep("The element with xpath "+xpathVal+" is been clicked successfully","Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The elemebt with xpath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" click is intercepted in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not interactable in the applicatinon", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not been clicked due to unknown error", "Fail");
		}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text =null;
		try {
			 text = driver.findElementById(idVal).getText();
			 reportStep("The element with id "+idVal+" gets the data is "+text,"Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+idVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id "+idVal+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with id "+idVal+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+idVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id "+idVal+" is not getting data due to unknown error", "Fail");
		} finally {
			
		}
		return text;
	
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = driver.findElementByXPath(xpathVal).getText();
			reportStep("The element with xpath "+xpathVal+" gets the data is "+text,"Pass");
			return text;
		} catch (NoSuchElementException  e) {
			// TODO Auto-generated catch block
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with xpath "+xpathVal+" is not getting data due to unknown error", "Fail");
		} finally {
			
		}
		return text;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementById(id);
			Select select = new Select(element);
			select.selectByVisibleText(value);
			reportStep("The element with id "+id+" the value "+value+" is selected by text successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not selectable in the allpication", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" the value is not selected due to unknown error", "fail");
		} finally {
			
		}
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementById(id);
			Select select = new Select(element);
			select.selectByIndex(value);
			reportStep("The element with id "+id+" the value "+value+" is selected by by id successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" is not selected in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with id "+id+" the value is not selected due to unknown error", "Fail");
		} finally {
			
		}
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwindows= driver.getWindowHandles();
			for (String windowId : allwindows) {
				driver.switchTo().window(windowId);
				waitProperty(2000);
				break;
			}
			reportStep("The window has been switched to parent window successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The window is not available", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The window cannot be switched to parrent window due to unknown error", "Fail");
		} finally {
			
		}	
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWindows = driver.getWindowHandles();
			for (String windowId : allWindows) {
				driver.switchTo().window(windowId);
				waitProperty(2000);	
				}
			reportStep("The window has been switched to last window successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The window is not available", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("the window cannot be switched to last window due to unknown error", "Fail");
		} finally {
			
		}
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			reportStep("The alert is accepted successfully", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			reportStep("The alert is not present to accept", "Fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			reportStep("The alert is unhandled to accept", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The alert is not accepted due to unknown error", "Fail");
		} finally {
			
		}
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			reportStep("The alert is didmissed successfully", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			reportStep("The alert is not present to dismiss", "Fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			reportStep("The alert is unhandled to dismiss", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The alert is not dismissed due to unknown error", "Fail");
		} finally {
			
		}
				
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		try {
			String alertText = driver.switchTo().alert().getText();
			reportStep("The alerttext got from the alert box is "+alertText, "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			reportStep("The alerttext is not got from the alert box since there is not alert.", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The alerttext is not got due to unknown error", "Fail");
		
		}
		
		return null;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		try {
			
			number = (long) Math.floor(Math.random()*100000000+100000);
			 
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Reports/screenshots/"+number+".png");
			FileUtils.copyFile(temp, dest);
			//reportStep("The screenshot is taken successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			reportStep("The screenshot is not taken due to unknown error", "Fail",false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			reportStep("The screenshot is not taken due to the file does not exist", "Fail",false);
		} 
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			reportStep("Active browser is closed successfully", "Pass",false);
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			reportStep("Active browser are not cloded due to no such session exist", "Fail",false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("Active browser are not closed due to unknown error", "Fail",false);
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			reportStep("All active brosers are closed successfully", "Pass",false);
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			reportStep("All active browsers are not closed due to no such session exist", "Fail",false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("All active browsers are not closed due to unknown error", "Fail",false);
		}
		}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void scrolldown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectVisibileTextByName(String Name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementByName(Name);
			Select select = new Select(element);
			select.selectByVisibleText(value);
			reportStep("The element with name the value is "+value+" selected ByVisiableText Successfully","Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with Name "+Name+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with Name "+Name+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with Name "+Name+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with Name "+Name+" is not stable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			reportStep("The element with Name "+Name+" is not selectable in the allpication", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with Name "+Name+" the value is not selected due to unknown error", "Fail");
		} finally {
			
		
		}
		
	}

	public void switchToFrameByIndex(int index) {
		// TODO Auto-generated method stub
		 try {
			driver.switchTo().frame(index);
			reportStep("The Frame is switched to another frame by Index " + index, "Pass");
			} catch (NoSuchFrameException e) {
				// TODO Auto-generated catch block
				reportStep("The Frame is not switched due to no frame found in dom " + index, "Fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The Frame is not switched due to unknown error", "Fail");
			} finally {
				
			}
		}

	public void switchToFrameByStringNameOrId(String nameOrId) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(nameOrId);
			reportStep("The Frame is switched to another frame by name " + nameOrId, "Pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			reportStep("The Frame is not switched due to no frame found in dom " + nameOrId, "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The Frame is not switched due to unknown error", "Fail");
		} finally {
			
		}

	}

	public void switchToFrameByWebElement(WebElement frameElement) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(frameElement);
			reportStep("The Frame is switched to another frame by frameElement " + frameElement, "Pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			reportStep("The Frame is not switched due to no frame found in dom " + frameElement, "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The Frame is not switched due to unknown error", "Fail");
		} finally {
			
		}
	}

		
		public void switchToDefaultContent() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
			reportStep("The Frame is switched to another frame by defaultContent " , "Pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			reportStep("The Frame is not switched due to no frame found in dom ", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The Frame is not switched due to unknown error", "Fail");
		} finally {
			
		}
	}

		public void sendTextTOAlert(String text) {
			// TODO Auto-generated method stub
			try {
				driver.switchTo().alert().sendKeys(text);
				reportStep("The text is entered in prompt text field " + text, "Pass");
			} catch(NoAlertPresentException e) {
				// TODO Auto-generated catch block
				reportStep("The no alert is present in the DOM", "Fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The text is not enetered due to unknown error", "Fail");
			} 
		}

		public void refresh() {
			// TODO Auto-generated method stub
			try {
				driver.navigate().refresh();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void verifyTextContainsByString(String variable, String variable1) {
			// TODO Auto-generated method stub
			
		}

		public void selectByXpath(String xpath, String value) {
			// TODO Auto-generated method stub
			
			try {
				WebElement element = driver.findElementByXPath(xpath);
				Select select =new Select(element);
				select.selectByValue(value);
				reportStep("The element with xpath "+xpath+" the value "+value+" is selected by by id successfully", "Pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" is not stable in the application", "Fail");
			} catch (ElementNotSelectableException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" is not selected in the application", "Fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" the value is not selected due to unknown error", "Fail");
			} finally {
				
			
			}
			
		}

		public void selectVisibileTextByXpath(String xpath, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByXPath(xpath);
				Select select = new Select(element);
				select.selectByVisibleText(value);
				waitProperty(2000);
				reportStep("The element with name the value is "+value+" selected ByVisiableText Successfully","Pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" is not stable in the application", "Fail");
			} catch (ElementNotSelectableException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" is not selected in the application", "Fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" the value is not selected due to unknown error", "Fail");
			} finally {
				
			}
		}

		public void mouseHoverByXpath(String xpathVal) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByXPath(xpathVal);
				Actions action = new Actions(driver);
				action.moveToElement(element).perform();
				reportStep("The element with Xpath " + xpathVal + " mouseHover action is performed Successfully", "Pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				reportStep("The element with Xpath " + xpathVal + " is not found in DOM", "Fail");
			} catch (ElementNotVisibleException e) {
				// TODO: handle exception
				reportStep("The element with Xpath " + xpathVal + " is not visible in DOM", "Fail");
			} catch (ElementClickInterceptedException e) {
				// TODO: handle exception
				reportStep("The element with Xpath " + xpathVal + " is not clickable in DOM", "Fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				reportStep("The element with Xpath " + xpathVal + " is not interactable in DOM", "Fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				reportStep("The element with Xpath " + xpathVal + " is not stable in the application", "Fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The element with Xpath " + xpathVal + " mouseHover action is not performed due to unknown error", "Fail");
			} finally {
				
			}
		}

		public void switchToFrameByxpath(String xpath) {
			// TODO Auto-generated method stub
			try {
				driver.switchTo().frame(xpath);
				reportStep("The Frame is switched to another frame by xpath " + xpath, "Pass");
			} 
			catch (NoSuchFrameException e) {
				// TODO Auto-generated catch block
				reportStep("The Frame is not switched due to no frame found in dom " + xpath, "Fail");
			} 
			catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The Frame is not switched due to unknown error", "Fail");
			} 
			finally{
				
			}
		}

		public void selectVisibileTextByXpathNoSnap(String xpath, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement element = driver.findElementByXPath(xpath);
				Select select = new Select(element);
				select.selectByVisibleText(value);
				waitProperty(2000);
				reportStep("The element with name the value is "+value+" selected ByVisiableText Successfully","Pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" is not stable in the application", "Fail");
			} catch (ElementNotSelectableException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" is not selected in the application", "Fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The element with xpath "+xpath+" the value is not selected due to unknown error", "Fail");
			} finally {
				
			}
		}
		
		public void sendTexttoAlert(String text) {
			// TODO Auto-generated method stub
			try {
				driver.switchTo().alert().sendKeys(text);
				reportStep("The text is entered in prompt text field " + text, "Pass");
			} catch (NoAlertPresentException e) {
				// TODO Auto-generated catch block
				reportStep("The no alert is present in the DOM","Fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The text is not enetered due to unknown error","Fail");
			}
		}
		
		public void defaultFrame() {
			// TODO Auto-generated method stub
			try {
				driver.switchTo().defaultContent();
				reportStep("Sucessfully moved to Default Frame", "Pass");
			} catch (NoSuchFrameException e) {
				// TODO Auto-generated catch block
				reportStep("No Frame Present in the DOM", "Fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("Exception occured due to unknown error", "Fail");
			} 
			
		}
		
		public void switchToFrameById(String id) {
			// TODO Auto-generated method stub
			try {
				driver.switchTo().frame(id);
				reportStep("The Frame is switched to another frame by Id " + id, "pass");
			} catch (NoSuchFrameException e) {
				// TODO Auto-generated catch block
				reportStep("The Frame is not switched due to no frame found in dom " + id, "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				reportStep("The Frame is not switched due to unknown error", "fail");
			} 
		}

					
}