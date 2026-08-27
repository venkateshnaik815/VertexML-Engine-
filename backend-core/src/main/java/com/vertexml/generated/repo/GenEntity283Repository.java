package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity283;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity283Repository extends JpaRepository<GenEntity283, UUID> {
    List<GenEntity283> findByName(String name);
    List<GenEntity283> findByStatus(String status);
    List<GenEntity283> findByType(String type);
    List<GenEntity283> findByIsActiveTrue();
}
