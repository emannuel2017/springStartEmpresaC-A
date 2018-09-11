package br.ifal.pw2.empresa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Trabalha {
    @Id
    @GeneratedValue
	private Integer id;
    
    @Column
    private Integer horaSemanal;
    
    @OneToOne
    private Empregado empregado;
        
    @OneToOne
     Projeto projeto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHoraSemanal() {
		return horaSemanal;
	}

	public void setHoraSemanal(Integer horaSemanal) {
		this.horaSemanal = horaSemanal;
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
    
    
    
}
