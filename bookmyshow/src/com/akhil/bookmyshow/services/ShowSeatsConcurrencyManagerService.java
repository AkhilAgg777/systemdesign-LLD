package com.akhil.bookmyshow.services;

import java.util.List;

import com.akhil.bookmyshow.models.ShowSeat;

public interface ShowSeatsConcurrencyManagerService {
boolean getLockForShowSeats(List<Long> showSeatIds);
}
