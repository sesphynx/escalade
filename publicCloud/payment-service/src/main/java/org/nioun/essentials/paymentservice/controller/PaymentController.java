package org.nioun.essentials.paymentservice.controller;

import java.util.List;

import org.nioun.essentials.niouncore.Payment;
import org.nioun.essentials.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService ;
	
	@RequestMapping(value = "/payment" , method = RequestMethod.POST)
	Payment save ( @RequestBody Payment payment){
		return paymentService.savePayment(payment) ;
	}

	@RequestMapping(value="/payment" , method = RequestMethod.GET)
	Payment fetch(@RequestParam Long paymentId){
		return paymentService.getPaymentById(paymentId);
	}
	
	@RequestMapping(value="/payments" , method = RequestMethod.GET)
	List<Payment> fetch(){
		return paymentService.getAllPayments();
	}
	
}
