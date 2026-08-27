package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity203;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity203Repository extends JpaRepository<GenEntity203, UUID> {
    List<GenEntity203> findByName(String name);
    List<GenEntity203> findByStatus(String status);
    List<GenEntity203> findByType(String type);
    List<GenEntity203> findByIsActiveTrue();
}
