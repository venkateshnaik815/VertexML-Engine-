package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity200;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity200Repository extends JpaRepository<GenEntity200, UUID> {
    List<GenEntity200> findByName(String name);
    List<GenEntity200> findByStatus(String status);
    List<GenEntity200> findByType(String type);
    List<GenEntity200> findByIsActiveTrue();
}
