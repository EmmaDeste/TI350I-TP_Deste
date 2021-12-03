package main;

public class SonarQube03 {
    int calcNumbers(int start){
        int accumulator = start;
        while(accumulator < 20){
            accumulator = accumulator + start;
        }
        return accumulator;
    }
}
