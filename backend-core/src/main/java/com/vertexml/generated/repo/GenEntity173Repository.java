package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity173;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity173Repository extends JpaRepository<GenEntity173, UUID> {
    List<GenEntity173> findByName(String name);
    List<GenEntity173> findByStatus(String status);
    List<GenEntity173> findByType(String type);
    List<GenEntity173> findByIsActiveTrue();
}
