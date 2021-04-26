package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;

@Service
public class VerniciaturaServiceImpl implements VerniciatureService {

	@Autowired
	private MateriaPrimaService materiaPrimaService;

	@Override
	public void eseguiVerniciatura(MateriaPrima materiaPrimaInput) throws Exception {
		materiaPrimaInput.setStato(Stato.IN_VERNICIATURA);
		materiaPrimaService.aggiorna(materiaPrimaInput);
		System.out.println("Eseguo la verniciatura di " + materiaPrimaInput);

	}

}
