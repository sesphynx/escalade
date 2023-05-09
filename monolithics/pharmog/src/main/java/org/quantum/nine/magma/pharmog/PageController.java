package org.quantum.nine.magma.pharmog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/SMS")
public class PageController {
	
	@Value("${phoneNumber:** Todo: buy a phone number from Twilio **}")
    private String phoneNumber;

   @GetMapping("/dashboard")
   public ModelAndView showDashboard(){
       ModelAndView dashboard = new ModelAndView("dashboard");
       dashboard.addObject("phoneNumber", phoneNumber);
       return dashboard;
   }

}
