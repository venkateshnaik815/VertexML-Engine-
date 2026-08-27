package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity61;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity61Repository extends JpaRepository<GenEntity61, UUID> {
    List<GenEntity61> findByName(String name);
    List<GenEntity61> findByStatus(String status);
    List<GenEntity61> findByType(String type);
    List<GenEntity61> findByIsActiveTrue();
}
