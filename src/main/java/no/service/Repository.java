package no.service;

import no.domain.Entity;
import no.domain.Specification;
import no.domain.id.Id;

import java.util.List;

public interface Repository<E extends Entity<T>, T extends Id, S extends Specification> {

    E get(T id);

    List<E> find(S specification);

    E save(E entity);

    void delete(T id);
}
