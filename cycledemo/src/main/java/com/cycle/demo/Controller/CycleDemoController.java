package com.cycle.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cycle.demo.Service.CycleDemoService;
import com.cycle.demo.model.CycleDemo;

@RestController
public class CycleDemoController {
	
	@Autowired
	CycleDemoService dr;
	
	@GetMapping("/fetch")
	public List<CycleDemo> getallDetails(){
		return dr.getDetails();
	}
	
	@PostMapping("/save")
	public CycleDemo saveAll(@RequestBody CycleDemo a) {
		
		return dr.putDetails(a);
	}
	@PutMapping("/put")
	public CycleDemo saveAlll(@RequestBody CycleDemo b) {
		
		return dr.putDetails(b);
		
	}
	@DeleteMapping("/delete/{d}")
	public String delete(@PathVariable int d) {
		dr.deleteDetails(d);
		return "Details Deleted";
	}

	@GetMapping("/auto/{field}")
	public List<CycleDemo>sortCrudD(@PathVariable String field){
		return dr.sortCycle(field);
	}
	@GetMapping("/autio")
	public List<CycleDemo>sortCrudDes(@RequestParam String field){
		return dr.sortDesCycle(field);
	}
	
	
	@GetMapping("/pagination")
	
	public List<CycleDemo> pagination(@RequestParam int offset,@RequestParam int pagesize){
		
		return dr.getpaginationss(offset,pagesize);
	}
	
	@GetMapping("/sortpagination")
	
	public List<CycleDemo> sortpagination(@RequestParam int offset,@RequestParam int pagesize,String field){
		
		return dr.getsortpaginations(offset,pagesize,field);
	}
	
	@GetMapping("/login")
	public String logins(@RequestParam String username, @RequestParam String password){
		
		return dr.login(username,password);
	}
	@PostMapping("/reg")
	public CycleDemo regid(@RequestBody CycleDemo id) {
		
		
		return dr.register(id);
	}
}
	
	


