package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity77;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity77Repository extends JpaRepository<GenEntity77, UUID> {
    List<GenEntity77> findByName(String name);
    List<GenEntity77> findByStatus(String status);
    List<GenEntity77> findByType(String type);
    List<GenEntity77> findByIsActiveTrue();
}
