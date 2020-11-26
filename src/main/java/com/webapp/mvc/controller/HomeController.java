package com.webapp.mvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.webapp.mvc.entity.credit;
import com.webapp.mvc.service.CreditService;

@Controller
public class HomeController {
	
	@Autowired
	private CreditService creditService;
	@RequestMapping("/")
	public String show(Model theModel) {
		theModel.addAttribute("credit",new credit());
		return "index";
	}
@RequestMapping("/checkEligibility")
	public String checkEligibility(@ModelAttribute("credit") credit theCredit,Model theModel) {
	
	      credit theCreditdb = creditService.getCredit(theCredit.getPanNo().toUpperCase());
	      if(theCreditdb==null) return "Invalid";
          double score=theCreditdb.getScore();
  
	if(score>=5) return "Eligible"; 
    else 
      return "NotEligible";
      }
}
