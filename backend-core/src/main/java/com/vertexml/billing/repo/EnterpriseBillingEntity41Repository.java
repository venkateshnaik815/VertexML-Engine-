package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity41;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity41Repository extends JpaRepository<EnterpriseBillingEntity41, UUID> {
    List<EnterpriseBillingEntity41> findByName(String name);
    List<EnterpriseBillingEntity41> findByStatus(String status);
    List<EnterpriseBillingEntity41> findByType(String type);
    List<EnterpriseBillingEntity41> findByIsActiveTrue();
}
