package com.ugurcetin;
import org.springframework.beans.factory.annotation.Autowired;

public class Ders {

	@Autowired
	private Ogrenci ogrenci;
	

	private String dersAdi;
	private int puan;
	
	public Ders() {
	}
	
	public Ders(Ogrenci ogrenci) {
		//super();
		this.ogrenci = ogrenci;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public String getDersAdi() {
		return dersAdi;
	}

	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}
	
	
}
