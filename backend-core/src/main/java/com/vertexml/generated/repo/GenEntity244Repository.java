package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity244;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity244Repository extends JpaRepository<GenEntity244, UUID> {
    List<GenEntity244> findByName(String name);
    List<GenEntity244> findByStatus(String status);
    List<GenEntity244> findByType(String type);
    List<GenEntity244> findByIsActiveTrue();
}
