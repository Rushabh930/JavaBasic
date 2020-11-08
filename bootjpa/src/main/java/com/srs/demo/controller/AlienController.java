package com.srs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.srs.demo.dao.AlienRepo;
import com.srs.demo.model.Alien;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "Home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "Home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/updateAlien")
	public ModelAndView updateAlien(Alien alien) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		repo.deleteById(alien.getAid());
		repo.save(alien);
		alien = repo.findById(alien.getAid()).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/deleteAlien")
	public ModelAndView deleteAlien(Alien alien) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
//		Alien alien = repo.findById(aid).orElse(new Alien());
		repo.deleteById(alien.getAid());
		alien = repo.findById(alien.getAid()).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
}
