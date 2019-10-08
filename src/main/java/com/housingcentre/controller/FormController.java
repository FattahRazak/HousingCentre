package com.housingcentre.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housingcentre.entities.Form;
import com.housingcentre.entities.Form2;
import com.housingcentre.entities.Form3;
import com.housingcentre.entities.Form4;
import com.housingcentre.entities.Form5;
import com.housingcentre.entities.User;
import com.housingcentre.repository.FormsRepository;
import com.housingcentre.repository.FormsRepository2;
import com.housingcentre.repository.FormsRepository3;
import com.housingcentre.repository.FormsRepository4;
import com.housingcentre.repository.FormsRepository5;
import com.housingcentre.services.EmailService;

@Controller
public class FormController {

	@Autowired
	FormsRepository formsRepository;
	
	@Autowired
	FormsRepository2 formsRepository2;
	
	@Autowired
	FormsRepository3 formsRepository3;
	
	@Autowired
	FormsRepository4 formsRepository4;
	
	@Autowired
	FormsRepository5 formsRepository5;
	
	private Logger logger = LoggerFactory.getLogger(FormController.class);
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(value="/FormList")
	public String ListOfForms(ModelMap modelMap) {
		List<Form> form = 
				(List<Form>) formsRepository.findAll();
		modelMap.put("form", form);
		List<Form2> form2 = 
				(List<Form2>) formsRepository2.findAll();
		modelMap.put("form2", form2);
		List<Form3> form3 = 
				(List<Form3>) formsRepository3.findAll();
		modelMap.put("form3", form3);
		List<Form4> form4 = 
				(List<Form4>) formsRepository4.findAll();
		modelMap.put("form4", form4);
		List<Form5> form5 = 
				(List<Form5>) formsRepository5.findAll();
		modelMap.put("form5", form5);
		return "views/FormList";
	}
	
