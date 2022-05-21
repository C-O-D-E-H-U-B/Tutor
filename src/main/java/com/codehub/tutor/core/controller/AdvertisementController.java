package com.codehub.tutor.core.controller;

import com.codehub.tutor.core.modal.Advertisement;
import com.codehub.tutor.core.service.api.AdvertisementServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdvertisementController {
    @Autowired
    AdvertisementServiceAPI advertisementService;

    @PostMapping("/")
    public Advertisement createAd(Advertisement advertisement) {
        return advertisementService.createAd(advertisement);
    }

    @GetMapping("/ads")
    public List<Advertisement> getAllAds() {
        return advertisementService.getAllAds();
    }

    @GetMapping("/ads/{id}")
    public Advertisement getAdById(@PathVariable long id) {
        return advertisementService.getAdById(id);
    }

    @DeleteMapping("/ads/{id}")
    public void deleteAdById(@PathVariable long id) {
        advertisementService.deleteAdById(id);
    }

    @PutMapping("/ads/{id}")
    public Advertisement updateAdById(Advertisement advertisement) {
        return advertisementService.updateById(advertisement);
    }
}
