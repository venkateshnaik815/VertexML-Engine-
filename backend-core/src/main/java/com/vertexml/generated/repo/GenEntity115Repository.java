package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity115;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity115Repository extends JpaRepository<GenEntity115, UUID> {
    List<GenEntity115> findByName(String name);
    List<GenEntity115> findByStatus(String status);
    List<GenEntity115> findByType(String type);
    List<GenEntity115> findByIsActiveTrue();
}
