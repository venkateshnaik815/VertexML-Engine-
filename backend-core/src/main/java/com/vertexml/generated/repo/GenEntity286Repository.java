package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity286;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity286Repository extends JpaRepository<GenEntity286, UUID> {
    List<GenEntity286> findByName(String name);
    List<GenEntity286> findByStatus(String status);
    List<GenEntity286> findByType(String type);
    List<GenEntity286> findByIsActiveTrue();
}
