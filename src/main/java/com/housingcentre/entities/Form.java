package com.housingcentre.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="formlist")
@Entity
public class Form {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//start of bahagian 1 borang
	private String name;
	private String gender;
	private int age;
	private String birthdate;
	private String placeofbirth;
	private String IC;
	private String ICcolor;
	private String martialstatus;
	private String nationality;
	private String address;
	private String address2;
	private String phonenumber;
//	private String address3;
//	private String sendiri;
//	private String menumpang;
//	private String kerajaan;
//	private String majikan;
//	private String jawatan;
//	private String bahagian;
//	private String bahagian2;
//	private String berkhidmatdate;
//	private String gaji;
//	private String swasta;
//	private String majikan2;
//	private String jawatan2;
//	private String berkhidmatdate2;
//	private String gaji2;  //////////
//	private String kerjasendiri;
//	private String pekerjaan;
//	private String gaji3;
//	private String lainlain;
//	private String jawatan3;
//	private String gaji4;
//	private String kawasan;
//	
//	private String name2;
//	private int age2;
//	private String birthdate2;
//	private String placeofbirth2;
//	private String IC2;
//	private String ICcolor2;
//	private String nationality2;
//	private String kerajaan2;//////
//	private String majikan3;
//	private String jawatan4;
//	private String bahagian3;
//	private String bahagian4;
//	private String gaji5;
//	private String berkhidmatdate3;
//	private String swasta2;
//	private String majikan4;
//	private String jawatan5;
//	private String berkhidmatdate4;
//	private String gaji6;
//	private String kerjasendiri2;
//	private String pekerjaan2;
//	private String gaji7;
//	private String lainlain2; ///////
//	private String jawatan6;
//	private String gaji8;
//	
//	private String name3;
//	private int age3;
//	private String birthdate3;
//	private String placeofbirth3;
//	private String IC3;
//	private String ICcolor3;
//	
//	private String anak;
//	
//	private String tanah;
//	private String LTS;
//	private String tanahtempat;
//	
//	private String tarikh;
	
	
	
	
	public Form (String name, int age, String IC,String ICcolor, String gender,String birthdate,String placeofbirth,
			String martialstatus,String nationality,String address, String address2,String phonenumber) {
		super();
		this.name = name;
		this.age = age;
		this.IC= IC;
		this.ICcolor= ICcolor;
		this.gender= gender;
		this.birthdate= birthdate;
		this.placeofbirth= placeofbirth;
		this.martialstatus = martialstatus;
		this.nationality= nationality;
		this.address= address;
		this.address2 = address2;
		this.phonenumber= phonenumber;
//		this.address3= address3;
//		this.sendiri= sendiri;
//		this.menumpang= menumpang;
//		this.kerajaan= kerajaan;
//		this.majikan= majikan;
//		this.jawatan= jawatan;
//		this.bahagian= bahagian;
//		this.bahagian2= bahagian2;
//		this.berkhidmatdate= berkhidmatdate;
//		this.gaji= gaji;
//		this.swasta= swasta;
//		this.majikan2= majikan2;
//		this.jawatan2= jawatan2;
//		this.berkhidmatdate2= berkhidmatdate2;
//		this.gaji2= gaji2;
//		this.kerjasendiri= kerjasendiri;
//		this.pekerjaan= pekerjaan;
//		this.gaji3= gaji3;
//		this.lainlain= lainlain;
//		this.jawatan3= jawatan3;
//		this.gaji4= gaji4;
//		this.kawasan= kawasan;
//		
//		this.name2= name2;
//		this.age2= age2;
//		this.birthdate2= birthdate2;
//		this.placeofbirth2= placeofbirth2;
//		this.IC2= IC2;
//		this.ICcolor2= ICcolor2;
//		this.nationality2= nationality2;
//		this.kerajaan2= kerajaan2;
//		this.majikan3= majikan3;
//		this.jawatan4= jawatan4;
//		this.bahagian3= bahagian3;
//		this.bahagian4= bahagian4;
//		this.gaji5= gaji5;
//		this.berkhidmatdate3= berkhidmatdate3;
//		this.swasta2= swasta2;
//		this.majikan4= majikan4;
//		this.jawatan5= jawatan5;
//		this.berkhidmatdate4= berkhidmatdate4;
//		this.gaji6= gaji6;
//		this.kerjasendiri2= kerjasendiri2;
//		this.pekerjaan2= pekerjaan2;
//		this.gaji7= gaji7;
//		this.lainlain2= lainlain2;
//		this.jawatan6= jawatan6;
//		this.gaji8= gaji8;
//		
//		this.name3= name3;
//		this.age3= age3;
//		this.birthdate3= birthdate3;
//		this.placeofbirth3= placeofbirth3;
//		this.IC3= IC3;
//		this.ICcolor3= ICcolor3;
//		
//		this.anak= anak;
//		
//		this.tanah= tanah;
//		this.LTS= LTS;
//		this.tanahtempat= tanahtempat;
//		
//		this.tarikh= tarikh;
		
	
		
	}
	
