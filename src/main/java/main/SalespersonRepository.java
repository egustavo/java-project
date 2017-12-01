package main;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalespersonRepository extends CrudRepository<Salesperson,Integer> {
}
