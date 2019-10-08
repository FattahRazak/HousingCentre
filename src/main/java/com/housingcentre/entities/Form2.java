package com.housingcentre.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="formlist2")
@Entity
public class Form2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String address3;
	private String sendiri;
	private String menumpang;
	private String kerajaan;
	private String majikan;
	private String jawatan;
	private String bahagian;
	private String bahagian2;
	private String berkhidmatdate;
	private String gaji;
	private String swasta;
	private String majikan2;
	private String jawatan2;
	private String berkhidmatdate2;
	private String gaji2;
	
	public Form2 () {
	}
	
	public Form2(String address3, String sendiri, String menumpang, String kerajaan, String majikan, String jawatan,
			String bahagian, String bahagian2, String berkhidmatdate, String gaji, String swasta, String majikan2,
			String jawatan2, String berkhidmatdate2, String gaji2) {
		
		this.address3 = address3;
		this.sendiri = sendiri;
		this.menumpang = menumpang;
		this.kerajaan = kerajaan;
		this.majikan = majikan;
		this.jawatan = jawatan;
		this.bahagian = bahagian;
		this.bahagian2 = bahagian2;
		this.berkhidmatdate = berkhidmatdate;
		this.gaji = gaji;
		this.swasta = swasta;
		this.majikan2 = majikan2;
		this.jawatan2 = jawatan2;
		this.berkhidmatdate2 = berkhidmatdate2;
		this.gaji2 = gaji2;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddress3() {
		return address3;
	}


	public void setAddress3(String address3) {
		this.address3 = address3;
	}


	public String getSendiri() {
		return sendiri;
	}


	public void setSendiri(String sendiri) {
		this.sendiri = sendiri;
	}


	public String getMenumpang() {
		return menumpang;
	}


	public void setMenumpang(String menumpang) {
		this.menumpang = menumpang;
	}


	public String getKerajaan() {
		return kerajaan;
	}


	public void setKerajaan(String kerajaan) {
		this.kerajaan = kerajaan;
	}


	public String getMajikan() {
		return majikan;
	}


	public void setMajikan(String majikan) {
		this.majikan = majikan;
	}


	public String getJawatan() {
		return jawatan;
	}


	public void setJawatan(String jawatan) {
		this.jawatan = jawatan;
	}


	public String getBahagian() {
		return bahagian;
	}


	public void setBahagian(String bahagian) {
		this.bahagian = bahagian;
	}


	public String getBahagian2() {
		return bahagian2;
	}


	public void setBahagian2(String bahagian2) {
		this.bahagian2 = bahagian2;
	}


	public String getBerkhidmatdate() {
		return berkhidmatdate;
	}


	public void setBerkhidmatdate(String berkhidmatdate) {
		this.berkhidmatdate = berkhidmatdate;
	}


	public String getGaji() {
		return gaji;
	}


	public void setGaji(String gaji) {
		this.gaji = gaji;
	}


	public String getSwasta() {
		return swasta;
	}


	public void setSwasta(String swasta) {
		this.swasta = swasta;
	}


	public String getMajikan2() {
		return majikan2;
	}


	public void setMajikan2(String majikan2) {
		this.majikan2 = majikan2;
	}


	public String getJawatan2() {
		return jawatan2;
	}


	public void setJawatan2(String jawatan2) {
		this.jawatan2 = jawatan2;
	}


	public String getBerkhidmatdate2() {
		return berkhidmatdate2;
	}


	public void setBerkhidmatdate2(String berkhidmatdate2) {
		this.berkhidmatdate2 = berkhidmatdate2;
	}


	public String getGaji2() {
		return gaji2;
	}


	public void setGaji2(String gaji2) {
		this.gaji2 = gaji2;
	}
	
	

	
}


