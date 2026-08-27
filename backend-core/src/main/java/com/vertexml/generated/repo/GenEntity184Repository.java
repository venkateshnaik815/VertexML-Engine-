package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity184;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity184Repository extends JpaRepository<GenEntity184, UUID> {
    List<GenEntity184> findByName(String name);
    List<GenEntity184> findByStatus(String status);
    List<GenEntity184> findByType(String type);
    List<GenEntity184> findByIsActiveTrue();
}
