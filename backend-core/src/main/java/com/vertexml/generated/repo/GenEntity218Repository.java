package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity218;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity218Repository extends JpaRepository<GenEntity218, UUID> {
    List<GenEntity218> findByName(String name);
    List<GenEntity218> findByStatus(String status);
    List<GenEntity218> findByType(String type);
    List<GenEntity218> findByIsActiveTrue();
}
