package in.ashokit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import in.ashokit.request.SearchRequest;
import in.ashokit.service.ReportService;

@Controller
public class RequestController {

	
	@Autowired	
	private ReportService service;
	
	@GetMapping("/")
	public String getIndexpage(Model model) {
		SearchRequest searchObj= new SearchRequest();
		
		model.addAttribute("search", searchObj)	;
		return "index";
	}
	
}