package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity55;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity55Repository extends JpaRepository<GenEntity55, UUID> {
    List<GenEntity55> findByName(String name);
    List<GenEntity55> findByStatus(String status);
    List<GenEntity55> findByType(String type);
    List<GenEntity55> findByIsActiveTrue();
}
