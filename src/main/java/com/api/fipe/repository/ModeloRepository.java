package com.api.fipe.repository;

import com.api.fipe.model.MarcaModel;
import com.api.fipe.model.ModeloModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeloRepository extends JpaRepository<ModeloModel, Long> {

    List<ModeloModel> findByMarcaModelId(Long idMarca);

}
