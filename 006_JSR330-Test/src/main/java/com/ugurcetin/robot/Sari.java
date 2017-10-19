package com.ugurcetin.robot;

import org.springframework.stereotype.Component;

@Component("sariBas")
public class Sari implements Bas {

	@Override
	public void olustur() {
		
		System.out.println("Sarı baş robota eklendi.");

	}

}
