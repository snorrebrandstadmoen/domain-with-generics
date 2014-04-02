package no.service;

import no.domain.Entity;
import no.domain.Specification;
import no.domain.id.Id;

import java.util.List;

public interface Repository<E extends Entity<I>, I extends Id, S extends Specification<E>> {

    E get(I id);

    List<E> find(S specification);

    E save(E entity);

    void delete(I id);
}
