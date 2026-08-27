package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity300;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity300Repository extends JpaRepository<GenEntity300, UUID> {
    List<GenEntity300> findByName(String name);
    List<GenEntity300> findByStatus(String status);
    List<GenEntity300> findByType(String type);
    List<GenEntity300> findByIsActiveTrue();
}
