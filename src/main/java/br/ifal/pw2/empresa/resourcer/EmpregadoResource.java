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


import br.ifal.pw2.empresa.model.Empregado;
import br.ifal.pw2.empresa.repositorios.EmpregadoRepository;

@RestController
@RequestMapping("/api/empregado")
public class EmpregadoResource {
 
	@Autowired
	EmpregadoRepository empregadoRepository;
	
	@GetMapping
	public List<Empregado> get(){
		return empregadoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Empregado get(@PathVariable("id") Integer id) {
		return empregadoRepository.getOne(id);
	}
	
	@PostMapping
	public Empregado save(@RequestBody Empregado empregado) {
		return empregadoRepository.save(empregado);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		empregadoRepository.deleteById(id);
	}
	
}