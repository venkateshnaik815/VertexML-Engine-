package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity116;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity116Repository extends JpaRepository<GenEntity116, UUID> {
    List<GenEntity116> findByName(String name);
    List<GenEntity116> findByStatus(String status);
    List<GenEntity116> findByType(String type);
    List<GenEntity116> findByIsActiveTrue();
}
