package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity50;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity50Repository extends JpaRepository<GenEntity50, UUID> {
    List<GenEntity50> findByName(String name);
    List<GenEntity50> findByStatus(String status);
    List<GenEntity50> findByType(String type);
    List<GenEntity50> findByIsActiveTrue();
}
