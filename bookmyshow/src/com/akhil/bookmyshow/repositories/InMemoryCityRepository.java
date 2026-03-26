package com.akhil.bookmyshow.repositories;

import java.util.HashMap;
import java.util.Map;

import com.akhil.bookmyshow.models.City;

public class InMemoryCityRepository implements CityRepository {
	private Map<Long, City> cityMap = new HashMap<>();
}
