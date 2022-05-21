package com.codehub.tutor.core.dao;

import com.codehub.tutor.core.modal.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementDAO extends JpaRepository<Advertisement, Long> {

}
