import java.util.Scanner;
import java.util.*;
class Employee{
  Scanner scan = new Scanner(System.in);
  String name;
  String dob;
  String empnum;
  String dpt;
  String gender;
  String position;
  float salary;
  float hsallowance;
  float travallowance;
  
  //Get and set methods
  public void setAllowances(){
    hsallowance = (float)0.5*salary;
    travallowance = (float)0.1*salary;
   
  }//end
  
  public float getHseAllowance(){
    return hsallowance;
  }
  public float getTravAllowance(){
    return travallowance;
  }
  public void setSalary(float s){
    salary = s;
  }
  public float getSalary(){
    return salary;
  }
  public void setName(String nm){
    name = nm;
  }
  public String getName(){
    return name;
  }
  
  public void setEmpNum(String num){
    empnum = num;
  }
  public String getNumber(){
    return empnum;
  }
  public String getPosition(){
    return position;
  }
  public void setPostion(String ps){
    position = ps;
  }
  public void setDpt(String dpt){
    this.dpt = dpt;
  }
  public String getDpt(){
    return dpt;
  }
  public void setDob(String db){
    dob = db;
  }
  public String getDob(){
    return dob;
  }
  public void setGender(String gd){
    gender = gd;
  }
  public String getGender(){
    return gender;
  }
  
