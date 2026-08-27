package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity221;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity221Repository extends JpaRepository<GenEntity221, UUID> {
    List<GenEntity221> findByName(String name);
    List<GenEntity221> findByStatus(String status);
    List<GenEntity221> findByType(String type);
    List<GenEntity221> findByIsActiveTrue();
}
