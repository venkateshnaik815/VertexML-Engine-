package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity13;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity13Repository extends JpaRepository<GenEntity13, UUID> {
    List<GenEntity13> findByName(String name);
    List<GenEntity13> findByStatus(String status);
    List<GenEntity13> findByType(String type);
    List<GenEntity13> findByIsActiveTrue();
}
