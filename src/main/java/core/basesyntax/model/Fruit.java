package core.basesyntax.model;

import java.util.Objects;

public final class Fruit {
    private final String name;
    private long amount;

    public Fruit(String fruitName, long amount) {
        this.name = fruitName;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fruit fruit = (Fruit) o;
        return amount == fruit.amount && Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    public String getName() {
        return name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
