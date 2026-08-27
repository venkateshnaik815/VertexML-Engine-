package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity63;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity63Repository extends JpaRepository<GenEntity63, UUID> {
    List<GenEntity63> findByName(String name);
    List<GenEntity63> findByStatus(String status);
    List<GenEntity63> findByType(String type);
    List<GenEntity63> findByIsActiveTrue();
}
