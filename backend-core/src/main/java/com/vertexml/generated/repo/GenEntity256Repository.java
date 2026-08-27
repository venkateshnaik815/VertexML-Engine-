package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity256;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity256Repository extends JpaRepository<GenEntity256, UUID> {
    List<GenEntity256> findByName(String name);
    List<GenEntity256> findByStatus(String status);
    List<GenEntity256> findByType(String type);
    List<GenEntity256> findByIsActiveTrue();
}
