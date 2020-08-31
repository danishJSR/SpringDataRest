package com.danish.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danish.demo.dao.AlienRepo;
import com.danish.demo.model.Alien;

@RestController
public class AlienController 
{
	@Autowired
	AlienRepo repo;
	
	@GetMapping(path ="/aliens", produces ={"application/json"})
	public List<Alien> getAliens()
	{
		return repo.findAll();
	}
	
	@GetMapping(path = "/alien/{id}")
	public Optional<Alien> getAlien(@PathVariable("id") int aid )
	{
		return repo.findById(aid);
	}
	
	@PostMapping(path="/alien", consumes = {"application/json"})
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@PutMapping(path="/alien", consumes= {"application/json"})
	public Alien saveOrUpdateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@DeleteMapping(path="alien/{aId}")
	public String deleteAlien(@PathVariable int aId)
	{
		Alien idToBeDeleted =repo.getOne(aId);
		repo.delete(idToBeDeleted);
		return "Deleted Successfully";
	}
	
	/*
	 * @RequestMapping("/getAlien") public ModelAndView getAlien(@RequestParam int
	 * aId) { ModelAndView mv = new ModelAndView("showAlien.jsp"); Alien alien =
	 * repo.findById(aId).orElse(new Alien());
	 * 
	 * System.out.println(repo.findByTech("Java"));
	 * System.out.println(repo.findByaIdGreaterThan(102));
	 * System.out.println(repo.findByTechSorted("Java"));
	 * 
	 * mv.addObject(alien); return mv; }
	 */
}