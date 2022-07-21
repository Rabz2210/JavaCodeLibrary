package com.EqualsAndHashCode;

public class Student {
 
    private int rollNo;
    private String Name;

    Student(int rollNo,String Name){
        
        this.rollNo = rollNo;
        this.Name = Name;
    }

    /**
     * @return int return the rollNo
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     * @param rollNo the rollNo to set
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * @return String return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }


    @Override
    public boolean equals(Object obj) {
        if(getClass()!=obj.getClass())return false;
        if(obj==this)return true;
        Student s = (Student)obj;
        if(s.getRollNo()==this.getRollNo())return true;
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return this.rollNo;
    }

}
