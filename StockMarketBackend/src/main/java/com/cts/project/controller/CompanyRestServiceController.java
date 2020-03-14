package com.cts.project.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dto.CompanyDTO;
import com.cts.project.models.Company;
//import com.cts.project.repo.CompanyRepo;
import com.cts.project.services.CompanyServices;

@CrossOrigin(origins = "*")
@RestController
public class CompanyRestServiceController {

//	@Autowired
//	CompanyRepo cr;
	
	@Autowired
	CompanyServices cs;
	
	@GetMapping("/company")
	public List<Company> findAll(){
		return cs.getAll();
	}
	
	@GetMapping("/company/{id}")
	public Company findOne(@PathVariable int id) {
		
		Company cm = cs.getOne(id);
		return cm;
	}
	
//	@GetMapping("/company/{id}")
//	public Company findOne(@PathVariable int id) {
//		Optional<Company> cmy = cr.findById(id);
//		Company cm = cmy.get();
//		return cm;
//	}
	
	
	@PostMapping("/company")
	public String save(@RequestBody CompanyDTO cmy) {
		String b;
		b=cs.insert(cmy);
		return b;
	}
	
	
//	@PostMapping("/company")
//	public Company save(@RequestBody Company cmy) {
//		Company cm = cr.save(cmy);
//		return cm;
//	}
	
	@DeleteMapping("/company/{id}")
	public void delete(@PathVariable int id) {
		cs.remove(id);
	}
	
	
//	@DeleteMapping("/company/{id}")
//	public void delete(@PathVariable int id) {
//		cr.deleteById(id);
//	}
	
	@PutMapping("/company")
	public String update(@RequestBody CompanyDTO cmy) {
		String c = cs.alter(cmy);
		return c;
	}
	
//	@PutMapping("/company")
//	public Company update(@RequestBody Company cmy) {
//		Company cm = cr.save(cmy);
//		return cm;
//	}
	
}
