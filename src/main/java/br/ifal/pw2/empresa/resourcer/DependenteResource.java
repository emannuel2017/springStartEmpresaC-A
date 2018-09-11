package br.ifal.pw2.empresa.resourcer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.ifal.pw2.empresa.model.Dependente;
import br.ifal.pw2.empresa.repositorios.DependenteRepository;

@RestController
@RequestMapping("/api/dependente")
public class DependenteResource {

	@Autowired
	DependenteRepository dependenteRepository;
			
	@GetMapping
	public List<Dependente> get(){
		return dependenteRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Dependente get(@PathVariable("id") Integer id) {
		return dependenteRepository.getOne(id);
	}
	
	@PostMapping
	public Dependente save(@RequestBody Dependente dependente) {
		return dependenteRepository.save(dependente);
	}
	
	/*@PostMapping
	public Dependente update(@RequestBody Dependente dependente) {
		return dependenteRepository.save(dependente);
	}*/
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		dependenteRepository.deleteById(id);
	}
	
	
}
