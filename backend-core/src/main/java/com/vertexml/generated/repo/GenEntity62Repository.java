package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity62;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity62Repository extends JpaRepository<GenEntity62, UUID> {
    List<GenEntity62> findByName(String name);
    List<GenEntity62> findByStatus(String status);
    List<GenEntity62> findByType(String type);
    List<GenEntity62> findByIsActiveTrue();
}
