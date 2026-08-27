package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity285;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity285Repository extends JpaRepository<GenEntity285, UUID> {
    List<GenEntity285> findByName(String name);
    List<GenEntity285> findByStatus(String status);
    List<GenEntity285> findByType(String type);
    List<GenEntity285> findByIsActiveTrue();
}
