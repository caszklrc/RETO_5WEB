package com.mt.Reto5.crudRepository;

import com.mt.Reto5.model.Order;

import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author  CarlosSacristan
 * @since   2021-12-14
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
    List<Order> findBySalesManId(Integer id);
    List<Order> findBySalesManIdAndStatus(Integer id, String status);
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id);
}
