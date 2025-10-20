package main.java.Entities;

public abstract class Job {
    protected String jobName;
    protected double str;
    protected double dex;
    protected double intel;
    protected double fort;
    protected double fth;

    public Job(String jobName, double str, double dex, double fort, double fth, double intel) {
        this.jobName = jobName;
        this.str = str;
        this.dex = dex;
        this.intel = intel;
        this.fort = fort;
        this.fth = fth;
    }

    public void description() {
    }

   
    //Getters
    public String getJOBNAME() {return jobName;}
    public double getSTR() {return str;}
    public double getDEX() {return dex;}
    public double getINTEL() {return intel;}
    public double getFORT() {return fort;}
    public double getFTH() {return fth;}
}
