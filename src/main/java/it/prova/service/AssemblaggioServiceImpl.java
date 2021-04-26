package it.prova.service;

import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;

@Service
public class AssemblaggioServiceImpl implements AssemblaggioService {

	@Override
	public void eseguiAssemblaggio(MateriaPrima materiaPrimaInput) throws Exception {
		materiaPrimaInput.setStato(Stato.IN_ASSEMBLAGGIO);
		System.out.println("Eseguo l'assemblaggio di " + materiaPrimaInput);

	}

}
