package com.codehub.tutor.core.service.impl;

import com.codehub.tutor.core.dao.AdvertisementDAO;
import com.codehub.tutor.core.modal.Advertisement;
import com.codehub.tutor.core.service.api.AdvertisementServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementServiceImpl implements AdvertisementServiceAPI {

    @Autowired
    AdvertisementDAO advertisementDAO;

    @Override
    public List<Advertisement> getAllAds() {
        return advertisementDAO.findAll();
    }

    @Override
    public Advertisement getAdById(long id) {
        return advertisementDAO.getById(id);
    }

    @Override
    public void deleteAdById(long id) {
        advertisementDAO.deleteById(id);
    }

    @Override
    public Advertisement updateById(Advertisement advertisement) {
        return advertisementDAO.save(advertisement);
    }

    @Override
    public Advertisement createAd(Advertisement advertisement) {
        return advertisementDAO.save(advertisement);
    }
}
