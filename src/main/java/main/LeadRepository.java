package main;

import org.springframework.data.repository.CrudRepository;

public interface LeadRepository extends CrudRepository<Lead,Integer> {
}
