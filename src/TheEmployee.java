public class TheEmployee {
    int id;
    String fname;
    String lname;
    int saraly;
    TheEmployee(int id, String f, String l, int s) {
        fname = f;
        lname = l;
        saraly = s;
    }
    int getId(){
        return id;
    }
    String getFame(){
        return fname;
    }
    String getlname(){
        return lname;
    }
    String getName (){
        return lname + " "+ fname ;
    }
    int getSaraly(){
        return saraly ;
    }
    void setSaraly(int s){
        this.saraly = saraly;
    }
    int getAnnualSaraly(){
        return saraly*12;
    }
    int raiseSalary(int percentage){
        return saraly*percentage;
    }

}

