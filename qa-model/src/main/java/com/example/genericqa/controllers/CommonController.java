package com.example.genericqa.controllers;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.genericqa.dao.GenericDao;
import com.example.genericqa.entities.Answer;
import com.example.genericqa.entities.Question;

@RestController
@Transactional
public class CommonController {

	@Autowired
	private GenericDao genericDao;
	
@PostMapping("/questions")
	
	public @ResponseBody String save(@RequestBody Question question)  {
		 
		 try {
			 genericDao.save(question);
				return "records saved successfully";	

		 }catch(Exception e){			 
			 e.printStackTrace();
			 return e.toString();
	    					 
		 }
	 }
	
	
	@PostMapping("/questions/{questionId}/answers")
	public @ResponseBody String save(@RequestBody Answer answer)  {
		 
		 try {
			 genericDao.save(answer);
		 }catch(Exception e){			 
			 e.printStackTrace();
			 return e.toString();
	    					 
		 }
		return "records saved successfully";	
	 }   

}
