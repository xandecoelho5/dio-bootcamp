package one.digitalinnovation.model;

import java.util.Objects;

public class Obj extends TreeObject<Obj> {

    Integer value;

    public Obj(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Obj obj = (Obj) o;

        return Objects.equals(value, obj.value);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public int compareTo(Obj outro) {
        return this.value - outro.value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
