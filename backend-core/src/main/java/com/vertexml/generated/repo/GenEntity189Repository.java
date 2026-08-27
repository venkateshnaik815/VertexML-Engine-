package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity189;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity189Repository extends JpaRepository<GenEntity189, UUID> {
    List<GenEntity189> findByName(String name);
    List<GenEntity189> findByStatus(String status);
    List<GenEntity189> findByType(String type);
    List<GenEntity189> findByIsActiveTrue();
}
