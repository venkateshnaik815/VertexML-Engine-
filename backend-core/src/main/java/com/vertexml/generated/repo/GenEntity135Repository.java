package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity135;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity135Repository extends JpaRepository<GenEntity135, UUID> {
    List<GenEntity135> findByName(String name);
    List<GenEntity135> findByStatus(String status);
    List<GenEntity135> findByType(String type);
    List<GenEntity135> findByIsActiveTrue();
}