	@RequestMapping(value="/form/{id}")
	@ResponseBody
	public String getForm(@PathVariable int id) {
		Form form = formsRepository.findById(id);
		Form2 form2 = formsRepository2.findById(id);
		Form3 form3 = formsRepository3.findById(id);
		Form4 form4 = formsRepository4.findById(id);
		Form5 form5 = formsRepository5.findById(id);
		//OPTIONAL IMPORT ALSO CAN ABOVE!
		
		return
				"<h3> BAHAGIAN 1 - KETERANGAN MENGENAI PEMOHON </h3>" + "</br>" + "</br>" +
				"Form Id: " + form.getId() + "</br>" +
				"1.Nama Penuh: " + form.getName() + "</br>" +
				"2.Jantina: " + form.getGender()+ "</br>" +
				"3.Umur: " + form.getAge() + "</br>" +
				"4.Tarikh Lahir: " + form.getBirthdate()+ "</br>" +
				"5.Tempat Lahir: " + form.getPlaceofbirth()+ "</br>" +
				"6.Bilangan Kad Pengenalan: " + form.getIC() + "</br>" +
				"7.Warna: " + form.getICcolor()+ "</br>" +
				"8.Taraf Kelamin: " + form.getMartialstatus()+ "</br>" +
				"9.Bangsa: " + form.getNationality()+ "</br>" +
				"10.Alamat: " + form.getAddress()+ "</br>" +
				"10a. Alamat persuratan/tetap yang mudah dihubungi: " + form.getAddress2()+ "</br>" +
				"Nombor Telefon: " + form.getPhonenumber() + "</br>" + 
				"10b. Alamat tempat tinggal sekarang: " + form2.getAddress3() + "</br>" +
				"10c. Tinggal dirumah :"+ "</br>" +
				"10c ( i ) Sendiri: " + form2.getSendiri() + "</br>" +
				"Bayaran Sewa Sebulan:" + "</br>" +
				"10c (ii) Menumpang: " + form2.getMenumpang() + "</br>" +
				"11. Perkhidmatan : " + "</br>" +
				"11a. Kerajaan : " + form2.getKerajaan() + "</br>" +
				"Majikan : " + form2.getMajikan() + "</br>" +
				"Jawatan : " + form2.getJawatan() + "</br>" +
				"Bahagian : " + form2.getBahagian() + "</br>" +
				"Bahagian (Section) : " + form2.getBahagian2() + "</br>" +
				"Tarikh mula berkhidmat : " + form2.getBerkhidmatdate() + "</br>" +
				"Gaji sebulan/sehari : " + form2.getGaji() + "</br>" +
				"11b. Swasta : " + form2.getSwasta() + "</br>" +
				"Majikan : " + form2.getMajikan2() + "</br>" +
				"Jawatan : " + form2.getJawatan2() + "</br>" +
				"Tarikh mula berkhidmat : " + form2.getBerkhidmatdate2() + "</br>" +
				"Gaji sebulan/sehari : " + form2.getGaji2() + "</br>" +
				"11c. Sendiri : " + form2.getSendiri() + "</br>" +
				"Jenis Pekerjaan : " + form3.getPekerjaan() + "</br>" +
				"Anggaran pendapatan purata sebulan : " + form3.getGaji3() + "</br>" +
				"11d. Lain-Lain : " + form3.getLainlain() + "</br>" +
				"Jawatan: " + form3.getJawatan3() + "</br>" +
				"Pendapatan sebulan (anggaran purata) " + form3.getGaji4() + "</br>" +
				"12. Daerah Kawasan Rancangan Perumahan Negara yang dipohonkan : " + form3.getKawasan() + "</br>" + "</br>" +
				
				"<h3>BAHAGIAN 2 - KETERANGAN MENGENAI *ISTERI/SUAMI </h3>" + "</br>" + "</br>" +
				"13. Nama penuh (huruf besar seperti di dalam kad Pengenalan : " + form3.getName2() + "</br>" +
				"14. Umur: " + form3.getAge2() + "</br>" +
				"15. Tarikh Lahir : " + form3.getBirthdate2() + "</br>" +
				"16. Tempat Lahir : " + form3.getPlaceofbirth2() + "</br>" +
				"17. Bilangan Kad Pengenalan : " + form3.getIC2() + "</br>" +
				"18. Warna : " + form3.getICcolor2() + "</br>" +
				"19 . Bangsa : " + form3.getNationality2() + "</br>" +
				"20. Perkhidmatan :"+ "</br>" +
				"20a. Kerajaan : " + form3.getKerajaan2() + "</br>" +
				"Majikan : " + form4.getMajikan3() + "</br>" +
				"Jawatan : " + form4.getJawatan4() + "</br>" +
				"Majikan : " + form4.getBahagian3() + "</br>" +
				"Bahagian : " + form4.getMajikan3() + "</br>" +
				"Bahagian (Section) : " + form4.getBahagian4() + "</br>" +
				"Gaji sebulan/sehari : " + form4.getGaji5() + "</br>" +
				"Tarikh mula berkhidmat : " + form4.getBerkhidmatdate3() + "</br>" +
				"20b. Swasta : " + form4.getSwasta2() + "</br>" +
				"Majikan : " + form4.getMajikan4() + "</br>" +
				"Jawatan : " + form4.getJawatan5() + "</br>" +
				"Tarikh mula berkhidmat : " + form4.getBerkhidmatdate4() + "</br>" +
				"Gaji sebulan/sehari : " + form4.getGaji6() + "</br>" +
				"20c. Sendiri : " + form4.getKerjasendiri2() + "</br>" +
				"Jenis Pekerjaan : " + form4.getPekerjaan2() + "</br>" +
				"Anggaran pendapatan purata sebulan : " + form4.getGaji7() + "</br>" +
				"20d. Lain-Lain : " + form4.getLainlain2() + "</br>" +
				"Jawatan: " + form5.getJawatan6() + "</br>" +
				"Pendapatan sebulan (anggaran purata) " + form5.getGaji8() + "</br>" + "</br>" +
				
				"<h3> BAHAGIAN 3 - KETERANGAN MENGENAI AYAH  </h3>"+ "</br>" + "</br>" +
				"21. Nama penuh (huruf besar seperti di dalam kad Pengenalan : " + form5.getName3() + "</br>" +
				"22. Umur: " + form5.getAge3() + "</br>" +
				"23. Tarikh Lahir : " + form5.getBirthdate3() + "</br>" +
				"24. Tempat Lahir : " + form5.getPlaceofbirth3() + "</br>" +
				"25. Bilangan Kad Pengenalan : " + form5.getIC3() + "</br>" +
				"26. Warna : " + form5.getICcolor3() + "</br>" + "</br>" +
				
				"<h3> BAHAGIAN 4 - KETERANGAN MENGENAI TANGGUNGAN </h3>" + "</br>" + "</br>" +
				"27. Bilangan anak dalam tanggungan " + form5.getAnak() + "</br>" + "</br>" +
				
				"<h3> BAHAGIAN 5 - KETERANGAN MENGENAI TANAH </h3>" + "</br>" + "</br>" +
				"28. Adakah pemohon dan isteri/suami memiliki Tanah Lesen Tumpang Sementara (LTS) " + form5.getTanah() + "</br>" +
				"Bilangan LTS: " + form5.getLTS()+ "</br>" +
				"Bertempat : " + form5.getTanahtempat() + "</br>" + "</br>" +
	
				"<h3> BAHAGIAN 6 - PENGAKUAN PEMOHON </h3>" + "</br>" + "</br>" +
				"Tarikh : " + form5.getTarikh();
	
	}
	
