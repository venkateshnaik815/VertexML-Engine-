package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity46;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity46Repository extends JpaRepository<GenEntity46, UUID> {
    List<GenEntity46> findByName(String name);
    List<GenEntity46> findByStatus(String status);
    List<GenEntity46> findByType(String type);
    List<GenEntity46> findByIsActiveTrue();
}
