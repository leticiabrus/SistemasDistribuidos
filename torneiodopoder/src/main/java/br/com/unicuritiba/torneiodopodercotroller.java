package br.com.unicuritiba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.unicuritiba.torneiodopoder.repositories.LutadorRepository;

@Controller
public class torneiodopodercotroller {
	
	@Autowired
	private LutadorRepository repositorio; 
	
	@GetMapping("/)")
	public String Home() {
	
	
	
	return "index"; 
}
}