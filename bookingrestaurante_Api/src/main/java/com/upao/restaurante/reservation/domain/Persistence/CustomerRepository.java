package com.upao.restaurante.reservation.domain.Persistence;

import com.upao.restaurante.reservation.domain.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

// Pasas la entidad(Customer) y el tipo de dato del identificador
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    // Debe cumplir: Metodo comienza con el prefijo findBy y despues un atributo que debe existir en la entity,
    // En el caso de ponerle otro nombre usar @query
    // @Query("SELECT c FROM Customer c WHERE c.firstName = ?")
    // List<Customer> findByNombre(String firstName);


    // En el caso que sean dos variables agregar AND entre las variables
    // @Query("SELECT c FROM Customer c WHERE c.firstName = ? AND c.lastName = ?")
    // List<Customer> findByNombre(String firstName, String lastName);

    // Tambien se puede usar sql, el ? es para jalar la variable
    // @Query(value = "SELECT * FROM customer WHERE first_name=?",nativeQuery = true)
    // En el caso que sean dos variables agregar AND entre las variables
    // @Query(value = "SELECT * FROM customer WHERE first_name=? AND last_name = ?",nativeQuery = true)
    // List<Customer> findByFirstName(String firstName, String lastName);
    List<Customer> findByFirstName(String firstName);
}
