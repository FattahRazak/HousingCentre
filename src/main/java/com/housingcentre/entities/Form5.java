package com.housingcentre.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="formlist5")
@Entity
public class Form5 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String jawatan6;
	private String gaji8;
	
	
	//start of bahagian 3 borang
	private String name3;
	private int age3;
	private String birthdate3;
	private String placeofbirth3;
	private String IC3;
	private String ICcolor3;
	
	
	//start of bahagian 4 borang
	private String anak;
	
	//start of bahagian 5 borang
	private String tanah;
	private String LTS;
	private String tanahtempat;
	
	//start of bahagian 6 borang
	private String tarikh;

	public Form5 () {
	}
	
	public Form5(String jawatan6, String gaji8, String name3, int age3, String birthdate3, String placeofbirth3,
			String IC3, String ICcolor3, String anak, String tanah, String LTS, String tanahtempat, String tarikh) {
		
		this.jawatan6 = jawatan6;
		this.gaji8 = gaji8;
		this.name3 = name3;
		this.age3 = age3;
		this.birthdate3 = birthdate3;
		this.placeofbirth3 = placeofbirth3;
		this.IC3 = IC3;
		this.ICcolor3 = ICcolor3;
		this.anak = anak;
		this.tanah = tanah;
		this.LTS = LTS;
		this.tanahtempat = tanahtempat;
		this.tarikh = tarikh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJawatan6() {
		return jawatan6;
	}

	public void setJawatan6(String jawatan6) {
		this.jawatan6 = jawatan6;
	}

	public String getGaji8() {
		return gaji8;
	}

	public void setGaji8(String gaji8) {
		this.gaji8 = gaji8;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public int getAge3() {
		return age3;
	}

	public void setAge3(int age3) {
		this.age3 = age3;
	}

	public String getBirthdate3() {
		return birthdate3;
	}

	public void setBirthdate3(String birthdate3) {
		this.birthdate3 = birthdate3;
	}

	public String getPlaceofbirth3() {
		return placeofbirth3;
	}

	public void setPlaceofbirth3(String placeofbirth3) {
		this.placeofbirth3 = placeofbirth3;
	}

	public String getIC3() {
		return IC3;
	}

	public void setIC3(String IC3) {
		this.IC3 = IC3;
	}

	public String getICcolor3() {
		return ICcolor3;
	}

	public void setICcolor3(String ICcolor3) {
		this.ICcolor3 = ICcolor3;
	}

	public String getAnak() {
		return anak;
	}

	public void setAnak(String anak) {
		this.anak = anak;
	}

	public String getTanah() {
		return tanah;
	}

	public void setTanah(String tanah) {
		this.tanah = tanah;
	}

	public String getLTS() {
		return LTS;
	}

	public void setLTS(String LTS) {
		this.LTS = LTS;
	}

	public String getTanahtempat() {
		return tanahtempat;
	}

	public void setTanahtempat(String tanahtempat) {
		this.tanahtempat = tanahtempat;
	}

	public String getTarikh() {
		return tarikh;
	}

	public void setTarikh(String tarikh) {
		this.tarikh = tarikh;
	}

	
}
