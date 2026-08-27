package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity243;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity243Repository extends JpaRepository<GenEntity243, UUID> {
    List<GenEntity243> findByName(String name);
    List<GenEntity243> findByStatus(String status);
    List<GenEntity243> findByType(String type);
    List<GenEntity243> findByIsActiveTrue();
}
