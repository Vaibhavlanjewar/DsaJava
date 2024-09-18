package J29QuizConsole;
import J29QuizConsole.*;
public class Question {
    private int id;
    private String questions;
    private String op1;
    private String op2;
    private String op3;
    private String op4;

    private String answer;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestions() {
        return questions;
    }
    public void setQuestions(String questions) {
        this.questions = questions;
    }
    public String getOp1() {
        return op1;
    }
    public void setOp1(String op1) {
        this.op1 = op1;
    }
    public String getOp2() {
        return op2;
    }
    public void setOp2(String op2) {
        this.op2 = op2;
    }
    public String getOp3() {
        return op3;
    }
    public void setOp3(String op3) {
        this.op3 = op3;
    }
    public String getOp4() {
        return op4;
    }    
    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
