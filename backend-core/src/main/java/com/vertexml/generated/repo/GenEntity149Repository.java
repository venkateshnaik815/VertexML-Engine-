package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity149;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity149Repository extends JpaRepository<GenEntity149, UUID> {
    List<GenEntity149> findByName(String name);
    List<GenEntity149> findByStatus(String status);
    List<GenEntity149> findByType(String type);
    List<GenEntity149> findByIsActiveTrue();
}
