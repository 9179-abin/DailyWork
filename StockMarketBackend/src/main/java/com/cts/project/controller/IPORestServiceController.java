package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dto.IpoDTO;
import com.cts.project.models.IPO;
import com.cts.project.repo.IPORepo;
import com.cts.project.services.IPOServices;

@CrossOrigin(origins = "*")
@RestController
public class IPORestServiceController {
	
//	@Autowired
//	IPORepo ipor;
	 
	@Autowired
	IPOServices ipoServices;
	
	@GetMapping("/ipo")
	public List<IPO> findAll(){
		return ipoServices.getAll();
	}
	
//	@GetMapping("/ipo")
//	public List<IPO> findAll(){
//		return ipor.findAll();
//	}
	
	@GetMapping("/ipo/{id}")
	public IPO findOne(@PathVariable int id) {
		IPO ipo = ipoServices.getOne(id);
		return ipo;
	}
	
	
//	@GetMapping("/ipo/{id}")
//	public IPO findOne(@PathVariable int id) {
//		Optional<IPO> ip = ipor.findById(id);
//		IPO ipos = ip.get();
//		return ipos;
//	}

	@PostMapping("/ipo")
	public String save(@RequestBody IpoDTO ipoDTO) {
		String b;
		b=ipoServices.insert(ipoDTO);
		return b;
	}
	
	
//	@PostMapping("/ipo")
//	public IPO save(@RequestBody IPO ip) {
//		
//		IPO ipos = ipor.save(ip);
//		return ipos;
//	}
	
	
	@DeleteMapping("/ipo/{id}")
	public void delete(@PathVariable int id) {
		ipoServices.remove(id);
	}
	
//	@DeleteMapping("/ipo/{id}")
//	public void delete(@PathVariable int id) {
//		ipor.deleteById(id);
//	}
	
	@PutMapping("/ipo")
	public String update(@RequestBody IpoDTO ipoDTO) {
		String c;
		c = ipoServices.alter(ipoDTO);
		return c;
	}
	
//	@PutMapping("/ipo")
//	public IPO update(@RequestBody IPO ip) {
//		IPO ipos = ipor.save(ip);
//		return ipos;
//	}
}
