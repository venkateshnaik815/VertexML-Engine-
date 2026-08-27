package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity69;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity69Repository extends JpaRepository<GenEntity69, UUID> {
    List<GenEntity69> findByName(String name);
    List<GenEntity69> findByStatus(String status);
    List<GenEntity69> findByType(String type);
    List<GenEntity69> findByIsActiveTrue();
}
