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

import br.ifal.pw2.empresa.model.Trabalha;

import br.ifal.pw2.empresa.repositorios.TrabalhaRepository;

@RestController
@RequestMapping("/api/trabalha")
public class TrabalhaResource {
  @Autowired
  TrabalhaRepository trabalhaRepository;
  
  @GetMapping
  public List<Trabalha> get(){
	  return trabalhaRepository.findAll();
  }
  
  @GetMapping("{id}")
  public Trabalha get(@PathVariable("id") Integer id) {
	  return trabalhaRepository.getOne(id);
  }
  
  @PostMapping
  public void save(@RequestBody Trabalha trabalha) {
	  trabalhaRepository.save(trabalha);
  }
  
  @DeleteMapping("{id}")
  public void dalete(@PathVariable("id") Integer id) {
	  trabalhaRepository.deleteById(id);
  }
  
}
