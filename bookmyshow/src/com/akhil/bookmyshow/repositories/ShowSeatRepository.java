package com.akhil.bookmyshow.repositories;

import java.util.concurrent.locks.Lock;

import com.akhil.bookmyshow.models.ShowSeat;

public interface ShowSeatRepository {
	ShowSeat getShowSeatById(Long id);
	ShowSeat update(ShowSeat showSeat);
	boolean getLockOverShowSeat(Long id);
	void unlockShowSeat(Long id);
}