	public Form () {
	}
	
//	public Form(int id, String name, int age,  String IC,String ICcolor,String gender,String birthdate, String placeofbirth,String martialstatus, String nationality, String address,String phonenumber, String email) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.IC = IC;
//		this.ICcolor = ICcolor;
//		this.gender = gender;
//		this.birthdate = birthdate;
//		this.placeofbirth = placeofbirth;
//		this.martialstatus = martialstatus;
//		this.nationality = nationality;
//		this.birthdate = birthdate;
//		this.address = address;
//		this.phonenumber = phonenumber;
//		this.email = email;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIC() {
		return IC;
	}

	public void setIC(String IC) {
		this.IC = IC;
	}

	public String getICcolor() {
		return ICcolor;
	}

	public void setICcolor(String ICcolor) {
		this.ICcolor = ICcolor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getPlaceofbirth() {
		return placeofbirth;
	}

	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}

	public String getMartialstatus() {
		return martialstatus;
	}

	public void setMartialstatus(String martialstatus) {
		this.martialstatus = martialstatus;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	

//	public String getAddress3() {
//		return address3;
//	}
//
//	public void setAddress3(String address3) {
//		this.address3 = address3;
//	}
//
//	public String getSendiri() {
//		return sendiri;
//	}
//
//	public void setSendiri(String sendiri) {
//		this.sendiri = sendiri;
//	}
//
//	public String getMenumpang() {
//		return menumpang;
//	}
//
//	public void setMenumpang(String menumpang) {
//		this.menumpang = menumpang;
//	}
//
//	public String getKerajaan() {
//		return kerajaan;
//	}
//
//	public void setKerajaan(String kerajaan) {
//		this.kerajaan = kerajaan;
//	}
//
//	public String getMajikan() {
//		return majikan;
//	}
//
//	public void setMajikan(String majikan) {
//		this.majikan = majikan;
//	}
//
//	public String getJawatan() {
//		return jawatan;
//	}
//
//	public void setJawatan(String jawatan) {
//		this.jawatan = jawatan;
//	}
//
//	public String getBahagian() {
//		return bahagian;
//	}
//
//	public void setBahagian(String bahagian) {
//		this.bahagian = bahagian;
//	}
//
//	public String getBahagian2() {
//		return bahagian2;
//	}
//
//	public void setBahagian2(String bahagian2) {
//		this.bahagian2 = bahagian2;
//	}
//
//	public String getBerkhidmatdate() {
//		return berkhidmatdate;
//	}
//
//	public void setBerkhidmatdate(String berkhidmatdate) {
//		this.berkhidmatdate = berkhidmatdate;
//	}
//
//	public String getGaji() {
//		return gaji;
//	}
//
//	public void setGaji(String gaji) {
//		this.gaji = gaji;
//	}
//
//	public String getSwasta() {
//		return swasta;
//	}
//
//	public void setSwasta(String swasta) {
//		this.swasta = swasta;
//	}
//
//	public String getMajikan2() {
//		return majikan2;
//	}
//
//	public void setMajikan2(String majikan2) {
//		this.majikan2 = majikan2;
//	}
//
//	public String getJawatan2() {
//		return jawatan2;
//	}
//
//	public void setJawatan2(String jawatan2) {
//		this.jawatan2 = jawatan2;
//	}
//
//	public String getBerkhidmatdate2() {
//		return berkhidmatdate2;
//	}
//
//	public void setBerkhidmatdate2(String berkhidmatdate2) {
//		this.berkhidmatdate2 = berkhidmatdate2;
//	}
//
//	public String getGaji2() {
//		return gaji2;
//	}
//
//	public void setGaji2(String gaji2) {
//		this.gaji2 = gaji2;
//	}
//
//	public String getKerjasendiri() {
//		return kerjasendiri;
//	}
//
//	public void setKerjasendiri(String kerjasendiri) {
//		this.kerjasendiri = kerjasendiri;
//	}
//
//	public String getPekerjaan() {
//		return pekerjaan;
//	}
//
//	public void setPekerjaan(String pekerjaan) {
//		this.pekerjaan = pekerjaan;
//	}
//
//	public String getGaji3() {
//		return gaji3;
//	}
//
//	public void setGaji3(String gaji3) {
//		this.gaji3 = gaji3;
//	}
//
//	public String getLainlain() {
//		return lainlain;
//	}
//
//	public void setLainlain(String lainlain) {
//		this.lainlain = lainlain;
//	}
//
//	public String getJawatan3() {
//		return jawatan3;
//	}
//
//	public void setJawatan3(String jawatan3) {
//		this.jawatan3 = jawatan3;
//	}
//
//	public String getGaji4() {
//		return gaji4;
//	}
//
//	public void setGaji4(String gaji4) {
//		this.gaji4 = gaji4;
//	}
//
//	public String getKawasan() {
//		return kawasan;
//	}
//
//	public void setKawasan(String kawasan) {
//		this.kawasan = kawasan;
//	}
//
//	public String getName2() {
//		return name2;
//	}
//
//	public void setName2(String name2) {
//		this.name2 = name2;
//	}
//
//	public int getAge2() {
//		return age2;
//	}
//
//	public void setAge2(int age2) {
//		this.age2 = age2;
//	}
//
//	public String getBirthdate2() {
//		return birthdate2;
//	}
//
//	public void setBirthdate2(String birthdate2) {
//		this.birthdate2 = birthdate2;
//	}
//
//	public String getPlaceofbirth2() {
//		return placeofbirth2;
//	}
//
//	public void setPlaceofbirth2(String placeofbirth2) {
//		this.placeofbirth2 = placeofbirth2;
//	}
//
//	public String getIC2() {
//		return IC2;
//	}
//
//	public void setIC2(String iC2) {
//		IC2 = iC2;
//	}
//
//	public String getICcolor2() {
//		return ICcolor2;
//	}
//
//	public void setICcolor2(String iCcolor2) {
//		ICcolor2 = iCcolor2;
//	}
//
//	public String getNationality2() {
//		return nationality2;
//	}
//
//	public void setNationality2(String nationality2) {
//		this.nationality2 = nationality2;
//	}
//
//	public String getKerajaan2() {
//		return kerajaan2;
//	}
//
//	public void setKerajaan2(String kerajaan2) {
//		this.kerajaan2 = kerajaan2;
//	}
//
//	public String getMajikan3() {
//		return majikan3;
//	}
//
//	public void setMajikan3(String majikan3) {
//		this.majikan3 = majikan3;
//	}
//
//	public String getJawatan4() {
//		return jawatan4;
//	}
//
//	public void setJawatan4(String jawatan4) {
//		this.jawatan4 = jawatan4;
//	}
//
//	public String getBahagian3() {
//		return bahagian3;
//	}
//
//	public void setBahagian3(String bahagian3) {
//		this.bahagian3 = bahagian3;
//	}
//
//	public String getBahagian4() {
//		return bahagian4;
//	}
//
//	public void setBahagian4(String bahagian4) {
//		this.bahagian4 = bahagian4;
//	}
//
//	public String getGaji5() {
//		return gaji5;
//	}
//
//	public void setGaji5(String gaji5) {
//		this.gaji5 = gaji5;
//	}
//
//	public String getBerkhidmatdate3() {
//		return berkhidmatdate3;
//	}
//
//	public void setBerkhidmatdate3(String berkhidmatedate3) {
//		this.berkhidmatdate3 = berkhidmatdate3;
//	}
//
//	public String getSwasta2() {
//		return swasta2;
//	}
//
//	public void setSwasta2(String swasta2) {
//		this.swasta2 = swasta2;
//	}
//
//	public String getMajikan4() {
//		return majikan4;
//	}
//
//	public void setMajikan4(String majikan4) {
//		this.majikan4 = majikan4;
//	}
//
//	public String getJawatan5() {
//		return jawatan5;
//	}
//
//	public void setJawatan5(String jawatan5) {
//		this.jawatan5 = jawatan5;
//	}
//
//	public String getBerkhidmatdate4() {
//		return berkhidmatdate4;
//	}
//
//	public void setBerkhidmatdate4(String berkhidmatdate4) {
//		this.berkhidmatdate4 = berkhidmatdate4;
//	}
//
//	public String getGaji6() {
//		return gaji6;
//	}
//
//	public void setGaji6(String gaji6) {
//		this.gaji6 = gaji6;
//	}
//
//	public String getKerjasendiri2() {
//		return kerjasendiri2;
//	}
//
//	public void setKerjasendiri2(String kerjasendiri2) {
//		this.kerjasendiri2 = kerjasendiri2;
//	}
//
//	public String getPekerjaan2() {
//		return pekerjaan2;
//	}
//
//	public void setPekerjaan2(String pekerjaan2) {
//		this.pekerjaan2 = pekerjaan2;
//	}
//
//	public String getGaji7() {
//		return gaji7;
//	}
//
//	public void setGaji7(String gaji7) {
//		this.gaji7 = gaji7;
//	}
//
//	public String getLainlain2() {
//		return lainlain2;
//	}
//
//	public void setLainlain2(String lainlain2) {
//		this.lainlain2 = lainlain2;
//	}
//
//	public String getJawatan6() {
//		return jawatan6;
//	}
//
//	public void setJawatan6(String jawatan6) {
//		this.jawatan6 = jawatan6;
//	}
//
//	public String getGaji8() {
//		return gaji8;
//	}
//
//	public void setGaji8(String gaji8) {
//		this.gaji8 = gaji8;
//	}
//
//	public String getName3() {
//		return name3;
//	}
//
//	public void setName3(String name3) {
//		this.name3 = name3;
//	}
//
//	public int getAge3() {
//		return age3;
//	}
//
//	public void setAge3(int age3) {
//		this.age3 = age3;
//	}
//
//	public String getBirthdate3() {
//		return birthdate3;
//	}
//
//	public void setBirthdate3(String birthdate3) {
//		this.birthdate3 = birthdate3;
//	}
//
//	public String getPlaceofbirth3() {
//		return placeofbirth3;
//	}
//
//	public void setPlaceofbirth3(String placeofbirth3) {
//		this.placeofbirth3 = placeofbirth3;
//	}
//
//	public String getIC3() {
//		return IC3;
//	}
//
//	public void setIC3(String iC3) {
//		IC3 = iC3;
//	}
//
//	public String getICcolor3() {
//		return ICcolor3;
//	}
//
//	public void setICcolor3(String iCcolor3) {
//		ICcolor3 = iCcolor3;
//	}
//
//	public String getAnak() {
//		return anak;
//	}
//
//	public void setAnak(String anak) {
//		this.anak = anak;
//	}
//
//	public String getTanah() {
//		return tanah;
//	}
//
//	public void setTanah(String tanah) {
//		this.tanah = tanah;
//	}
//
//	public String getLTS() {
//		return LTS;
//	}
//
//	public void setLTS(String lTS) {
//		LTS = lTS;
//	}
//
//	public String getTanahtempat() {
//		return tanahtempat;
//	}
//
//	public void setTanahtempat(String tanahtempat) {
//		this.tanahtempat = tanahtempat;
//	}
//
//	public String getTarikh() {
//		return tarikh;
//	}
//
//	public void setTarikh(String tarikh) {
//		this.tarikh = tarikh;
//	}


	


}	

