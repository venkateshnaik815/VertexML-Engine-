package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity70;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity70Repository extends JpaRepository<GenEntity70, UUID> {
    List<GenEntity70> findByName(String name);
    List<GenEntity70> findByStatus(String status);
    List<GenEntity70> findByType(String type);
    List<GenEntity70> findByIsActiveTrue();
}
