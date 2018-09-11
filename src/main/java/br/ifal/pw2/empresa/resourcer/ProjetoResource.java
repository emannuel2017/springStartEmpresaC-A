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

import br.ifal.pw2.empresa.model.Projeto;
import br.ifal.pw2.empresa.repositorios.ProjetoRepository;

@RestController
@RequestMapping("/api/projeto")
public class ProjetoResource {

   @Autowired
   ProjetoRepository projetoRepository;
  
   @GetMapping
   public List<Projeto> get(){
	   return projetoRepository.findAll();
   }
   
   @GetMapping("{id}")
   public Projeto get(@PathVariable("id") Integer id) {
	   return projetoRepository.getOne(id);
   }
	
   @PostMapping
   public void save(@RequestBody Projeto projeto) {
	   projetoRepository.save(projeto);
   }
   
   @DeleteMapping("{id}")
   private void dellte(@PathVariable("id") Integer id) {
	 projetoRepository.deleteById(id);
   }
  
}