	@RequestMapping(value="/addform")
	public String addFormPage()
	{
		return "views/Form";
	}
	
//	@RequestMapping(value="/add/form")
//	@ResponseBody
//	public String addNewForm(
	//		@RequestParam String name, @RequestParam int age) {
	//	Form form =new Form (name, age);
	//	formRepository.save(form);	
	//	return "redirect:/forms";
	//}
	
	@RequestMapping(value="/add/form")
	
	public String addNewForm(
			//@RequestParam int id, 
			User user,
			
			@RequestParam String name, @RequestParam int age,
			@RequestParam String IC,@RequestParam String ICcolor,
			@RequestParam String gender,@RequestParam String birthdate,@RequestParam String placeofbirth,
			@RequestParam String martialstatus,@RequestParam String nationality,@RequestParam String address, @RequestParam String phonenumber,@RequestParam String address2,
			
			@RequestParam String address3,@RequestParam String sendiri,@RequestParam String menumpang,@RequestParam String kerajaan,@RequestParam String majikan,
			@RequestParam String jawatan,@RequestParam String bahagian,@RequestParam String bahagian2,@RequestParam String berkhidmatdate,@RequestParam String gaji,@RequestParam String swasta,
			@RequestParam String majikan2,@RequestParam String jawatan2,@RequestParam String berkhidmatdate2,@RequestParam String gaji2,

			@RequestParam String kerjasendiri,@RequestParam String pekerjaan,@RequestParam String gaji3,@RequestParam String lainlain,@RequestParam String jawatan3,
			@RequestParam String gaji4,@RequestParam String kawasan,@RequestParam String name2,@RequestParam int age2,@RequestParam String birthdate2,
			@RequestParam String placeofbirth2,@RequestParam String IC2,@RequestParam String ICcolor2,@RequestParam String nationality2,@RequestParam String kerajaan2,
			
			@RequestParam String majikan3,@RequestParam String jawatan4,@RequestParam String bahagian3,@RequestParam String bahagian4,@RequestParam String gaji5,
			@RequestParam String berkhidmatdate3,@RequestParam String swasta2,@RequestParam String majikan4,@RequestParam String jawatan5,@RequestParam String berkhidmatdate4,
			@RequestParam String gaji6,@RequestParam String kerjasendiri2,@RequestParam String pekerjaan2,@RequestParam String gaji7,@RequestParam String lainlain2,
			
			@RequestParam String jawatan6,@RequestParam String gaji8,@RequestParam String name3,@RequestParam int age3,@RequestParam String birthdate3,
			@RequestParam String placeofbirth3,@RequestParam String IC3,@RequestParam String ICcolor3,@RequestParam String anak,@RequestParam String tanah,
			@RequestParam String LTS,@RequestParam String tanahtempat,@RequestParam String tarikh
			) {
		Form form =new Form (name, age, IC, ICcolor, gender, birthdate, placeofbirth, martialstatus, nationality, address,address2,phonenumber

				);
		Form2 form2 =new Form2 (address3, sendiri, menumpang, kerajaan, majikan, jawatan, bahagian, bahagian2, berkhidmatdate, gaji,swasta,majikan2,jawatan2,berkhidmatdate2,gaji2 
				);
		Form3 form3 =new Form3 (kerjasendiri, pekerjaan, gaji3, lainlain, jawatan3, gaji4, kawasan, name2, age2, birthdate2,placeofbirth2,IC2,ICcolor2,nationality2,kerajaan2 
				);
		Form4 form4 =new Form4 (majikan, jawatan4, bahagian3, bahagian4, gaji5, berkhidmatdate3, swasta2, majikan4, jawatan5, berkhidmatdate4,gaji6,kerjasendiri2,pekerjaan2,gaji7,lainlain2 

		);
		Form5 form5 =new Form5 (jawatan6, gaji8, name3, age3, birthdate3, placeofbirth3, IC3, ICcolor3, anak, tanah,LTS,tanahtempat,tarikh

		);

		formsRepository.save(form);
		formsRepository2.save(form2);
		formsRepository3.save(form3);
		formsRepository4.save(form4);
		formsRepository5.save(form5);
		emailService.sendForm(user);
		emailService.sendForm2(user);


		return "redirect:../profile";
	}
}
