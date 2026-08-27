package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity89;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity89Repository extends JpaRepository<GenEntity89, UUID> {
    List<GenEntity89> findByName(String name);
    List<GenEntity89> findByStatus(String status);
    List<GenEntity89> findByType(String type);
    List<GenEntity89> findByIsActiveTrue();
}
