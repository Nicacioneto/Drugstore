package br.pro.delfino.drogaria.dao;

import org.junit.Test;

import br.pro.delfino.drogaria.domain.Estado;

public class EstadoDaoTest {
	@Test
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("São Paulo");
		estado.setSigla("SP");
		EstadoDao estadoDao = new EstadoDao();
		estadoDao.salvar(estado);
	}
}
