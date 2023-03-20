import javax.naming.InitialContext;

public class TipeDataArray {
    public static void main(String[] args) {
        String[] iniArray;
        iniArray=new String[5];
        iniArray[0]="1";
        iniArray[1]="2";
        iniArray[2]="3";
        iniArray[3]="4";
        iniArray[4]="5";
        System.out.println(iniArray[0]);
        System.out.println(iniArray[1]);
        System.out.println(iniArray[2]);
        System.out.println(iniArray[3]);
        System.out.println(iniArray[4]);
        System.out.println(iniArray.length);
    }
}
