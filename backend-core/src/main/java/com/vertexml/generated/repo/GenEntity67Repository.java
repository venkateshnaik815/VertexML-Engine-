package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity67;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity67Repository extends JpaRepository<GenEntity67, UUID> {
    List<GenEntity67> findByName(String name);
    List<GenEntity67> findByStatus(String status);
    List<GenEntity67> findByType(String type);
    List<GenEntity67> findByIsActiveTrue();
}
