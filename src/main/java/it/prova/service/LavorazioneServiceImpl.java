package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;

@Service
public class LavorazioneServiceImpl implements LavorazioneService {

	@Autowired
	private AssemblaggioService assemblaggioService;
	@Autowired
	private VerniciatureService verniciaturaService;
	@Autowired
	private MessaInOperaService messaInOperaService;

	@Override
	public void inviaInLavorazione(MateriaPrima materiaPrimaInput) throws Exception {
		System.out.println("Inizia lavorazione........................");
		System.out.println("************************************");

		System.out.println("Inizio lavorazione della materia prima: " + materiaPrimaInput);
		assemblaggioService.eseguiAssemblaggio(materiaPrimaInput);
		verniciaturaService.eseguiVerniciatura(materiaPrimaInput);
		messaInOperaService.avviaMessaInOpera(materiaPrimaInput);
		materiaPrimaInput.setStato(Stato.PRONTA);
		System.out.println("Termine lavorazione della materia prima: " + materiaPrimaInput);
		System.out.println("************************************");

	}

}
