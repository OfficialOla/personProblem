import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<Problem> problems;

    public String tellProblem(){
        String ourProblem = "";
        for (Problem problem: problems) {
            if (!problem.isSolved()){
                ourProblem +=problem.getName()+"\n";
            }

        }
        return ourProblem;
    }
}
