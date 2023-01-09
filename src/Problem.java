public class Problem {
    private String name;
    private ProblemType problemType;
    private boolean isSolved;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProblemType getProblemType() {
        return problemType;
    }

    public void setProblemType(ProblemType problemType) {
        this.problemType = problemType;
    }
    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }
}
