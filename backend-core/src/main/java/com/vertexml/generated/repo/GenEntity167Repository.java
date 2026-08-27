package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity167;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity167Repository extends JpaRepository<GenEntity167, UUID> {
    List<GenEntity167> findByName(String name);
    List<GenEntity167> findByStatus(String status);
    List<GenEntity167> findByType(String type);
    List<GenEntity167> findByIsActiveTrue();
}
