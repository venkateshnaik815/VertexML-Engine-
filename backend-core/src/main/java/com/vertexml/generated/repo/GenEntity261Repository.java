package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity261;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity261Repository extends JpaRepository<GenEntity261, UUID> {
    List<GenEntity261> findByName(String name);
    List<GenEntity261> findByStatus(String status);
    List<GenEntity261> findByType(String type);
    List<GenEntity261> findByIsActiveTrue();
}
