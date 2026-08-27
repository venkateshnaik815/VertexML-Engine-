package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity298;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity298Repository extends JpaRepository<GenEntity298, UUID> {
    List<GenEntity298> findByName(String name);
    List<GenEntity298> findByStatus(String status);
    List<GenEntity298> findByType(String type);
    List<GenEntity298> findByIsActiveTrue();
}
