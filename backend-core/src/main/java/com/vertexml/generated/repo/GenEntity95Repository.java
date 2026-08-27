package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity95;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity95Repository extends JpaRepository<GenEntity95, UUID> {
    List<GenEntity95> findByName(String name);
    List<GenEntity95> findByStatus(String status);
    List<GenEntity95> findByType(String type);
    List<GenEntity95> findByIsActiveTrue();
}
