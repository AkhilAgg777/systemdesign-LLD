package ridebookingappdesign.domain.strategy;


import ridebookingappdesign.domain.Driver;
import ridebookingappdesign.domain.Location;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDrivers(Location pickup, List<Driver> candidates, int maxResults);
}