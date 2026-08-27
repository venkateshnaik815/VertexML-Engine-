package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity158;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity158Repository extends JpaRepository<GenEntity158, UUID> {
    List<GenEntity158> findByName(String name);
    List<GenEntity158> findByStatus(String status);
    List<GenEntity158> findByType(String type);
    List<GenEntity158> findByIsActiveTrue();
}
