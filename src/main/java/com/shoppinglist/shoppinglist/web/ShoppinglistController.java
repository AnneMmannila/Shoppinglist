package com.shoppinglist.shoppinglist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shoppinglist.shoppinglist.domain.Shoppinglist;
import com.shoppinglist.shoppinglist.domain.ShoppinglistRepository;

@Controller
public class ShoppinglistController {

	@Autowired
	private ShoppinglistRepository repository;

	@RequestMapping(value = "/")
	public String frontpage(Model model) {
		model.addAttribute("list", repository.findAll());

		return "Shoppinglist";
	}

	@RequestMapping(value = "/add")
	public String addItem(Model model) {
		model.addAttribute("item", new Shoppinglist());

		return "addItem";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveNewItem(Shoppinglist item) {
		repository.save(item);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteItem(@PathVariable("id") Long id, Model model) {
		repository.deleteById(id);
		return "redirect:/";
	}

}