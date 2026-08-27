package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity6;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity6Repository extends JpaRepository<GenEntity6, UUID> {
    List<GenEntity6> findByName(String name);
    List<GenEntity6> findByStatus(String status);
    List<GenEntity6> findByType(String type);
    List<GenEntity6> findByIsActiveTrue();
}
