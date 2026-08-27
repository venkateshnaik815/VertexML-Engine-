package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity179;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity179Repository extends JpaRepository<GenEntity179, UUID> {
    List<GenEntity179> findByName(String name);
    List<GenEntity179> findByStatus(String status);
    List<GenEntity179> findByType(String type);
    List<GenEntity179> findByIsActiveTrue();
}
