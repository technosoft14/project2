package org.adactin.AdactinWithBaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
	static WebDriver driver;
	public static WebDriver launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\eclipse-workspace\\AdactinWithBaseClass\\src\\main\\java\\org\\adactin\\AdactinWithBaseClass\\BaseClass.java");
		 WebDriver driver=new ChromeDriver();
		driver.get(url);
		return driver;

	}
	public static void url(WebDriver driver,String url) {
        url=driver.getCurrentUrl();
        System.out.println(url);
	}
	public static void title(WebDriver driver,String title) {
         title=driver.getTitle();
         System.out.println(title);
	}
	
	public static void type(WebElement e,String n) {
		e.sendKeys(n);
		

	}
	public static void windowMaximize(WebDriver driver) {
	    driver.manage().window().maximize();

	}
	public static void text(WebElement e,String n) {
		n=e.getText();
		System.out.println(n);

	}
	public static void attributeValue(WebElement e,String n,String value) {
		n=e.getAttribute(value);
		System.out.println(n);

	}
	public static void click(WebElement e) {
        e.click();
	}
	public static void to(WebDriver driver,String url) {
		driver.navigate().to(url);
		

	}
	public static void back(WebDriver driver) {
		driver.navigate().back();
		

	}
	public static void forward(WebDriver driver) {
		driver.navigate().forward();
		

	}
	public static void refresh(WebDriver driver) {
		driver.navigate().refresh();
		

	}
	public static void moveToElement(WebElement e,WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();

	}
	public static void dragAndDrop(WebElement src,WebElement des,WebDriver driver) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
		

	}
	public static void doubleClick(WebElement e,WebDriver driver) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();

	}
	public static void contextClick(WebElement e,WebDriver driver) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();

	}
	public static void keyDownUp(WebElement e,WebDriver driver,String n) {
		Actions a=new Actions(driver);
		a.keyDown(e, Keys.SHIFT).sendKeys(n).keyUp(e, Keys.SHIFT).perform();

	}
	
	public static void isEnabled(WebElement e,boolean b) {
		e.click();
	    b = e.isEnabled();
	    System.out.println(b);

	}
	public static void isDisplayed(WebElement e,boolean b) {
		e.click();
		b=e.isDisplayed();
		System.out.println(b);

	}
	public static void isSelected(WebElement e,boolean b) {
		e.click();
		b=e.isSelected();
		System.out.println(b);

	}
	public static void getWindowHandle(WebDriver driver,String parent) {
        parent=driver.getWindowHandle();
        System.out.println(parent);
	}
	public static void getWindowHandles(WebDriver driver,Set<String> all) {
        all=driver.getWindowHandles();
        System.out.println(all);
    }
	public static void switchToWindow(WebDriver driver,String n) {
		driver.switchTo().window(n);

	}
	public static void switchTOChildWindow(WebDriver driver,String parent,Set<String> all) {
		parent=driver.getWindowHandle();
		 all=driver.getWindowHandles();
		 for (String child : all) {
			 if(!(parent.equals(child))) {
				 driver.switchTo().window(child);
				 
			 }
			
		}

	}
	public static void webTable(List<WebElement> row,List<WebElement> cell,WebDriver driver,String s,String tr,String td) {
		row=driver.findElements(By.tagName(tr));
		for (WebElement trow : row) {
			cell=trow.findElements(By.tagName(td));
			for (WebElement tcell : cell) {
				s=tcell.getText();
				System.out.println(s);
				}
			
		}

	}
	public static void particularCellData(List<WebElement> row,List<WebElement> cell,WebDriver driver,String data,String s,String tr,String td) {
		row=driver.findElements(By.tagName(tr));
		for (WebElement trow : row) {
			cell=trow.findElements(By.tagName(td));
			for (WebElement tcell : cell) {
				s=tcell.getText();
				if(s.equals(data)) {
					System.out.println(s);
					tcell.click();
				}
				
				}
			}
			

	}
	public static void alertAccept(WebDriver driver) {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public static void alertDismiss(WebDriver driver) {
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	public static void scrollDown(WebElement down,WebDriver driver) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", down);
		

	}
	public static void scrollUp(WebElement up,WebDriver driver) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(false)", up);
		

	}
	public static void jScriptSet(WebDriver driver,WebElement e,String n) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('value',n)", e);
		

	}
	public static void jScriptGet(WebDriver driver,WebElement e,String n,Object o) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		o = j.executeScript("return arguments[0].getAttribute('value')", e);
		n=(String)o;
		System.out.println(n);
		

	}
	public static void jScriptClick(WebDriver driver,WebElement e) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()", e);
		

	}
	public static void createFolder(String path,boolean b) {
         File f=new File(path);
         b=f.mkdir();
         System.out.println(b);
         
	}
	public static void multipleFolders(String path,boolean b) {
		File f=new File(path);
        b=f.mkdirs();
        System.out.println(b);

	}
	public static void createTextFile(String path,boolean b) throws IOException {
		File f=new File(path);
		b=f.createNewFile();
		System.out.println(b);
		
	}
	public static void fileOrNot(String path,boolean b) {
		File f=new File(path);
		b=f.isFile();
		System.out.println(b);
		

	}
	public static void directoryOrNot(String path,boolean b) {
		File f=new File(path);
		b=f.isDirectory();
		System.out.println(b);

	}
	public static void printListOfFiles(String path,File[]  l) {
		File f=new File(path);
	    l = f.listFiles();
	    for (File file : l) {
	    	System.out.println(file);
			
		}

	}
	public static void copyOneFolderToAnother(String path1,String path2,File src,File des) throws IOException {
		src=new File(path1);
		des=new File(path2);
		FileUtils.copyDirectory(src, des);
		

	}
	
	public static void readValuesFromTextFile(String path,List<String> l) throws IOException {
		File f=new File(path);
		l = FileUtils.readLines(f);
		System.out.println(l);
		

	}
	public static void readLineOneByOne(String path,String n) throws IOException {
		File f=new File(path);
		n=FileUtils.readFileToString(f);
		System.out.println(n);
		
	}
	public static void writeInTextFile1(String path,String n) throws IOException {
		File f=new File(path);
		FileUtils.write(f, n);
		

	}
	public static void writeInTextFile2(String path,String n) throws IOException {
		File f=new File(path);
		FileUtils.write(f, n, true);
		

	}
	public static void deleteFile(String path,boolean b) {
		File f=new File(path);
		b=f.delete();
		System.out.println(b);
		

	}
	public static void deleteFolder(String path) throws IOException {
		File f=new File(path);
		FileUtils.deleteDirectory(f);	

	}
	public static void dropDownValue(WebElement e,String n) {
		Select s=new Select(e);
		s.selectByValue(n);

	}
	public static void dropDownIndex(WebElement e,int i) {
		Select s=new Select(e);
		s.selectByIndex(i);

	}
	public static void dropDownText(WebElement e,String n) {
		Select s=new Select(e);
		s.selectByVisibleText(n);

	}
	public static void dropDownGetOptions(WebElement e,List<WebElement> l,String n) {
		Select s=new Select(e);
		l = s.getOptions();
		for (WebElement all : l) {
			n=all.getText();
			System.out.println(n);
			s.selectByVisibleText(n);
				
		}
		
	}
	public static void dropDownMultiple(WebElement e,List<WebElement> l,String n,String a,String b) {
		Select s=new Select(e);
		l = s.getOptions();
		for (WebElement all : l) {
			n=all.getText();
			System.out.println(n);
			
			if(n.equals(a)||n.equals(b)) {
				s.selectByVisibleText(n);
			}
			
				
		}
		
	}
	public static void dropDownGetAllSelectedOptions(WebElement e,List<WebElement> all,String n) {
		Select s=new Select(e);
		all = s.getAllSelectedOptions();
		for (WebElement allselect : all) {
			n=allselect.getText();
			System.out.println(n);
			
			
		}

	}
	public static void dropDownFirstSelected(WebElement e,WebElement first,String n) {
		Select s=new Select(e);
		first = s.getFirstSelectedOption();
		n = first.getText();
		System.out.println(n);
		
	}
	public static void dropDownIsMultiple(WebElement e,boolean b) {
		Select s=new Select(e);
		b = s.isMultiple();
		System.out.println(b);

	}
	public static void dropDownDeselectIndex(WebElement e,int i) {
		Select s=new Select(e);
		s.deselectByIndex(i);

	}
	public static void dropDownDeselectValue(WebElement e,String n) {
		Select s=new Select(e);
		s.deselectByValue(n);

	}
	public static void dropDownDeselectText(WebElement e,String n) {
		Select s=new Select(e);
		s.deselectByVisibleText(n);

	}
	public static void screenShot(WebDriver driver,OutputType<File> name,File src,File des,String path) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		src=tk.getScreenshotAs(name);
		des=new File(path);
		FileUtils.copyFile(src, des);
	}
	public static void implicitWait(Long l,TimeUnit name,WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(l, name);

	}
	public static void explicitWait(WebDriver driver,int i,WebDriverWait w,WebElement e,WebElement btn) {
	    w=new WebDriverWait(driver, i);
	    e=w.until(ExpectedConditions.elementToBeClickable(btn));
	    e.click();
	  
	}
	public static void fluentWait(long l,TimeUnit unit,long l1,TimeUnit unit1,WebElement e,	Object o) {
		Wait w=new FluentWait(driver).withTimeout(l, unit).pollingEvery(l1,unit1).ignoring(Throwable.class);
		o = w.until(ExpectedConditions.elementToBeClickable(e));
		e=(WebElement)o;
		e.click();
	}
	public static void iframeIdAndName(String idnandname,WebDriver driver) {
		driver.switchTo().frame(idnandname);
		
	}
	
	public static void iframeElement(WebDriver driver,WebElement e) {
		driver.switchTo().frame(e);

	}
	public static void iframeIndex(WebDriver driver,int i) {
		driver.switchTo().frame(i);
		

	}
	public static void sizeOfFrame(String s,List<WebElement> e,WebDriver driver,int i) {
		e = driver.findElements(By.tagName(s));
		i = e.size();
		System.out.println(i);

	}
	public static void readValueFromXL(File f,String path,String name,int i,int j) throws IOException {
		f=new File(path);
		FileInputStream s=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(s);
		Sheet sheet=w.getSheet(name);
		Row r=sheet.getRow(i);
	    Cell c = r.getCell(j);
	    System.out.println(c);
		
	}
	public static void readRowsColumnsFromXL(File f,String path,String name,int rows,int cells,int i) throws IOException {
		f=new File(path);
		FileInputStream s=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(s);
		Sheet sheet=w.getSheet(name);
		rows=sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		Row r = sheet.getRow(i);
		cells=r.getPhysicalNumberOfCells();
		System.out.println(cells);

	}
	public static void printAllValuesFromRows(File f,String path,String name,int i) throws IOException {
		f=new File(path);
		FileInputStream s=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(s);
		Sheet sheet=w.getSheet(name);
		Row r = sheet.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
			Cell c = r.getCell(j);
			System.out.println(c);
		}

	}
	public static void printAllValuesFromXL(File f,String path,String name) throws IOException {
		f=new File(path);
		FileInputStream s=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(s);
		Sheet sheet=w.getSheet(name);
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row r = sheet.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c=r.getCell(j);
				System.out.println(c);
			}
		}

	}
	public static void getCellType(File f,String path,String name,int i,int j) throws IOException {
		f=new File(path);
		FileInputStream s=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(s);
		Sheet sheet=w.getSheet(name);
		Row r = sheet.getRow(i);
		Cell c = r.getCell(j);
		int type = c.getCellType();
		System.out.println(type);
		

	}
	public static String getStringNumericDataCellValue(File f,String path,String name,int i,int j,Date date) throws IOException {
		f=new File(path);
		FileInputStream s=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(s);
		Sheet sheet=w.getSheet(name);
		Row r = sheet.getRow(i);
		Cell c = r.getCell(j);
		int type = c.getCellType();
		System.out.println(type);
		String value=null;
		if(type==1) {
			value = c.getStringCellValue();
			System.out.println(value);
		}
		else if (type==0) {
			if(DateUtil.isCellDateFormatted(c)) {
				date=c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("mm/dd/yyyy");
				value=sim.format(date);
				System.out.println(value);
				
				
				
			}
			else {
				double d = c.getNumericCellValue();
				long l=(long)d;
			    value=String.valueOf(l);
			    System.out.println(value);
				
			}
			
		}
		return value;

	}
	public static void updateValuesInXL(File f,String path,String name,int i,int j,String value,String n,String cellvalue) throws IOException {
		f=new File(path);
		FileInputStream s=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(s);
		Sheet sheet=w.getSheet(name);
		Row r = sheet.getRow(i);
		Cell c = r.getCell(j);
		int type = c.getCellType();
		System.out.println(type);
		value = c.getStringCellValue();
		if(value.equals(cellvalue)) {
			c.setCellValue(n);
			
		}
		FileOutputStream f1=new FileOutputStream(f);
		w.write(f1);
         
	}
	
	public static void createWriteValuesInXL(File f,String path,int i,int j,String value) throws IOException {
		f=new File(path);
		Workbook w=new XSSFWorkbook();
		Sheet sheet=w.createSheet();
		Row r = sheet.createRow(i);
		Cell c = r.createCell(j);
		c.setCellValue(value);
		FileOutputStream f1=new FileOutputStream(f);
		w.write(f1);
		

	}
	public static void close(WebDriver driver) {
		driver.close();

	}
	public static void quit(WebDriver driver) {
         driver.quit();
	}

}
