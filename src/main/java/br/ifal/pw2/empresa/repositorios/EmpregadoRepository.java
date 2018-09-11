package br.ifal.pw2.empresa.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifal.pw2.empresa.model.Empregado;
@Repository
public interface EmpregadoRepository extends JpaRepository< Empregado, Integer> {

}
