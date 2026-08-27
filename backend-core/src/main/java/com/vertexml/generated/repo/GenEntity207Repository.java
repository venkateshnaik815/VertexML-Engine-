package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity207;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity207Repository extends JpaRepository<GenEntity207, UUID> {
    List<GenEntity207> findByName(String name);
    List<GenEntity207> findByStatus(String status);
    List<GenEntity207> findByType(String type);
    List<GenEntity207> findByIsActiveTrue();
}
