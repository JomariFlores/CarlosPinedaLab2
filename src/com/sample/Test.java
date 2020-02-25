package com.sample;

public class Test {

	public static void main(String[] args) {
		Ipod ipodModel1 = new Ipod("10GB", "160 x 128", "10 Hours");
		ipodModel1.setSong("Frank Sinatra - Fly Me To The Moon");
		Ipod ipodModel2 = new Ipod("5GB", "160 x 128", "10 Hours");
		ipodModel2.setSong("Dean Martin - You're Nobody 'Til Somebody Loves You");
		
		System.out.println();
		System.out.println("Song Playing on Ipod #1: " + ipodModel1.getSong());
		System.out.println("Song Playing on Ipod #2: " + ipodModel2.getSong());
		
		System.out.println();
		Iphone iphoneModel1 = new Iphone("16GB", "320 x 480", "24 Hours", 2.0);
		iphoneModel1.setSong("Audrey Hepbrun - Moon River");
		iphoneModel1.setAlarm("4:00AM");
		iphoneModel1.setPhoto("Cat");
		
		System.out.println("Song Playing on Iphone: " + iphoneModel1.getSong());
		System.out.println("You have set an alarm at " + iphoneModel1.getAlarm() + " in your Iphone");
		System.out.println("You have taken a photo of a " + iphoneModel1.getPhoto());
	}
}