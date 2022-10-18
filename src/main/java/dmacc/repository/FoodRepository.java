package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Food;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Oct 18, 2022
 */
@Repository
public interface FoodRepository extends JpaRepository<Food, Long>{

}
