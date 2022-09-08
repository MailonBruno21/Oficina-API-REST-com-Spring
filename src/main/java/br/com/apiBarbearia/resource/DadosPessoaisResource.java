package br.com.apiBarbearia.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiBarbearia.model.DadosPessoais;
import br.com.apiBarbearia.service.DadosPessoaisService;

@RestController
@RequestMapping("/dadopessoal")
public class DadosPessoaisResource {
	
	@Autowired
	private DadosPessoaisService dadosPessoaisService;
	
	@PostMapping("/add")
	public ResponseEntity<DadosPessoais> addDadoPessoal(@RequestBody  DadosPessoais dadosPessoais){
		return ResponseEntity.ok(dadosPessoaisService.salvarDadosPessoais(dadosPessoais));
	}
	
	
}
