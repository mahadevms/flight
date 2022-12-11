package com.checkinApp.integration;

import com.checkinApp.dto.Reservation;
import com.checkinApp.dto.UpdateReservation;

public interface RestClientService {
public Reservation findReservationById(Long id);

public Reservation updateReservation(UpdateReservation ur);

}
