package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity211;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity211Repository extends JpaRepository<GenEntity211, UUID> {
    List<GenEntity211> findByName(String name);
    List<GenEntity211> findByStatus(String status);
    List<GenEntity211> findByType(String type);
    List<GenEntity211> findByIsActiveTrue();
}
