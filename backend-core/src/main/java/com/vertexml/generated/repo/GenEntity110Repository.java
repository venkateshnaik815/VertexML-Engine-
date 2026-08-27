package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity110;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity110Repository extends JpaRepository<GenEntity110, UUID> {
    List<GenEntity110> findByName(String name);
    List<GenEntity110> findByStatus(String status);
    List<GenEntity110> findByType(String type);
    List<GenEntity110> findByIsActiveTrue();
}
