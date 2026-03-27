package ridebookingappdesign.repository;



import ridebookingappdesign.domain.Driver;
import ridebookingappdesign.domain.DriverStatus;

import java.util.List;
import java.util.Optional;

public interface DriverRepository {
    Optional<Driver> findById(String id);

    void save(Driver driver);

    List<Driver> findByStatus(DriverStatus status);
}