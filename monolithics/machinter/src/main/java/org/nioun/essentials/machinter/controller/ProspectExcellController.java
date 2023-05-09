package org.nioun.essentials.machinter.controller;

import org.nioun.essentials.machinter.model.ProspectExcell;
import org.nioun.essentials.machinter.repo.ProspectExcellRepository;
import org.nioun.essentials.machinter.service.FileUploaderService;
import org.nioun.essentials.machinter.service.ProspectExcellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class ProspectExcellController {
	
	@Autowired
	FileUploaderService fileService;
	
	@Autowired
	ProspectExcellService excelservice;
	
	@Autowired
	ProspectExcellRepository repo;
	
	@GetMapping("/upload")
    public String upload() {
        return "uploadPage";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

        fileService.uploadFile(file);

        redirectAttributes.addFlashAttribute("message",
            "You have successfully uploaded '"+ file.getOriginalFilename()+"' !");
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        return "redirect:/";
    }
    
    @GetMapping("/saveData")
    public String saveExcelData(Model model) {
    	
    	List<ProspectExcell> excelDataAsList = excelservice.getDatafromList();
    	int noOfRecords = excelservice.saveData(excelDataAsList);
    	model.addAttribute("noOfRecords",noOfRecords);
    	return "success";
    }
}