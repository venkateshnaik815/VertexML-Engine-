package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity86;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity86Repository extends JpaRepository<GenEntity86, UUID> {
    List<GenEntity86> findByName(String name);
    List<GenEntity86> findByStatus(String status);
    List<GenEntity86> findByType(String type);
    List<GenEntity86> findByIsActiveTrue();
}
