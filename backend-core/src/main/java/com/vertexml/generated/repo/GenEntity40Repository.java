package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity40;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity40Repository extends JpaRepository<GenEntity40, UUID> {
    List<GenEntity40> findByName(String name);
    List<GenEntity40> findByStatus(String status);
    List<GenEntity40> findByType(String type);
    List<GenEntity40> findByIsActiveTrue();
}