  //General method to set Employee details
  public void setDetails(){
    System.out.println("Enter Employee name: ");
    name = scan.nextLine();
    System.out.println("Enter Employee department: ");
    dpt = scan.nextLine();
    System.out.println("Enter Employee position: ");
    position = scan.nextLine();
    System.out.println("Enter Employee gender(M/F): ");
    gender = scan.next();
    System.out.println("Enter EMpoyee number: ");
    empnum = scan.next();
    System.out.println("Enter employee salary: ");
    salary = scan.nextFloat();
    System.out.println("Enter employe date of birth(dd/mm/yyyy)");
    dob = scan.next();
  }
  public void printEmployee(){
    System.out.println(empnum+"\t"+name+"\t"+position+"\t"+dpt);
  }//End of class Employee
}  
  class Manager extends Employee{
    float medallowance;
    float officeallowance;
    
    //Method overriding
    public void setAllowances(){
      hsallowance = (float)0.5*salary;
      travallowance = (float)0.1*salary;
      medallowance = (float)0.15*salary;
      officeallowance = (float)0.2*salary;
    }
    public float getMedAllowance(){
      return medallowance;
    }
    public float getOfficAllowance(){
      return officeallowance;
    }
    public void setMedallowance( float medall){
      medallowance = medall;
    }
    public void setOfficeAllowance(float offall){
      officeallowance = offall;
    }
    
    
  }//End of class manager
  
  //Main driver class
  
  public class EmployeeMain1{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      //Creating An object of Type Employee
      /*
      Employee Emp=new Employee();
      Emp.setDetails();
      Emp.setAllwances();// Must be called after setDetails.
      printPaySlip(Emp);
      */
      /*
      //Creating An array of objects of Type Employee
      Employee myemps[]=new Employee[5];
      //Populating the employees
      for(int i=0;i<myemps.length;i++){
      myemps[i]=new Employee();
      myemps[i].setDetails();
      myemps[i].setAllwances();
      }
      //Using the data in the array to print wage bill
      printWageBill(myemps);
      */
      //Creating objects of Type Managers
      Manager Mger=new Manager();
      Mger.setDetails();
      Mger.setAllowances();
      printPSlipHead();
      printPaySlip(Mger);
      
      /*
      // creating an array of objects Type manager
      Manager Mger[]=  new Manager[5];
      //Populatingthe employees
      for(int i = 0; i<Mger.length; i++){
	Mger[i] = new Manager();
	Mger[i].setDetails();
	Mger[i].setAllowances();
	
      }//ENd of for loop
      */
      
      //printWageBill(Mger);
    
  }//End of main method
  
  //Static methods
  //Method to get employee gross pay
  
  public static float getGross(Employee E){
    return E.getSalary()+E.getHseAllowance()+E.getTravAllowance(); 
  }//End of method
  public static float getGross(Manager M){
    return M.getSalary()+M.getHseAllowance()+M.getTravAllowance()+M.getOfficAllowance()+M.getMedAllowance();
  }//End of method
  //Method to get employee tax
  public static float getTax(float gross){
    //float gross =m getGross(E);
    float tax = 0;
    if(gross <= 10000){
      tax =0;
    }
    else
    if(gross <= 25000){
      tax = 1000+(float)0.1*(gross - 10000);
    }
    else
    if(gross <= 35000){
      tax = 1500 + (float)0.2*(gross - 25000);
    }
    else
    if(gross <= 45000){
      tax = 3500 + (float)0.3*(gross - 35000);
    }
    else{
      if(gross > 45000){
	tax = 6500 + (float)0.4*(gross - 45000);
      }
    }
    return tax;
    
  }///End of tax
  //Method to print employee heading pay slip section
  public static void printPSlipHead(){
    System.out.println("Catholic University of Eastern Africa");
    System.out.println(getMonth()+"\tPay Slip\t Date :\t"+getDate() );
  }
  //Method to print Employee payslip
  public static void printPaySlip(Employee E){
    System.out.println("Employee Number"+E.getNumber()+"\tFull Name\t"+E.getName());
    System.out.println("Position\t"+E.getPosition()+"\tDepartement\t"+E.getDpt());
    System.out.println("Basic Salary\t\t"+E.getSalary());
    System.out.println("House Allowance\t\t"+E.getHseAllowance());
    System.out.println("Travelling Allowance\t\t"+E.getTravAllowance());
    System.out.println("Gross Income\t\t"+getGross(E));
    System.out.println("Paye\t\t"+getTax(getGross(E)));
    System.out.println("Net Income\t\t"+(getGross(E)-getTax(getGross(E))));
  }
  
  //Method to print manager payslip
    public static void printPaySlip(Manager M){
      System.out.println("Employee Number\t"+M.getNumber()+"\tFull Name\t"+M.getName());
      System.out.println("Position\t"+M.getPosition()+"\tDepartement\t"+M.getDpt());
      System.out.println("Basic Salary\t\t"+M.getSalary());
      System.out.println("House Allowance\t\t"+M.getHseAllowance());
      System.out.println("Travelling Allowance\t\t"+M.getTravAllowance());
      System.out.println("Medical Allowance\t\t"+M.getMedAllowance());
      System.out.println("Office Allowance\t\t"+M.getOfficAllowance());
      System.out.println("Gross Income\t\t"+getGross(M));
      System.out.println("Paye\t\t"+getTax(getGross(M)));
      System.out.println("Net Income\t\t"+(getGross(M)-getTax(getGross(M))));
  }
  //Method to print company Employee Wage bill
  public static void printWageBill(Employee []Emps){
      System.out.println("Catholic University of Eastern Africa");
      System.out.println("Employee \t"+ getMonth()+"\t Wage Bill\tDate:\t"+getDate());
      System.out.println("Employee Number\tFull Name\t Gross \tPaye\tNet");
      float sumgross=0;
      float sumtax=0;
      for(int i=0;i<Emps.length;i++){
      float net=getGross(Emps[i])-getTax(getGross(Emps[i]));
      sumgross+=getGross(Emps[i]);
      sumtax+=getTax(getGross(Emps[i]));
      System.out.println(Emps[i].getNumber()+"\t"+Emps[i].getName()+"\t"+getGross(Emps[i])+"\t"+getTax(getGross(Emps[i]))+"\t"+net);
      }
      System.out.println("\t\tTotal Gross\t"+sumgross+"Total Paye\t"+sumtax);
  }
  public static void printWageBill(Manager []Mgers){
    System.out.println("Catholic University of Eastern Africa");
    System.out.println("Employee \t"+ getMonth()+"\t Wage Bill\tDate:\t"+getDate());
    System.out.println("Employee Number\tFull Name\t Gross \tPaye\tNet");
    float sumgross=0;
    float sumtax=0;
    for(int j=0;j<Mgers.length;j++){
    float net=getGross(Mgers[j])-getTax(getGross(Mgers[j]));
    sumgross+=getGross(Mgers[j]);
    sumtax+=getTax(getGross(Mgers[j]));
    System.out.println(Mgers[j].getNumber()+"\t"+Mgers[j].getName()+"\t"+getGross(Mgers[j])+"\t"+getTax(getGross(Mgers[j]))+"\t"+net);}
    
    System.out.println("\t\tTotal Gross\t"+sumgross+"Total Paye\t"+sumtax);
  }//End of print Wagebill
  public static void printWageBill(Employee []Emps,Manager []Mgers){
    System.out.println("Catholic University of Eastern Africa");
    System.out.println("Employee \t"+ getMonth()+"\t Wage Bill\tDate:\t"+getDate());
    System.out.println("Employee Number\tFull Name\t Gross \tPaye\tNet");
    float sumgross=0;
    float sumtax=0;
    float net=0;
    for(int i=0;i<Emps.length;i++){
    net=getGross(Emps[i])-getTax(getGross(Emps[i]));
    sumgross+=getGross(Emps[i]);
    sumtax+=getTax(getGross(Emps[i]));
    System.out.println(Emps[i].getNumber()+"\t"+Emps[i].getName()+"\t"+getGross(Emps[i])+"\t"+getTax(getGross(Emps[i]))+"\t"+net);
    }
    for(int j=0;j<Mgers.length;j++){
    net=getGross(Mgers[j])-getTax(getGross(Mgers[j]));
    sumgross+=getGross(Mgers[j]);
    sumtax+=getTax(getGross(Mgers[j]));
    System.out.println(Mgers[j].getNumber()+"\t"+Mgers[j].getName()+"\t"+getGross(Mgers[j])+"\t"+getTax(getGross(Mgers[j]))+"\t"+net);
    }
    System.out.println("\t\tTotal Gross\t"+sumgross+"Total Paye\t"+sumtax);
}//End of printWageBill
  
  //Method to return current month
  public static String getMonth(){

    String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

    Date dt= new Date();
    GregorianCalendar gc=new GregorianCalendar();
    int year=gc.get(Calendar.YEAR);
    int month=gc.get(Calendar.MONTH);
    int dte=gc.get(Calendar.DATE);
    String mon=months[month];
    return mon;
  }
  // A method to Return current date
  public static String getDate(){
    Date dt= new Date();
    GregorianCalendar gc=new GregorianCalendar();
    int year=gc.get(Calendar.YEAR);
    int month=gc.get(Calendar.MONTH);
    int dte=gc.get(Calendar.DATE);
    String date=dte+"/"+month+"/"+year;
    return date;
  }
  // A method to Return time now
  public static String getTime(){
  Date dt= new Date();
  GregorianCalendar gc=new GregorianCalendar();
  int hour=gc.get(Calendar.HOUR);
  int min=gc.get(Calendar.MINUTE);
  int sec=gc.get(Calendar.SECOND);
  String tm=hour+":"+min+":"+sec;
  return tm;
  }
}// End of class EmployeeMain
  
  
  