package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity21;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity21Repository extends JpaRepository<GenEntity21, UUID> {
    List<GenEntity21> findByName(String name);
    List<GenEntity21> findByStatus(String status);
    List<GenEntity21> findByType(String type);
    List<GenEntity21> findByIsActiveTrue();
}
