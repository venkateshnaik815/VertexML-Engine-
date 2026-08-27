package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity255;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity255Repository extends JpaRepository<GenEntity255, UUID> {
    List<GenEntity255> findByName(String name);
    List<GenEntity255> findByStatus(String status);
    List<GenEntity255> findByType(String type);
    List<GenEntity255> findByIsActiveTrue();
}
