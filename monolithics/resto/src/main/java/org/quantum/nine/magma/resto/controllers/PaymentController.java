package org.quantum.nine.magma.resto.controllers;

import java.util.List;

import org.quantum.nine.magma.resto.entities.Payment;
import org.quantum.nine.magma.resto.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class PaymentController {
	
	@Autowired
	PaymentService service ;
	
	@RequestMapping("/ajouterPayment")
	public String ajouterPayment(ModelMap map) {
		Payment payment = new Payment();
		map.addAttribute(payment);
		return "creerPayment";
	}

	@RequestMapping("/sauvegarderPayment")
	public String sauvegarderPayment(@ModelAttribute("payment") Payment payment,
							ModelMap modelMap) {
		Payment paymentSaved = service.savePayment(payment);
		String msg = "Payment saved with id :" + paymentSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerPayment";
	}

	@RequestMapping("/toutPayments")
	public String toutPayments(ModelMap modelMap) {

		List<Payment> payments = service.getAllPayments();
		modelMap.addAttribute("payments", payments);
		return "toutPayments";
	}

	@RequestMapping("supprimerPayment")
	public String supprimerPayment(@RequestParam("id") Long id, ModelMap modelMap) {
		Payment payment = new Payment();
		payment.setId(id);
		service.deletePayment(payment);
		List<Payment> payments = service.getAllPayments();
		modelMap.addAttribute("payments", payments);
		return "toutPayments";
	}

	@RequestMapping("/ciblerPayment")
	public String ciblerPayment(@RequestParam("id") Long  id, ModelMap modelMap) {
		Payment payment = new Payment();
		payment.setId(id);
		modelMap.addAttribute("payment", payment);
		return "ciblerPayment";
	}

	@RequestMapping("reglerPayment")
	public String reglerPayment(@ModelAttribute("payment") Payment payment, ModelMap modelMap) {
		service.updatePayment(payment);
		List<Payment> payments = service.getAllPayments();
		modelMap.addAttribute("payments", payments);
		return "toutPayments";
	}

	
	
}
