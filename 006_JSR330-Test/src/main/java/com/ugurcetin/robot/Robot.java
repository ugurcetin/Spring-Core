package com.ugurcetin.robot;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Robot {
	
	//JSR-330
	@Inject					//@Autowired
	@Named("sariBas")		//@Qualifier("sariBas")
	private Bas bas;
	
	public Robot() {
		
		System.out.println("Robotun düğmesine basıldı.");
	}
	
	public void takilanBasBilgisi() {
		bas.olustur();
		
	}

}
