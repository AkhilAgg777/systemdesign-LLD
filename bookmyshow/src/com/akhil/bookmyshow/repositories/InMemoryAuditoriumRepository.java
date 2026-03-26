package com.akhil.bookmyshow.repositories;

import java.util.HashMap;
import java.util.Map;

import com.akhil.bookmyshow.models.Auditorium;

public class InMemoryAuditoriumRepository implements AuditoriumRepository {

	private Map<Long,Auditorium> auditoriumMap=new HashMap<>();
}
