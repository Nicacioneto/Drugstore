package br.pro.delfino.drogaria.dao;

import org.junit.Test;

import br.pro.delfino.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Test
	public void Salvar() {
		Fabricante fabricante =new Fabricante();
		fabricante.setDescricao("Fabricante e comerciante de medicamentos LTDA");
		FabricanteDAO fabricanteDao = new FabricanteDAO();
		fabricanteDao.salvar(fabricante);
		
	}

}
