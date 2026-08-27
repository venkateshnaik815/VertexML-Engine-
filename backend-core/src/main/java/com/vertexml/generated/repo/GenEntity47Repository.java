package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity47;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity47Repository extends JpaRepository<GenEntity47, UUID> {
    List<GenEntity47> findByName(String name);
    List<GenEntity47> findByStatus(String status);
    List<GenEntity47> findByType(String type);
    List<GenEntity47> findByIsActiveTrue();
}
