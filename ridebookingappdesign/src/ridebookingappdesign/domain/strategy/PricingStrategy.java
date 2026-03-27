package ridebookingappdesign.domain.strategy;


import ridebookingappdesign.domain.Location;

public interface PricingStrategy {
    long calculateFare(Location pickup, Location dropoff, double distanceKm, long durationSec);
}