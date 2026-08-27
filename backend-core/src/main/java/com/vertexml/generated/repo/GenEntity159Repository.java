package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity159;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity159Repository extends JpaRepository<GenEntity159, UUID> {
    List<GenEntity159> findByName(String name);
    List<GenEntity159> findByStatus(String status);
    List<GenEntity159> findByType(String type);
    List<GenEntity159> findByIsActiveTrue();
}
