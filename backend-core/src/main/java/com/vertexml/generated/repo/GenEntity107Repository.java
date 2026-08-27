package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity107;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity107Repository extends JpaRepository<GenEntity107, UUID> {
    List<GenEntity107> findByName(String name);
    List<GenEntity107> findByStatus(String status);
    List<GenEntity107> findByType(String type);
    List<GenEntity107> findByIsActiveTrue();
}
