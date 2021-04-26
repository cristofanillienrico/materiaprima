package it.prova.dao;

import org.springframework.stereotype.Component;

import it.prova.model.MateriaPrima;

@Component
public class MateriaPrimaDAOImpl implements MateriaPrimaDAO {

	@Override
	public MateriaPrima get(Long id) throws Exception {
		for (MateriaPrima materiaPrimaItem : DbMock.MATERIEPRIME) {
			if (materiaPrimaItem.getId() == id) {
				return materiaPrimaItem;
			}
		}
		return null;
	}

	@Override
	public void update(MateriaPrima materiaPrimaInput) throws Exception {
		for (MateriaPrima materiaPrimaItem : DbMock.MATERIEPRIME) {
			if (materiaPrimaItem.getId() == materiaPrimaInput.getId()) {
				MateriaPrima daModificare = materiaPrimaItem;
				daModificare.setDescrizione(materiaPrimaInput.getDescrizione());
				daModificare.setStato(materiaPrimaInput.getStato());
			}
		}
	}
}