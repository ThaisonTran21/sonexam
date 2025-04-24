package com.example.TranThaiSonPH47026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vietjetair.com/vi?utm_source=google-vj-vi&utm_medium=cpc&utm_campaign=ada_awoq12025_kw_rsa_0125awo_brand_name_awoq42024_cpa");
        driver.manage().window().maximize();

        WebElement dongY = driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/div/div[2]/button/span[1]"));
        dongY.click();
        Thread.sleep(2000);

        WebElement diemKH = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/inputt"));
        diemKH.sendKeys("Tp.Tp. Hồ Chí Minh (SGN)");

        WebElement diemDen = driver.findElement(By.xpath("//*[@id=\"arrivalPlaceDesktop\"]"));
        diemDen.sendKeys("Hà Nội (HAN)");

        WebElement ngayDi = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/p[2]"));
        WebElement ngayVe = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/p[2]"));

        WebElement hachKhach = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[3]/div"));

        WebElement timKiem = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div/div[2]/div[3]/button/span[1]"));
        timKiem.click();
    }


}
