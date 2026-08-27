package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity208;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity208Repository extends JpaRepository<GenEntity208, UUID> {
    List<GenEntity208> findByName(String name);
    List<GenEntity208> findByStatus(String status);
    List<GenEntity208> findByType(String type);
    List<GenEntity208> findByIsActiveTrue();
}
