package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity276;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity276Repository extends JpaRepository<GenEntity276, UUID> {
    List<GenEntity276> findByName(String name);
    List<GenEntity276> findByStatus(String status);
    List<GenEntity276> findByType(String type);
    List<GenEntity276> findByIsActiveTrue();
}
