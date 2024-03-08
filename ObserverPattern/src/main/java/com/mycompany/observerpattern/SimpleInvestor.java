/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerpattern;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class SimpleInvestor implements Investor{
    private String name;
    private Strategy currenStrategy;
    public SimpleInvestor(String name){
        this.name=name;
        this.currenStrategy= Strategy.MonitorOnly;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public Strategy addaptStategy() {
       return currenStrategy;
    }

    @Override
    public void update(String stockSymbol, double priceChange) {
        System.out.println(getName()+" was notified by the price change in "+ stockSymbol+": $"+priceChange);
        if(priceChange<50){
            System.out.println(" and change their strategy to "+ Strategy.HedgingStategy);
        }else if(priceChange>200){
            System.out.println(" and their strategy to "+ Strategy.QuickTransaction);
        }else {
            System.out.println(" and decide to do nothing");
        }
    }
}
