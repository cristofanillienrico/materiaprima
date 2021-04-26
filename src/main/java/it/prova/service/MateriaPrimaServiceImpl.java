package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.dao.MateriaPrimaDAO;
import it.prova.model.MateriaPrima;

@Service
public class MateriaPrimaServiceImpl implements MateriaPrimaService {
	@Autowired
	private MateriaPrimaDAO materiaPrimaDAO;

	@Override
	public MateriaPrima caricaSingolo(Long id) throws Exception {
		return materiaPrimaDAO.get(id);
	}

	@Override
	public void aggiorna(MateriaPrima materiaPrimaInput) throws Exception {
		materiaPrimaDAO.update(materiaPrimaInput);

	}

}
