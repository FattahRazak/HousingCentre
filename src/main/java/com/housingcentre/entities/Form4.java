package com.housingcentre.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="formlist4")
@Entity
public class Form4 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String majikan3;
	private String jawatan4;
	private String bahagian3;
	private String bahagian4;
	private String gaji5;
	private String berkhidmatdate3;
	private String swasta2;
	private String majikan4;
	private String jawatan5;
	private String berkhidmatdate4;
	private String gaji6;
	private String kerjasendiri2;
	private String pekerjaan2;
	private String gaji7;
	private String lainlain2;
	
	public Form4 () {
	}
	
	public Form4(String majikan3, String jawatan4, String bahagian3, String bahagian4, String gaji5,
			String berkhidmatdate3, String swasta2, String majikan4, String jawatan5, String berkhidmatdate4,
			String gaji6, String kerjasendiri2, String pekerjaan2, String gaji7, String lainlain2) {
		
		this.majikan3 = majikan3;
		this.jawatan4 = jawatan4;
		this.bahagian3 = bahagian3;
		this.bahagian4 = bahagian4;
		this.gaji5 = gaji5;
		this.berkhidmatdate3 = berkhidmatdate3;
		this.swasta2 = swasta2;
		this.majikan4 = majikan4;
		this.jawatan5 = jawatan5;
		this.berkhidmatdate4 = berkhidmatdate4;
		this.gaji6 = gaji6;
		this.kerjasendiri2 = kerjasendiri2;
		this.pekerjaan2 = pekerjaan2;
		this.gaji7 = gaji7;
		this.lainlain2 = lainlain2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMajikan3() {
		return majikan3;
	}

	public void setMajikan3(String majikan3) {
		this.majikan3 = majikan3;
	}

	public String getJawatan4() {
		return jawatan4;
	}

	public void setJawatan4(String jawatan4) {
		this.jawatan4 = jawatan4;
	}

	public String getBahagian3() {
		return bahagian3;
	}

	public void setBahagian3(String bahagian3) {
		this.bahagian3 = bahagian3;
	}

	public String getBahagian4() {
		return bahagian4;
	}

	public void setBahagian4(String bahagian4) {
		this.bahagian4 = bahagian4;
	}

	public String getGaji5() {
		return gaji5;
	}

	public void setGaji5(String gaji5) {
		this.gaji5 = gaji5;
	}

	public String getBerkhidmatdate3() {
		return berkhidmatdate3;
	}

	public void setBerkhidmatdate3(String berkhidmatdate3) {
		this.berkhidmatdate3 = berkhidmatdate3;
	}

	public String getSwasta2() {
		return swasta2;
	}

	public void setSwasta2(String swasta2) {
		this.swasta2 = swasta2;
	}

	public String getMajikan4() {
		return majikan4;
	}

	public void setMajikan4(String majikan4) {
		this.majikan4 = majikan4;
	}

	public String getJawatan5() {
		return jawatan5;
	}

	public void setJawatan5(String jawatan5) {
		this.jawatan5 = jawatan5;
	}

	public String getBerkhidmatdate4() {
		return berkhidmatdate4;
	}

	public void setBerkhidmatdate4(String berkhidmatdate4) {
		this.berkhidmatdate4 = berkhidmatdate4;
	}

	public String getGaji6() {
		return gaji6;
	}

	public void setGaji6(String gaji6) {
		this.gaji6 = gaji6;
	}

	public String getKerjasendiri2() {
		return kerjasendiri2;
	}

	public void setKerjasendiri2(String kerjasendiri2) {
		this.kerjasendiri2 = kerjasendiri2;
	}

	public String getPekerjaan2() {
		return pekerjaan2;
	}

	public void setPekerjaan2(String pekerjaan2) {
		this.pekerjaan2 = pekerjaan2;
	}

	public String getGaji7() {
		return gaji7;
	}

	public void setGaji7(String gaji7) {
		this.gaji7 = gaji7;
	}

	public String getLainlain2() {
		return lainlain2;
	}

	public void setLainlain2(String lainlain2) {
		this.lainlain2 = lainlain2;
	}

	
	
}
