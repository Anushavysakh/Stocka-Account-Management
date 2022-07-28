package com.stockmanagement.assignment;

public class Stock {
	 private String shareName;
	    private double sharePrice;
	    private double shareCount;
	    public Stock(String shareName,double sharePrice,double shareCount) {
			this.shareName = shareName;
			this.sharePrice = sharePrice;
			this.shareCount = shareCount;
		}
	    
		public Stock() {
			// TODO Auto-generated constructor stub
		}

		public String getShareName() {
			return shareName;
		}
		
		public void setShareName(String shareName) {
			this.shareName = shareName;
		}
		
		public double getSharePrice() {
			return sharePrice;
		}
		
		public void setSharePrice(double sharePrice) {
			this.sharePrice = sharePrice;
		}
		
		public double getShareCount() {
			return shareCount;
		}
		
		public void setShareCount(double shareCount) {
			this.shareCount = shareCount;
		}
		
		public String toString(){
			return shareName+" "+sharePrice+" "+shareCount+"  "+(sharePrice*shareCount)+" "+"\n";
		}

}
