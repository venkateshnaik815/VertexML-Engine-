package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity138;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity138Repository extends JpaRepository<GenEntity138, UUID> {
    List<GenEntity138> findByName(String name);
    List<GenEntity138> findByStatus(String status);
    List<GenEntity138> findByType(String type);
    List<GenEntity138> findByIsActiveTrue();
}
