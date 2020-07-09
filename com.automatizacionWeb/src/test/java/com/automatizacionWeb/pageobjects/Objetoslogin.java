package com.automatizacionWeb.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://co.ebay.com/")
public class Objetoslogin extends PageObject{
	
	@FindBy(xpath="//*[@class='gh-tb ui-autocomplete-input']")
	public WebElement txtBuscar;
	
	@FindBy(xpath="//*[@value='Buscar']")
	public WebElement btnBuscar;
	
	@FindBy(xpath="//*[@id=\"x-refine__group_1__1\"]/ul/li[6]/div/a/div/div/span[1]")
	public WebElement puma;
	
	@FindBy(xpath="//*[@id=\"x-refine__group_1__0\"]/ul/li[4]/div/a/div/div/span[1]")
	public WebElement size10;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1")
	public WebElement result;
	
	@FindBy(xpath="//*[@id=\"s0-13-11-6-3-query_answer1-answer-2-1-0-list\"]/li[2]/div/a/div")//*[@id="nid-iFL-2"]/button/span/span
	public WebElement OrderbyPrice;
	
	@FindBy(xpath="//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")
	public WebElement elemento1;
	@FindBy(xpath="//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[2]/a/h3")
	public WebElement elemento2;
	@FindBy(xpath="//*[@id=\"srp-river-results\"]/ul/li[3]/div/div[2]/a/h3")
	public WebElement elemento3;
	
	@FindBy(xpath="//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[4]/div[1]/span") 
	public WebElement price1;
	@FindBy(xpath="//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[2]/div[4]/div[1]/span") 
	public WebElement price2;
	@FindBy(xpath="//*[@id=\"srp-river-results\"]/ul/li[3]/div/div[2]/div[4]/div[1]/span") 
	public WebElement price3;
	//*[@id="srp-river-results"]/ul/li[1]/div/div[2]/a/h3
	
	public void prueba() {
		
		txtBuscar.click();
		txtBuscar.sendKeys("shoes");
		waitFor(5).seconds();
		btnBuscar.click();
		waitFor(5).seconds();
		puma.isEnabled();
		puma.click();
		waitFor(5).seconds();
		size10.isEnabled();
		size10.click();
		System.out.println("Cantidad de shoes de size 10 "+result.getText());
		waitFor(3).seconds();
		OrderbyPrice.click();
		System.out.println("-"+elemento1.getText()+"-"+price1.getText());
		System.out.println("-"+elemento2.getText()+"-"+price2.getText());
		System.out.println("-"+elemento3.getText()+"-"+price3.getText());
		
		
		
	}


}
