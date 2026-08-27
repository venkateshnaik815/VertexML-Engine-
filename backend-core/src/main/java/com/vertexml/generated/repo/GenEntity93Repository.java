package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity93;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity93Repository extends JpaRepository<GenEntity93, UUID> {
    List<GenEntity93> findByName(String name);
    List<GenEntity93> findByStatus(String status);
    List<GenEntity93> findByType(String type);
    List<GenEntity93> findByIsActiveTrue();
}
