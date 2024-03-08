/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletonpattern;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class SingletonPattern {

    public static void main(String[] args) {
       CompanyInfo example= CompanyInfo.getInstance();
       example.displayInfo();
       
       example.setCompanyName("New Company Name");
       example.setOwner("Duy Nguyen");
       example.setPhoneNumber("9999999999");
       example.displayInfo();
    }
}
