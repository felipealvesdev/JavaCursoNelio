package exercicioFixMap.entities;

import java.util.Objects;

public class BallotBox {
    private String name;
    private int numberOfVotes;

    public BallotBox(String name, int numberOfVotes) {
        this.name = name;
        this.numberOfVotes = numberOfVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallotBox ballotBox = (BallotBox) o;
        return numberOfVotes == ballotBox.numberOfVotes && Objects.equals(name, ballotBox.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfVotes);
    }
}
