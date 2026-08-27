package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity37;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity37Repository extends JpaRepository<GenEntity37, UUID> {
    List<GenEntity37> findByName(String name);
    List<GenEntity37> findByStatus(String status);
    List<GenEntity37> findByType(String type);
    List<GenEntity37> findByIsActiveTrue();
}
