package com.upao.restaurante.reservation.domain.Persistence;

import com.upao.restaurante.reservation.domain.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findByName(String name);
    List<Restaurant> findByNumber(int number);

}
