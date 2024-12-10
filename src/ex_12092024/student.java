package ex_12092024;

import java.util.Stack;
public class student{
        private String Name;
        private Integer Roll_Number;

        public student(String name, Integer roll_Number) {
            Name = name;
            Roll_Number = roll_Number;

        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public Integer getRoll_Number() {
            return Roll_Number;
        }

        public void setRoll_Number(Integer roll_Number) {
            Roll_Number = roll_Number;
        }

        public void printdetails(){
            System.out.println("student name: " +  this.Name);
            System.out.println("Roll Number: " +  this.Roll_Number);
        }
    }

