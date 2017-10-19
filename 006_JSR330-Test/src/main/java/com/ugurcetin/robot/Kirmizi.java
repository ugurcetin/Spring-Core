package com.ugurcetin.robot;

import org.springframework.stereotype.Component;

@Component("kirmiziBas")
public class Kirmizi implements Bas {

	@Override
	public void olustur() {
		
		System.out.println("Kırmızı baş robota eklendi.");

	}

}
