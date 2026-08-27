package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity101;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity101Repository extends JpaRepository<GenEntity101, UUID> {
    List<GenEntity101> findByName(String name);
    List<GenEntity101> findByStatus(String status);
    List<GenEntity101> findByType(String type);
    List<GenEntity101> findByIsActiveTrue();
}
