public class MyAnimal {
    public static void main(String[]args){
    	Animal zebra=new Animal("Africa","Mammal","Hebivore",4,0);
    	Animal tiger=new Animal("Asia","Mammal","Carnivore",4,0);

		System.out.println("Animal: Zebra");
    	System.out.println("From: "+zebra.getWhereFrom());
    	System.out.println("Type: "+zebra.getType());
    	System.out.println("Diet: "+zebra.getDiet());
    	System.out.println("Legs: "+zebra.getLegs());
    	System.out.println("Arms: "+zebra.getArms());

    	System.out.println("Animal: Tiger");
    	System.out.println("From: "+tiger.getWhereFrom());
    	System.out.println("Type: "+tiger.getType());
    	System.out.println("Diet: "+tiger.getDiet());
    	System.out.println("Legs: "+tiger.getLegs());
    	System.out.println("Arms: "+tiger.getArms());

    	System.out.println(zebra);
    }
}