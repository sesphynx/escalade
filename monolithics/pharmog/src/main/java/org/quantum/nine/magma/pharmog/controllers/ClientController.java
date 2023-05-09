package org.quantum.nine.magma.pharmog.controllers;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.Client;
import org.quantum.nine.magma.pharmog.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ClientController {
	
	@Autowired
	ClientService service ;
	
	@RequestMapping("/ajouterClient")
	public String ajouterClient(ModelMap map) {
		Client client = new Client();
		map.addAttribute(client);
		return "creerClient";
	}

	@RequestMapping("/sauvegarderClient")
	public String sauvegarderClient(@ModelAttribute("client") Client client,
							ModelMap modelMap) {
		Client clientSaved = service.saveClient(client);
		String msg = "Client saved with id :" + clientSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerClient";
	}

	@RequestMapping("/toutClients")
	public String toutClients(ModelMap modelMap) {

		List<Client> clients = service.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "toutClients";
	}

	@RequestMapping("supprimerClient")
	public String supprimerClient(@RequestParam("id") Long id, ModelMap modelMap) {
		Client client = new Client();
		client.setId(id);
		service.deleteClient(client);
		List<Client> clients = service.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "toutClients";
	}

	@RequestMapping("/ciblerClient")
	public String ciblerClient(@RequestParam("id") Long  id, ModelMap modelMap) {
		Client client = new Client();
		client.setId(id);
		modelMap.addAttribute("client", client);
		return "ciblerClient";
	}

	@RequestMapping("reglerClient")
	public String reglerClient(@ModelAttribute("client") Client client, ModelMap modelMap) {
		service.updateClient(client);
		List<Client> clients = service.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "toutClients";
	}

	
	
}
