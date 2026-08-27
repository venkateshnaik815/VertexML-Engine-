package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity251;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity251Repository extends JpaRepository<GenEntity251, UUID> {
    List<GenEntity251> findByName(String name);
    List<GenEntity251> findByStatus(String status);
    List<GenEntity251> findByType(String type);
    List<GenEntity251> findByIsActiveTrue();
}
