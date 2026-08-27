package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity250;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity250Repository extends JpaRepository<GenEntity250, UUID> {
    List<GenEntity250> findByName(String name);
    List<GenEntity250> findByStatus(String status);
    List<GenEntity250> findByType(String type);
    List<GenEntity250> findByIsActiveTrue();
}
