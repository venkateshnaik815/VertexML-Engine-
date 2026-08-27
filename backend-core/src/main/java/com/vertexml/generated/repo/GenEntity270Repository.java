package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity270;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity270Repository extends JpaRepository<GenEntity270, UUID> {
    List<GenEntity270> findByName(String name);
    List<GenEntity270> findByStatus(String status);
    List<GenEntity270> findByType(String type);
    List<GenEntity270> findByIsActiveTrue();
}
