package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity48;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity48Repository extends JpaRepository<GenEntity48, UUID> {
    List<GenEntity48> findByName(String name);
    List<GenEntity48> findByStatus(String status);
    List<GenEntity48> findByType(String type);
    List<GenEntity48> findByIsActiveTrue();
}
