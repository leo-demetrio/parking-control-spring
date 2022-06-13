package com.leodemetrio.parkingcontrol.service;

import com.leodemetrio.parkingcontrol.model.ParkingSpotModel;
import com.leodemetrio.parkingcontrol.repository.ParkingSpotRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Log4j2
public class ParkingSpotService {

    private final ParkingSpotRepository parkingSpotRepository;

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        log.info(parkingSpotModel);
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
