/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srms;

/**
 *
 * @author Arjun Kumar
 */
public class Subjects {
    private int id = -1;
    private String branch;
    private int sem;
    private String sub1;
    private String sub2;
    private String sub3;
    private String sub4;
    private String sub5;
    
    public Subjects() {
        branch = "Default Branch";
        sem = 0;
        sub1 = "sub1";
        sub2 = "sub2";
        sub3 = "sub3";
        sub4 = "sub4";
        sub5 = "sub5";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }

    public String getSub4() {
        return sub4;
    }

    public void setSub4(String sub4) {
        this.sub4 = sub4;
    }

    public String getSub5() {
        return sub5;
    }

    public void setSub5(String sub5) {
        this.sub5 = sub5;
    }
    
    
    
}
