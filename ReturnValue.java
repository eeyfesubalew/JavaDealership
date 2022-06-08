public class ReturnValue {
    public static void main(String[] args) {
        double measure1=    measureRectangle(5.3,55.3,"area");
        double measure2=  measureRectangle(5.3,5.3,"paramenter");
        System.out.println(measure1);
        System.out.println(measure2);
     }
 
     
     public static double measureRectangle(double lng, double wid,String option){
         switch(option){
            case "area":return lng*wid;
            case "paramenter": return 2*(wid*lng);
            default: return 404;
         }  
     }
}
