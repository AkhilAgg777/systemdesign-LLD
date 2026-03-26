package com.akhil.bookmyshow.repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

import com.akhil.bookmyshow.models.ShowSeat;

public class InMemoryShowSeatRepository implements ShowSeatRepository {
	private Map<Long, ShowSeat> showSeatMap = new ConcurrentHashMap<Long, ShowSeat>();
	private Map<Long, Integer> isShowSeatLocked = new ConcurrentHashMap<>();
	// private Map<ShowSeat, String> showSeatLockOwners = new ConcurrentHashMap<>();

	@Override
	public ShowSeat getShowSeatById(Long id) {
		if (showSeatMap.containsKey(id)) {
			return showSeatMap.get(id);
		}
		return null;
	}

	@Override
	public ShowSeat update(ShowSeat showSeat) {
		showSeatMap.put(ShowSeat.getId(), showSeat);
		return showSeat;
	}

	@Override
	public boolean getLockOverShowSeat(Long id) {
		// if map has the object
		// if value==0 =>it is currently unlocked
		// set value to 1
		// else:it is locked
		// else
		// => the seat is unlocked and I will put it in the map with value==1

		ShowSeat showSeat = getShowSeatById(id);

		synchronized (id) {
			if (isShowSeatLocked.containsKey(id)) {
				if (isShowSeatLocked.get(id).equals(1)) {
					return false;
				}
				isShowSeatLocked.put(id, 1);
				// showSeatLockOwners.put(showSeat, Thread.currentThread().getName());
				return true;
			}
			isShowSeatLocked.put(id, 1);
			return true;

		}
	}

	@Override
	public void unlockShowSeat(Long id) {
		isShowSeatLocked.put(id, 0);

	}

}
