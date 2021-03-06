package br.ifal.pw2.empresa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;

@Entity
public class Departamento {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@Column
	private Integer numero;
	
	@OneToMany
	private List<Localizacao>  localizacao;
	
	@OneToMany
	private List<Projeto> projetos;
	
	@OneToOne
	Empregado empregadoSupervisor;
	
	public Empregado getEmpregadoSupervisor() {
		return empregadoSupervisor;
	}
	public void setEmpregadoSupervisor(Empregado empregadoSupervisor) {
		this.empregadoSupervisor = empregadoSupervisor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public List<Projeto> getProjetos() {
		return projetos;
	}
	
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
	
	public List<Localizacao> getLocalizacao() {
		return localizacao;
	}
	
	public void setLocalizacao(List<Localizacao> localizacao) {
		this.localizacao = localizacao;
	}
	
	
}
