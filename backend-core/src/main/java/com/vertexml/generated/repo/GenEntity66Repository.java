package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity66;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity66Repository extends JpaRepository<GenEntity66, UUID> {
    List<GenEntity66> findByName(String name);
    List<GenEntity66> findByStatus(String status);
    List<GenEntity66> findByType(String type);
    List<GenEntity66> findByIsActiveTrue();
}
