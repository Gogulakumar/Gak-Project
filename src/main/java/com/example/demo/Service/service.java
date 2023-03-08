package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.Entity.entity;
import com.example.demo.Repository.repository;
@Service
public class service {
	@Autowired	
	repository repo;
	public entity saveDetails(entity e)	{	
		return repo.save(e);	
		}		
	public List<entity> getDetails()	
	{		
		return repo.findAll();	
		}	
	public List<entity> getSorted(String field) {	
		return repo.findAll(Sort.by(Sort.Direction.ASC,field));	
		}
	public List<entity> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<entity> page =repo.findAll(PageRequest.of(offset, pageSize));	
		return page.getContent();	
		}	
	public entity updateDetails(entity e1)	{	
		return repo.saveAndFlush(e1);	
		}
	public void deleteDetails(int id) 	{	
		repo.deleteById(id);	
		}
	}