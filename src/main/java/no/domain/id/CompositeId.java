package no.domain.id;

/**
 * Id which consists of 2 keys which together represent an unique id
 * @param <T> Key 1
 * @param <E> Key 2
 */
public class CompositeId<T, E> {

    public final T id1;
    public final E id2;

    public CompositeId(T id1, E id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    @Override
    public String toString() {
        return "CompositeId{" +
                "id1=" + id1 +
                ", id2=" + id2 +
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
        if (o instanceof CompositeId) {
            CompositeId that = (CompositeId) o;
            if (id1 != null ? !id1.equals(that.id1) : that.id1 != null) {
                return false;
            }
            if (id2 != null ? !id2.equals(that.id2) : that.id2 != null) {
                return false;
            }
        } else {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id1 != null ? id1.hashCode() : 0;
        result = 31 * result + (id2 != null ? id2.hashCode() : 0);
        return result;
    }
}
