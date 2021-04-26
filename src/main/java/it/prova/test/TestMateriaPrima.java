package it.prova.test;

import it.prova.model.MateriaPrima;
import it.prova.service.LavorazioneService;
import it.prova.service.MateriaPrimaService;
import it.prova.spring.MyServiceFactory;

public class TestMateriaPrima {

	public static void main(String[] args) {

		MateriaPrimaService materiaPrimaService = MyServiceFactory.getMateriaPrimaService();
		LavorazioneService lavorazioneService = MyServiceFactory.getLavorazioneService();

		try {
			MateriaPrima miaMateriaPrima = materiaPrimaService.caricaSingolo(1L);
			lavorazioneService.inviaInLavorazione(miaMateriaPrima);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
