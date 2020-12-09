package recordJB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import recordJB.dto.DosageRecDTO;
import recordJB.service.DosageRecordService;

@Controller
public class HomeController {

	
	@Autowired
	DosageRecordService drs;
	
	
	@RequestMapping("recordJB")
	public ModelAndView home() {
		
		ModelAndView mv = new ModelAndView("/home");
		
		return mv;
	}

}
