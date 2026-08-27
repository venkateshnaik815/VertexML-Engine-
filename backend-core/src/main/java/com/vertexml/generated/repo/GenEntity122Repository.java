package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity122;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity122Repository extends JpaRepository<GenEntity122, UUID> {
    List<GenEntity122> findByName(String name);
    List<GenEntity122> findByStatus(String status);
    List<GenEntity122> findByType(String type);
    List<GenEntity122> findByIsActiveTrue();
}
