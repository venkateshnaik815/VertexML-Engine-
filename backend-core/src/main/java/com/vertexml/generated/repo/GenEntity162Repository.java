package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity162;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity162Repository extends JpaRepository<GenEntity162, UUID> {
    List<GenEntity162> findByName(String name);
    List<GenEntity162> findByStatus(String status);
    List<GenEntity162> findByType(String type);
    List<GenEntity162> findByIsActiveTrue();
}
