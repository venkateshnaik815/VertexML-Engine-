package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity194;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity194Repository extends JpaRepository<GenEntity194, UUID> {
    List<GenEntity194> findByName(String name);
    List<GenEntity194> findByStatus(String status);
    List<GenEntity194> findByType(String type);
    List<GenEntity194> findByIsActiveTrue();
}
