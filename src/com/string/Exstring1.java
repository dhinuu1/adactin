package com.string;

public class Exstring1 {
		public static void main(String[] args) {
			String b="Bachelor of CS";
			
			int length=b.length();
			System.out.println("length:" + length);
			
			Boolean equals=b.equals("Bachelor of CS");
			System.out.println("equals: " + equals);
			
			Boolean equalsIgnoreCase=b.equalsIgnoreCase("Bachelor of CS");
			System.out.println("equalsIgnoreCase:" +equalsIgnoreCase);	
			
			String uppercase=b.toUpperCase();
			System.out.println("uppercase:" + uppercase);
			
			String lowercase=b.toLowerCase();
			System.out.println("lowercase:" + lowercase);
			
		}
	

}
