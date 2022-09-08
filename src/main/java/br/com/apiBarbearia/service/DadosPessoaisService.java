package br.com.apiBarbearia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiBarbearia.model.DadosPessoais;
import br.com.apiBarbearia.repository.DadosPessoaisRepository;

@Service
public class DadosPessoaisService {
	
	@Autowired
	private DadosPessoaisRepository dadosPessoaisRepository;
	
	
	public DadosPessoais salvarDadosPessoais(DadosPessoais dadosPessoais) {
		return dadosPessoaisRepository.save(dadosPessoais);
	}
}
