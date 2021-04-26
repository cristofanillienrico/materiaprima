package it.prova.service;

import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;

@Service
public class VerniciaturaServiceImpl implements VerniciatureService {

	@Override
	public void eseguiVerniciatura(MateriaPrima materiaPrimaInput) throws Exception {
		materiaPrimaInput.setStato(Stato.IN_VERNICIATURA);
		System.out.println("Eseguo la verniciatura di " + materiaPrimaInput);

	}

}
