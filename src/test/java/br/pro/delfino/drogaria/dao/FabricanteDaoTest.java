package br.pro.delfino.drogaria.dao;

import org.junit.Test;

import br.pro.delfino.drogaria.domain.Fabricante;

public class FabricanteDaoTest {

	@Test
	public void Salvar() {
		Fabricante fabricante =new Fabricante();
		fabricante.setDescricao("Fabricante e comerciante de medicamentos LTDA");
		FabricanteDao fabricanteDao = new FabricanteDao();
		fabricanteDao.salvar(fabricante);
		
	}

}
