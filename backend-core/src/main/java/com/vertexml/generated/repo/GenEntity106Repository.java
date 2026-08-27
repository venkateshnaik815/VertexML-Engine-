package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity106;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity106Repository extends JpaRepository<GenEntity106, UUID> {
    List<GenEntity106> findByName(String name);
    List<GenEntity106> findByStatus(String status);
    List<GenEntity106> findByType(String type);
    List<GenEntity106> findByIsActiveTrue();
}
