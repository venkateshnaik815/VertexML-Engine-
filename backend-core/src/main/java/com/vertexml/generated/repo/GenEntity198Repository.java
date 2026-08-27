package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity198;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity198Repository extends JpaRepository<GenEntity198, UUID> {
    List<GenEntity198> findByName(String name);
    List<GenEntity198> findByStatus(String status);
    List<GenEntity198> findByType(String type);
    List<GenEntity198> findByIsActiveTrue();
}
