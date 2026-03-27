package ridebookingappdesign.repository.impl;



import ridebookingappdesign.domain.Location;
import ridebookingappdesign.repository.LocationRepository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryLocationRepository implements LocationRepository {
    private final Map<String, Location> storage = new ConcurrentHashMap<>();

    @Override
    public void saveLocation(String driverId, Location location) {
        storage.put(driverId, location);
    }

    @Override
    public Location getLatestLocation(String driverId) {
        return storage.get(driverId);
    }
}