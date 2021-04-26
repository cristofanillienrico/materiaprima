package it.prova.service;

import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;

@Service
public class MessaInOperaServiceImpl implements MessaInOperaService {

	@Override
	public void avviaMessaInOpera(MateriaPrima materiaPrimaInput) throws Exception {
		materiaPrimaInput.setStato(Stato.IN_MESSAINOPERA);
		System.out.println("Avvio la messa in oper di " + materiaPrimaInput);

	}

}
