package p2assignment4;

public class P2Assignment4 {

    public static void main(String[] args) {
        Sellable[] s = new Sellable[2];
        s[0] = new Car(4,"abc",12000);
        s[1] = new Car(6,"xyz",30000);
        
        if(s[0].equals(s[1])){
            System.out.println("The 2 cars are equal");
        }else{
            System.out.println("The 2 cars are not equal");
        }
        
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].toString());
        }
    }
    
}
