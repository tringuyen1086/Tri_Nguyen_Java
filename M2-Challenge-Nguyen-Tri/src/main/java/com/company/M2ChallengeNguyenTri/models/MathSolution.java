package com.company.M2ChallengeNguyenTri.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class MathSolution {
    @NotNull(message = "Please enter a number.")
    @Min(1)
    private int operand1;

    @NotNull(message = "Please enter a number.")
    @Min(1)
    private int operand2;

    private String operation;
    private int answer;

    public MathSolution(){

    }

    public MathSolution(int operand1, int operand2, String operation, int answer) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.answer = answer;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer() {
        switch(this.operation){
            case "add":
                this.answer = this.operand1 + this.operand2;
                break;
            case "subtract":
                this.answer = this.operand1 - this.operand2;
                break;
            case "multiply":
                this.answer = this.operand1 * this.operand2;
                break;
            case "divide":
                this.answer = this.operand1 / this.operand2;
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathSolution that = (MathSolution) o;
        return operand1 == that.operand1 && operand2 == that.operand2 && answer == that.answer && Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, answer);
    }

    @Override
    public String toString() {
        return "MathSolution{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operation='" + operation + '\'' +
                ", answer=" + answer +
                '}';
    }
}
