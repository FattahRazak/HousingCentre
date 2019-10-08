package com.housingcentre.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="formlist3")
@Entity
public class Form3 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String kerjasendiri;
	private String pekerjaan;
	private String gaji3;
	private String lainlain;
	private String jawatan3;
	private String gaji4;
	private String kawasan;
	
	//start of bahagian 2 borang
	private String name2;
	private int age2;
	private String birthdate2;
	private String placeofbirth2;
	private String IC2;
	private String ICcolor2;
	private String nationality2;
	private String kerajaan2;
	
	public Form3 () {
	}
	
	public Form3(String kerjasendiri, String pekerjaan, String gaji3, String lainlain, String jawatan3, String gaji4,
			String kawasan, String name2, int age2, String birthdate2, String placeofbirth2,
			String nationality2, String kerajaan2, String ICcolor2, String IC2) {
		
		this.kerjasendiri = kerjasendiri;
		this.pekerjaan = pekerjaan;
		this.gaji3 = gaji3;
		this.lainlain = lainlain;
		this.jawatan3 = jawatan3;
		this.gaji4 = gaji4;
		this.kawasan = kawasan;
		this.name2 = name2;
		this.age2 = age2;
		this.birthdate2 = birthdate2;
		this.placeofbirth2 = placeofbirth2;
		this.IC2 = IC2;
		this.ICcolor2 = ICcolor2;
		this.nationality2 = nationality2;
		this.kerajaan2 = kerajaan2;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getKerjasendiri() {
		return kerjasendiri;
	}


	public void setKerjasendiri(String kerjasendiri) {
		this.kerjasendiri = kerjasendiri;
	}


	public String getPekerjaan() {
		return pekerjaan;
	}


	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}


	public String getGaji3() {
		return gaji3;
	}


	public void setGaji3(String gaji3) {
		this.gaji3 = gaji3;
	}


	public String getLainlain() {
		return lainlain;
	}


	public void setLainlain(String lainlain) {
		this.lainlain = lainlain;
	}


	public String getJawatan3() {
		return jawatan3;
	}


	public void setJawatan3(String jawatan3) {
		this.jawatan3 = jawatan3;
	}


	public String getGaji4() {
		return gaji4;
	}


	public void setGaji4(String gaji4) {
		this.gaji4 = gaji4;
	}


	public String getKawasan() {
		return kawasan;
	}


	public void setKawasan(String kawasan) {
		this.kawasan = kawasan;
	}


	public String getName2() {
		return name2;
	}


	public void setName2(String name2) {
		this.name2 = name2;
	}


	public int getAge2() {
		return age2;
	}


	public void setAge2(int age2) {
		this.age2 = age2;
	}


	public String getBirthdate2() {
		return birthdate2;
	}


	public void setBirthdate2(String birthdate2) {
		this.birthdate2 = birthdate2;
	}


	public String getPlaceofbirth2() {
		return placeofbirth2;
	}


	public void setPlaceofbirth2(String placeofbirth2) {
		this.placeofbirth2 = placeofbirth2;
	}


	public String getIC2() {
		return IC2;
	}


	public void setIC2(String IC2) {
		this.IC2 = IC2;
	}


	public String getICcolor2() {
		return ICcolor2;
	}


	public void setICcolor2(String ICcolor2) {
		this.ICcolor2 = ICcolor2;
	}


	public String getNationality2() {
		return nationality2;
	}


	public void setNationality2(String nationality2) {
		this.nationality2 = nationality2;
	}


	public String getKerajaan2() {
		return kerajaan2;
	}


	public void setKerajaan2(String kerajaan2) {
		this.kerajaan2 = kerajaan2;
	}

	
	
}
