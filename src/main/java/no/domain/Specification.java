package no.domain;

import no.domain.id.Id;

import java.util.List;

public class Specification<T extends Id> {

    public final List<T> ids;

    protected Specification(List<T> ids) {
        this.ids = ids;
    }
}
