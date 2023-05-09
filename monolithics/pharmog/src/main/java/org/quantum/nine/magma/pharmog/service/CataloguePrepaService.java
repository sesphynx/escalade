package org.quantum.nine.magma.pharmog.service;

import java.util.List;

import org.quantum.nine.magma.pharmog.entities.CategoryPrepa;
import org.quantum.nine.magma.pharmog.entities.Prepa;

public interface CataloguePrepaService {
	
	/* Prepas Sets */
	Prepa savePrepa(Prepa prepa);

	Prepa updatePrepa(Prepa prepa);

	void deletePrepa(Prepa prepa);

	Prepa getPrepaById(Long id);

	List<Prepa> getAllPrepas();

	
	/* CategoryPrepa's Sets */
	
	CategoryPrepa saveCategoryPrepa(CategoryPrepa categoryPrepa);

	CategoryPrepa updateCategoryPrepa(CategoryPrepa categoryPrepa);

	void deleteCategoryPrepa(CategoryPrepa categoryPrepa);

	CategoryPrepa getCategoryPrepaById(Long id);

	List<CategoryPrepa> getAllCategoryPrepas();
	
	

}
