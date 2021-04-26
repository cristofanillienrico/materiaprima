package it.prova.dao;

import it.prova.model.MateriaPrima;

public interface MateriaPrimaDAO {

	public MateriaPrima get(Long id) throws Exception;

	public void update(MateriaPrima materiaPrimaInput) throws Exception;

}
