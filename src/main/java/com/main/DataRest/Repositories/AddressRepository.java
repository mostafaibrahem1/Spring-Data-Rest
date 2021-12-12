package com.main.DataRest.Repositories;

import com.main.DataRest.Models.Address;
import com.main.DataRest.Models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
