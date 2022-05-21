package com.codehub.tutor.core.service.api;

import com.codehub.tutor.core.modal.Advertisement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdvertisementServiceAPI {

    /**
     * To get all advertisements
     *
     * @return all advertisements
     */
    public abstract List<Advertisement> getAllAds();

    /**
     * To advertisements by id
     *
     * @return the advertisements
     */
    public abstract Advertisement getAdById(long id);

    /**
     * To delete advertisements by id
     *
     */
    public abstract void deleteAdById(long id);

    /**
     * Update advertisements by id
     *
     * @return the updated advertisements
     */
    public abstract Advertisement updateById(Advertisement advertisement);

    /**
     * create advertisement
     *
     * @return the created advertisements
     */
    public abstract Advertisement createAd(Advertisement advertisement);
}
