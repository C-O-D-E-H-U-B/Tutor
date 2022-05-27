package com.codehub.tutor.core.controller;

import com.codehub.tutor.core.model.Advertisement;
import com.codehub.tutor.core.service.api.AdvertisementServiceAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/advertisements")
@RestController
public class AdvertisementController {

    private final Logger log = LoggerFactory.getLogger(AdvertisementController.class);
    @Autowired
    AdvertisementServiceAPI advertisementService;

    @PostMapping()
    public ResponseEntity<Advertisement> createAd(Advertisement advertisement) {
        if (advertisement.getAdId() > 0) {
            log.error("Id should be empty");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        log.info("Advertisement created");
        return new ResponseEntity<>((advertisementService.createAd(advertisement)), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Advertisement>> getAllAds() {
        return new ResponseEntity<>(advertisementService.getAllAds(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Advertisement> getAdById(@PathVariable long id) {
        if (id < 0) {
            log.error("Advertisement id should be a valid one");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        log.info("Advertisement Retrieved");
        return new ResponseEntity<>(advertisementService.getAdById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Advertisement> deleteAdById(@PathVariable long id) {
        if (id < 0) {
            log.error("Advertisement id should be a valid one");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        advertisementService.deleteAdById(id);
        log.info("Advertisement deleted");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Advertisement> updateAdById(Advertisement advertisement) {
        if (advertisement.getAdId() < 0) {
            log.error("Advertisement id should be a valid one");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        log.info("Advertisement updated");
        return new ResponseEntity<>(advertisementService.updateById(advertisement), HttpStatus.OK);
    }
}
