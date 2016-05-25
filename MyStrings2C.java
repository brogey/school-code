public class MyStrings2C {
    public static void main(String[] args) {
        String saying="You do you.";
        String stringOne, stringTwo;

        stringOne=saying.substring(0, 3);

        stringTwo=saying.substring(7, 10);

        System.out.println(stringOne);
        System.out.println(stringTwo);

        if(stringOne.equalsIgnoreCase(stringTwo)){
        	System.out.println("Correct!");
        }
        else{
        	System.out.println("Wrong!");
        }
    }
}
