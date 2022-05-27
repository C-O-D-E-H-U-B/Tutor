package com.codehub.tutor.core.service.api;

import com.codehub.tutor.core.model.Advertisement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdvertisementServiceAPI {

    /**
     * To get all advertisements
     *
     * @return all advertisements
     */
    List<Advertisement> getAllAds();

    /**
     * To advertisements by id
     *
     * @return the advertisements
     */
    Advertisement getAdById(long id);

    /**
     * To delete advertisements by id
     *
     */
    void deleteAdById(long id);

    /**
     * Update advertisements by id
     *
     * @return the updated advertisements
     */
    Advertisement updateById(Advertisement advertisement);

    /**
     * create advertisement
     *
     * @return the created advertisements
     */
    Advertisement createAd(Advertisement advertisement);
}
