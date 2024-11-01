package com.suni.review.repository;

import com.suni.review.api.request.CreateAndEditRestaurantRequest;
import com.suni.review.model.RestaurantEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.ZonedDateTime;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {


}
