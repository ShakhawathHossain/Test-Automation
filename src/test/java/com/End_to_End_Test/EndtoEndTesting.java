package com.End_to_End_Test;

import com.config.BrowserConfig;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class EndtoEndTesting extends BrowserConfig {
    public static void main(String[] args) {

        String Firstname = firstnamegeneration();
        String Lastname = lastnamegeneration();
        String Email = emailgeneration(Firstname,Lastname);
        String Phonenumber = phonenumbergeneration();
        String Password = passwordgeneration();

        firefoxLaunch();
        openTestURL("https://demo.opencart.com/index.php?route=account/register");
        registration(Firstname,Lastname,Email,Phonenumber,Password);
        openTestURL("https://demo.opencart.com/index.php?route=account/login");
        login(Email,Password);


    }

    public static String firstnamegeneration()
    {
        Faker faker = new Faker();
        String firstname = faker.name().firstName();
        return firstname;
    }

    public static String lastnamegeneration()
    {
        Faker faker = new Faker();
        String lastname = faker.name().lastName();
        return lastname;
    }

    public static String emailgeneration(String firstname, String lastname)
    {
        Faker faker = new Faker();
        String email = firstname.toLowerCase()+lastname.toLowerCase()+"@email.com";
        return email;
    }

    public static String phonenumbergeneration()
    {
        Faker faker = new Faker();
        String phonenumber = faker.phoneNumber().phoneNumber();
        return phonenumber;
    }

    public static String passwordgeneration()
    {
        Faker faker = new Faker();
        Random ran_n = new Random();
        int password = ran_n.nextInt();
        String password_f = Integer.toString(password);
        return password_f;
    }

    public static void registration(String Firstname,String Lastname,String Email,String Phonenumber,String Password)
    {
        getElementByIDandType("input-firstname",Firstname);
        getElementByIDandType("input-lastname",Lastname);
        getElementByIDandType("input-email",Email);
        getElementByIDandType("input-telephone",Phonenumber);
        getElementByIDandType("input-password",Password);
        getElementByIDandType("input-confirm",Password);

        WebElement Privacy = driver.findElement(By.name("agree"));
        Privacy.click();

        WebElement Continue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
        Continue.click();

        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();
    }

    public static void login(String Email,String Password)
    {
        getElementByIDandType("input-email",Email);
        getElementByIDandType("input-password",Password);
        WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginBtn.click();
    }

}
