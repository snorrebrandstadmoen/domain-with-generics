package no.domain;

import no.domain.id.Id;

import java.lang.reflect.Constructor;

/**
 * Describes entities. All entities should have an unique Id
 *
 * @param <T> Id-class that uniquely identifies an entity
 */
public abstract class Entity<T extends Id> {

    public final T entityId;

    @SuppressWarnings("unchecked")
    public Entity(T id) {
        try {
            Constructor constructor = id.getClass().getDeclaredConstructor(id.id.getClass());
            constructor.setAccessible(true);
            this.entityId = (T) constructor.newInstance(id.id);
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate class of type: " + id, e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Entity entity = (Entity) o;

        if (entityId != null ? !entityId.equals(entity.entityId) : entity.entityId != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return entityId != null ? entityId.hashCode() : 0;
    }
}
