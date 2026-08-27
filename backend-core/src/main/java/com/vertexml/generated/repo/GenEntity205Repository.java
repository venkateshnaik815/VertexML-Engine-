package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity205;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity205Repository extends JpaRepository<GenEntity205, UUID> {
    List<GenEntity205> findByName(String name);
    List<GenEntity205> findByStatus(String status);
    List<GenEntity205> findByType(String type);
    List<GenEntity205> findByIsActiveTrue();
}
