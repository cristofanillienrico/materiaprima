package it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;

@Service
public class MessaInOperaServiceImpl implements MessaInOperaService {

	@Autowired
	private MateriaPrimaService materiaPrimaService;

	@Override
	public void avviaMessaInOpera(MateriaPrima materiaPrimaInput) throws Exception {

		materiaPrimaInput.setStato(Stato.IN_MESSAINOPERA);
		materiaPrimaService.aggiorna(materiaPrimaInput);
		System.out.println("Avvio la messa in oper di " + materiaPrimaInput);

	}

}
