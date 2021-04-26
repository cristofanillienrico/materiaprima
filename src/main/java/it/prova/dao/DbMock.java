package it.prova.dao;

import java.util.ArrayList;
import java.util.List;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;

public class DbMock {

	public static final List<MateriaPrima> MATERIEPRIME = new ArrayList<MateriaPrima>();

	static {

		MateriaPrima polistirene = new MateriaPrima(1L, "plastica", Stato.IN_LAVORAZIONE);
		MATERIEPRIME.add(polistirene);
		MateriaPrima profilato = new MateriaPrima(21L, "profilato in bronzo", Stato.IN_ASSEMBLAGGIO);
		MATERIEPRIME.add(profilato);
		MateriaPrima estruso = new MateriaPrima(42L, "da verniciare", Stato.IN_VERNICIATURA);
		MATERIEPRIME.add(estruso);
		MateriaPrima valvolaAFarfalla = new MateriaPrima(101L, "da assemblare", Stato.IN_ASSEMBLAGGIO);
		MATERIEPRIME.add(valvolaAFarfalla);

	}

}
