package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity112;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity112Repository extends JpaRepository<GenEntity112, UUID> {
    List<GenEntity112> findByName(String name);
    List<GenEntity112> findByStatus(String status);
    List<GenEntity112> findByType(String type);
    List<GenEntity112> findByIsActiveTrue();
}
