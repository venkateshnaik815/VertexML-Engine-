package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity119;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity119Repository extends JpaRepository<GenEntity119, UUID> {
    List<GenEntity119> findByName(String name);
    List<GenEntity119> findByStatus(String status);
    List<GenEntity119> findByType(String type);
    List<GenEntity119> findByIsActiveTrue();
}
