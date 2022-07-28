package com.stockmanagement.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio extends Stock {

	   ArrayList<Stock> arrayList = new ArrayList<>();
	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	StockPortfolio obj1 = new StockPortfolio();
	        System.out.println("Welcome to stock management");
	        while (true) {
	            System.out.println("Enter the choice !!! \n1)Enter new stock \n2)Display Stock report "
	                    + "\n3)exit");
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1 -> obj1.addStocks();
	                case 2 -> obj1.stockReport();
	                case 3 -> {
	                    System.out.println("exiting");
	                    System.exit(0);
	                }
	                default -> System.out.println("invalid input");
	            }
	        }
	    }

	    public void addStocks() {
	        Stock stock = new Stock();
	        System.out.println("Enter the stock name");
	        stock.setShareName(scanner.next());

	        System.out.println("Enter the number of shares present");
	        stock.setShareCount(scanner.nextDouble());

	        System.out.println("Enter the share price");
	        stock.setSharePrice(scanner.nextDouble());

	        //adding object to array list
	        arrayList.add(stock);
	    }

	    public void stockReport() {
	        Double sum = 0.0;
	        System.out.println("    STOCK REPORT    ");
	        System.out.println("stock name            Number of shares         Stock price        Total price of stock ");
	        for (int i = 0; i < arrayList.size(); i++) {
	            Stock s = arrayList.get(i);
	            double totalPrice = s.getShareCount() * s.getSharePrice();
	            totalPrice = sum + totalPrice;
//	            System.out.format("stock name = " + s.getStockNames() + "\n number of shares = " + s.getNumOfShare() +
//	                    "\n Stock price = " + s.getSharePrice() + "\nTotal price of stock = " + totalPrice + "\n");
	            System.out.format("%-10s            %-10.3f               %-10.3f         %-10.3f\n",s.getShareName(),s.getShareCount(),s.getSharePrice(),totalPrice);

	        }
	    }
}

