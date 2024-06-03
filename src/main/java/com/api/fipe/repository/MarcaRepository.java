package com.api.fipe.repository;

import com.api.fipe.model.CategoriaModel;
import com.api.fipe.model.InteresseModel;
import com.api.fipe.model.MarcaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcaRepository extends JpaRepository<MarcaModel, Long> {

    List<MarcaModel> findByCategoriaModelId(Long idCategoriaModel);

}
