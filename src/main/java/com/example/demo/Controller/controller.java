package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.entity;
import com.example.demo.Service.service;
@RestController
@CrossOrigin		
public class controller {		
	@Autowired	service serv;
	@PostMapping("/addDetails")
	public entity addInfo(@RequestBody entity st)	{	
		return serv.saveDetails(st);
		}
	@GetMapping("showDetails")
	public List<entity> fetchDetails()	{
		return serv.getDetails();
		}
	@PutMapping("/updateDetails")	
	public entity updateInfo(@RequestBody entity st1)	{
		return serv.updateDetails(st1);	
		}	
	@DeleteMapping("/delete/{pid}")	
	public String deleteInfo(@PathVariable("pid")int pid)
	{		
		serv.deleteDetails(pid);	
		return "Deleted details";
		}	
	//sorting
	@GetMapping("/product/{field}")
	public List<entity> getWithSort(@PathVariable String field) {	
		return serv.getSorted(field);		
		}			
	// pagination	
	@GetMapping("/product/{offset}/{pageSize}")	
	public List<entity> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {				
		return serv.getWithPagination(offset, pageSize);			}}
