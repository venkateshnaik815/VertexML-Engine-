package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity216;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity216Repository extends JpaRepository<GenEntity216, UUID> {
    List<GenEntity216> findByName(String name);
    List<GenEntity216> findByStatus(String status);
    List<GenEntity216> findByType(String type);
    List<GenEntity216> findByIsActiveTrue();
}
