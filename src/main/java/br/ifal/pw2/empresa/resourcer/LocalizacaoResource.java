package br.ifal.pw2.empresa.resourcer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifal.pw2.empresa.model.Localizacao;
import br.ifal.pw2.empresa.repositorios.Localizacaorerpository;

@RestController
@RequestMapping("/api/localizacao")
public class LocalizacaoResource {
 
	@Autowired
	Localizacaorerpository localizacaorerpository;
	
	@GetMapping
	public List<Localizacao> get(){
		return localizacaorerpository.findAll();		
	}
	
	@GetMapping("{id}")
	public Localizacao get(@PathVariable("id") Integer id) {
		return localizacaorerpository.getOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody Localizacao localizacao) {
		localizacaorerpository.save(localizacao);
	}
  	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
     	localizacaorerpository.deleteById(id);	
	}
}
