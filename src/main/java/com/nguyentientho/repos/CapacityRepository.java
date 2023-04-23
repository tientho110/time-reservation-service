package com.nguyentientho.repos;

import com.nguyentientho.model.AmenityType;
import com.nguyentientho.model.Capacity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapacityRepository extends JpaRepository<Capacity, Long> {

    Capacity findByAmenityType(AmenityType amenityType);
}
