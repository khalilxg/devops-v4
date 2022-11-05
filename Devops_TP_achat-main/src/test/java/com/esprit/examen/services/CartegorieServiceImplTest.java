package com.esprit.examen.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.CategorieProduit;

import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.*;

import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CartegorieServiceImplTest {
	@Autowired
	ICategorieProduitService categorieProduitService;
	
	@Test
	public void testAddCategorie() throws ParseException {
		CategorieProduit cat = new CategorieProduit();
		cat.setCodeCategorie("CAT2");
		cat.setLibelleCategorie("categorie 2");
		categorieProduitService.addCategorieProduit(cat);
		log.info("categorie ajouter avec success");
	}
	
	@Test
	public void testModifierCategorie() throws ParseException {
		CategorieProduit cat = new CategorieProduit();
		cat.setCodeCategorie("CAT2");
		cat.setLibelleCategorie("categorie 2");
		categorieProduitService.addCategorieProduit(cat);
		log.info("categorie ajouter avec success");
		cat.setCodeCategorie("CAT5");
		cat.setLibelleCategorie("categorie 5");
		categorieProduitService.updateCategorieProduit(cat);
		log.info("categorie modifier avec success");
	}
	
	@Test
	public void testDeleteCategorie() throws ParseException {
		CategorieProduit cat = new CategorieProduit();
		cat.setCodeCategorie("CAT2");
		cat.setLibelleCategorie("categorie");
		categorieProduitService.addCategorieProduit(cat);
		categorieProduitService.deleteCategorieProduit(cat.getIdCategorieProduit());
		log.info("categorie supprimer avec success");
	}
	
	@Test
	public void testRetrieveAllCategorie() throws ParseException {
		List<CategorieProduit> listCategorie = categorieProduitService.retrieveAllCategorieProduits();
		log.info("Nombre categorie: " + listCategorie.size()+" \n");
		for(int i=0;i<listCategorie.size();i++){
			log.info(""+listCategorie.get(i).getLibelleCategorie());
		}
	}
	
}
