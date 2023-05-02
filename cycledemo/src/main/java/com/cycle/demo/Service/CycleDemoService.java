package com.cycle.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.cycle.demo.Repsitory.CycleDemoRepsitory;
import com.cycle.demo.Repsitory.LoginRepository;
import com.cycle.demo.model.CycleDemo;
import com.cycle.demo.model.LoginModel;

@Service
public class CycleDemoService {
	@Autowired
	CycleDemoRepsitory cr;
	
	@Autowired
	LoginRepository lr;
     
	public List<CycleDemo> getDetails(){
		return cr.findAll();
	}
	public CycleDemo saveDetails(@RequestBody CycleDemo a) {
		
		return cr.save(a);
	}
	public CycleDemo putDetails(@RequestBody CycleDemo b) {
		
		return cr.save(b);
	}

     public void deleteDetails(@PathVariable int x) {
    	 
    	 cr.deleteById(x);
     }
    
     public List<CycleDemo>sortCycle(String field){
 		return cr.findAll(Sort.by(field));
 	}
 	
 	public List<CycleDemo> sortDesCycle(String field){
 		
 		return cr.findAll(Sort.by(Direction.DESC,field));
 	}

 	public List<CycleDemo> getpaginationss(int offset, int pagesize) {
 		
 		Page<CycleDemo> paging=cr.findAll(PageRequest.of(offset, pagesize));
 		return paging.getContent();
 	}

 	public List<CycleDemo> getsortpaginations(int offset, int pagesize,String field) {
 		
 		Page<CycleDemo> paging=cr.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
 		return paging.getContent();
 	}
 	public String login(String username,String password) {
		List<LoginModel> li = lr.findAll();
		String res = null;
		for(LoginModel l : li ) {
			if(l.getUsername().equals(username)&&l.getPassword().equals(password)) {
				res = "Login sucessfull";
			}
		}
		if(res==null) {
			res= "Login failed";
		}
		return res;
	}
	public CycleDemo register(@RequestBody CycleDemo id) {
			
			return cr.save(id);
		}
	 	
 }


	


