package com.ugurcetin.robot;

import org.springframework.stereotype.Component;

@Component("lacivertBas")
public class Lacivert implements Bas {

	@Override
	public void olustur() {
		
		System.out.println("Lacivert baş robota eklendi.");

	}

}
