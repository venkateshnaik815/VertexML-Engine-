package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity109;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity109Repository extends JpaRepository<GenEntity109, UUID> {
    List<GenEntity109> findByName(String name);
    List<GenEntity109> findByStatus(String status);
    List<GenEntity109> findByType(String type);
    List<GenEntity109> findByIsActiveTrue();
}
