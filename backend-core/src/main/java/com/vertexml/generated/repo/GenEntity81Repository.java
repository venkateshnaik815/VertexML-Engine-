package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity81;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity81Repository extends JpaRepository<GenEntity81, UUID> {
    List<GenEntity81> findByName(String name);
    List<GenEntity81> findByStatus(String status);
    List<GenEntity81> findByType(String type);
    List<GenEntity81> findByIsActiveTrue();
}
