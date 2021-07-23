package com.javas;

public class RepositryImp2{
	public static void main(String[] args)throws InvalidCodeException2 {
		Repositry r=new Repositry();
		System.out.println("country code between 70 to 99"+"  "+r.getCountryName("78"));
		System.out.println("country code of 908" +"   "+r.getCountryName("908"));
		System.out.println(r.getCountryName("011"));
		System.out.println(r.getCountryName("123"));
	
	}
}

