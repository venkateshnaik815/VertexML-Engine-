package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity82;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity82Repository extends JpaRepository<EnterpriseBillingEntity82, UUID> {
    List<EnterpriseBillingEntity82> findByName(String name);
    List<EnterpriseBillingEntity82> findByStatus(String status);
    List<EnterpriseBillingEntity82> findByType(String type);
    List<EnterpriseBillingEntity82> findByIsActiveTrue();
}
