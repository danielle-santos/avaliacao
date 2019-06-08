package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CADASTRO_SOF")
public class Software extends BaseORM {

	@Id
	@GeneratedValue
	@Column(name="ID_TITULO")
	private Long id;
	
	@Column(name="TX_EMPRESA")
	private String empresa;
	
	@Column(name="TX_TIPO")
	private String tipo;
	
	@Column(name="TX_CHAVE")
	private String chave;
	
	@Column(name="TX_LICENCA")
	private String licenca;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long arg0) {
		// TODO Auto-generated method stub
		
	}
	
	}
