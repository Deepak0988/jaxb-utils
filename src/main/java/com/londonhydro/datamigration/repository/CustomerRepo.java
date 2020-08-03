package com.londonhydro.datamigration.repository;

import com.londonhydro.datamigration.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String > {
}
