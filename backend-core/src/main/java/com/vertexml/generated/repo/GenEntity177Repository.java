package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity177;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity177Repository extends JpaRepository<GenEntity177, UUID> {
    List<GenEntity177> findByName(String name);
    List<GenEntity177> findByStatus(String status);
    List<GenEntity177> findByType(String type);
    List<GenEntity177> findByIsActiveTrue();
}
