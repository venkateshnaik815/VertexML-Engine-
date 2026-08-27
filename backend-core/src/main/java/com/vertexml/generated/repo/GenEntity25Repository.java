package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity25;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity25Repository extends JpaRepository<GenEntity25, UUID> {
    List<GenEntity25> findByName(String name);
    List<GenEntity25> findByStatus(String status);
    List<GenEntity25> findByType(String type);
    List<GenEntity25> findByIsActiveTrue();
}
