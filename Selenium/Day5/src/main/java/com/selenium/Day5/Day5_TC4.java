package com.selenium.Day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_TC4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				String url="https://j2store.net/free/";
				driver.get(url);
				driver.manage().window().maximize();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().forward();
				Thread.sleep(1000);
				driver.navigate().refresh();
				Thread.sleep(1000);
				driver.quit();

			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

