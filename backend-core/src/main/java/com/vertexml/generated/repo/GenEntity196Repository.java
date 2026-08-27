package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity196;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity196Repository extends JpaRepository<GenEntity196, UUID> {
    List<GenEntity196> findByName(String name);
    List<GenEntity196> findByStatus(String status);
    List<GenEntity196> findByType(String type);
    List<GenEntity196> findByIsActiveTrue();
}
