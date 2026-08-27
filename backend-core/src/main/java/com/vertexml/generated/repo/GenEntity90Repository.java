package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity90;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity90Repository extends JpaRepository<GenEntity90, UUID> {
    List<GenEntity90> findByName(String name);
    List<GenEntity90> findByStatus(String status);
    List<GenEntity90> findByType(String type);
    List<GenEntity90> findByIsActiveTrue();
}
