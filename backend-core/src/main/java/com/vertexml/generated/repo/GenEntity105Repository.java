package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity105;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity105Repository extends JpaRepository<GenEntity105, UUID> {
    List<GenEntity105> findByName(String name);
    List<GenEntity105> findByStatus(String status);
    List<GenEntity105> findByType(String type);
    List<GenEntity105> findByIsActiveTrue();
}
