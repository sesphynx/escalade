package org.nioun.essentials.leafragments;

import org.nioun.essentials.leafragments.utils.EtudiantsUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmetsController {
	
	@GetMapping("/fragments")
    public String getHome() {
        return "fragments.html";
    }

    @GetMapping("/markup")
    public String markupPage() {
        return "markup.html";
    }

    @GetMapping("/params")
    public String paramsPage() {
        return "params.html";
    }

    @GetMapping("/other")
    public String otherPage(Model model) {
        model.addAttribute("data", EtudiantsUtils.buildStudents());
        return "other.html";
    }

}
