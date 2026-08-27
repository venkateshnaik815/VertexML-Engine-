package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity83;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity83Repository extends JpaRepository<GenEntity83, UUID> {
    List<GenEntity83> findByName(String name);
    List<GenEntity83> findByStatus(String status);
    List<GenEntity83> findByType(String type);
    List<GenEntity83> findByIsActiveTrue();
}
