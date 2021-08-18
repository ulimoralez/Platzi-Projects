package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Con Query Methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    /*
    * Con un Query Nativo
    * @Query(value = "SELECT * FROM productos WHERE id_categoria = ?". nativeQuery = true)
    * List<Producto> getByCategoria(int idCategoria);
    * Podemos poner el nombre que queramos
    * */
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
