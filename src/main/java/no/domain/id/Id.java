package no.domain.id;

import org.apache.commons.lang.Validate;

/**
 * Id base class for Entity Ids. Includes simple validation
 *
 * @param <T> Actual implementation of an Id
 */
public abstract class Id<T> {

    public final T id;

    protected Id(T id) {
        Validate.notNull(id, "Id must be specified");
        Validate.isTrue(validateId(id), "Id has wrong format: " + id.toString());
        this.id = id;
    }

    /**
     * Method which validates the Id
     *
     * @param id Id that should be validated
     */
    protected abstract boolean validateId(T id);

    @Override
    public String toString() {
        return "Id{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if(o instanceof Id) {
            final Id id1 = (Id) o;
            if (id != null ? !id.equals(id1.id) : id1.id != null) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
