package it.prova.service;

import it.prova.model.MateriaPrima;

public interface MateriaPrimaService {

	public MateriaPrima caricaSingolo(Long id) throws Exception;

	public void aggiorna(MateriaPrima materiaPrimaInput) throws Exception;

}
