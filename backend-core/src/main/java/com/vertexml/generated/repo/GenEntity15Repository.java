package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity15;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity15Repository extends JpaRepository<GenEntity15, UUID> {
    List<GenEntity15> findByName(String name);
    List<GenEntity15> findByStatus(String status);
    List<GenEntity15> findByType(String type);
    List<GenEntity15> findByIsActiveTrue();
}
