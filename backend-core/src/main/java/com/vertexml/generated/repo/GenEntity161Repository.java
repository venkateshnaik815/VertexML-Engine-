package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity161;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity161Repository extends JpaRepository<GenEntity161, UUID> {
    List<GenEntity161> findByName(String name);
    List<GenEntity161> findByStatus(String status);
    List<GenEntity161> findByType(String type);
    List<GenEntity161> findByIsActiveTrue();
}
