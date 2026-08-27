package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity144;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity144Repository extends JpaRepository<GenEntity144, UUID> {
    List<GenEntity144> findByName(String name);
    List<GenEntity144> findByStatus(String status);
    List<GenEntity144> findByType(String type);
    List<GenEntity144> findByIsActiveTrue();
}
