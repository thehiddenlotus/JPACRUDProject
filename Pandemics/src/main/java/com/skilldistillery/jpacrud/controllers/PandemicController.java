package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.jpacrud.data.PandemicDAO;
import com.skilldistillery.jpacrud.entities.Pandemic;

@Controller
public class PandemicController {

	@Autowired
	private PandemicDAO dao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("pandemics", dao.findAll());
		return "index";
	}
	
	@RequestMapping(path = "getPandemic.do", method = RequestMethod.GET, params = "pid")
	public String showPandemic(@RequestParam Integer pid, Model model) {
		String viewName = "pandemic/show";
		Pandemic pandemic = dao.findByID(pid);
		model.addAttribute("pandemic", pandemic);
		return viewName;
	}
	
	@RequestMapping(path = "deletePandemic.do", method = RequestMethod.POST, params="id")
	public String deletePandemic(@RequestParam Integer id, Model model) {
		String viewName = "pandemic/pandemicDeleted";	
		Pandemic pan = dao.findByID(id);
		boolean delete = dao.destroy(id);
		model.addAttribute("delete", delete);
		model.addAttribute("pan", pan);
		return viewName;
	}
	
	@RequestMapping(path = "addPandemic.do", method = RequestMethod.GET)
	public String addPandemic(Pandemic pan, Model model) {
		String viewName = "pandemic/pandemicForm";	
		model.addAttribute("pan", pan);
		return viewName;
	}
	
	@RequestMapping(path = "addPandemic.do", method = RequestMethod.POST)
	public String postPandemic(Pandemic pan, Model model) {
		String viewName = "pandemic/show";
		dao.create(pan);
		model.addAttribute("pan", pan);
		return viewName;
	}
	
	@RequestMapping(path = "updatePandemic.do", method = RequestMethod.GET)
	public String updatePandemic(@RequestParam Integer id, Model model) {
		String viewName = "pandemic/pandemicForm";	
		Pandemic pan = dao.findByID(id);
		model.addAttribute("pan", pan);
		return viewName;
	}
}
