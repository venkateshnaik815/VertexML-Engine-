package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity219;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity219Repository extends JpaRepository<GenEntity219, UUID> {
    List<GenEntity219> findByName(String name);
    List<GenEntity219> findByStatus(String status);
    List<GenEntity219> findByType(String type);
    List<GenEntity219> findByIsActiveTrue();
}
