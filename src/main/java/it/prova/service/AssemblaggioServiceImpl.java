package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;

@Service
public class AssemblaggioServiceImpl implements AssemblaggioService {

	@Autowired
	private MateriaPrimaService materiaPrimaService;

	@Override
	public void eseguiAssemblaggio(MateriaPrima materiaPrimaInput) throws Exception {
		materiaPrimaInput.setStato(Stato.IN_ASSEMBLAGGIO);
		materiaPrimaService.aggiorna(materiaPrimaInput);
		System.out.println("Eseguo l'assemblaggio di " + materiaPrimaInput);

	}

}
