package br.ifal.pw2.empresa.model;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Empregado {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private Integer matricula;
	
	@Column
	private String endereco;
	
	@Column
	private Double  salario;
	
	@Column
	private String sexo;
	
	@Column
	private Date dataNacimento;
	
	@OneToOne
	private Departamento departamento;
	
	@OneToMany
	private List<Projeto> projetos;
	
	@OneToMany
	private List<Dependente> dependentes;
	
	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Date getDataNacimento() {
		return dataNacimento;
	}
	
	public void setDataNacimento(Date dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
		
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public List<Projeto> getProjetos() {
		return projetos;
	}
	
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

}
