package br.ifal.pw2.empresa.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifal.pw2.empresa.model.Departamento;
@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{

}
