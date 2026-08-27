package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity236;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity236Repository extends JpaRepository<GenEntity236, UUID> {
    List<GenEntity236> findByName(String name);
    List<GenEntity236> findByStatus(String status);
    List<GenEntity236> findByType(String type);
    List<GenEntity236> findByIsActiveTrue();
}
