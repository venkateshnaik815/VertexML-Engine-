package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity228;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity228Repository extends JpaRepository<GenEntity228, UUID> {
    List<GenEntity228> findByName(String name);
    List<GenEntity228> findByStatus(String status);
    List<GenEntity228> findByType(String type);
    List<GenEntity228> findByIsActiveTrue();
}
