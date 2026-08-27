package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity199;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity199Repository extends JpaRepository<GenEntity199, UUID> {
    List<GenEntity199> findByName(String name);
    List<GenEntity199> findByStatus(String status);
    List<GenEntity199> findByType(String type);
    List<GenEntity199> findByIsActiveTrue();
}
