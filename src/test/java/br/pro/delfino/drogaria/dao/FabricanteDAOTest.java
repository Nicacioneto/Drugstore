package br.pro.delfino.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.pro.delfino.drogaria.domain.Estado;
import br.pro.delfino.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@Ignore
	@Test
	public void salvar() {
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("Fabricante e comerciante de medicamentos LTDA");
		FabricanteDAO fabricanteDao = new FabricanteDAO();
		fabricanteDao.salvar(fabricante);

	}

	@Test
	public void listar() {
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = fabricanteDAO.listar();
		System.out.println("Total de Registros Encontrados: " + resultado.size());
		for (Fabricante fabricante : resultado) {
			System.out.println(fabricante.getCodigo() + "-" + fabricante.getDescricao());
		}
	}

}
