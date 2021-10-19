package agh.ics.oop;
import static java.lang.System.out;
public class World {
    public static Direction[] change(String[] lista){
        Direction tab[]=new Direction[lista.length];
        for (int i=0;i< lista.length;i++){
            String zmienna=lista[i];
            Direction nana=switch(zmienna){
                case "f" -> tab[i]=Direction.FORWARD;
                case "b" -> tab[i]=Direction.BACKWARD;
                case "r" -> tab[i]=Direction.RIGHT;
                case "l" -> tab[i]=Direction.LEFT;
                default -> tab[i]=Direction.FORWARD;
            };
        }
        return tab;
    }
    public static void run(Direction[] lista){
        out.println("Start");
        for (Direction i:lista) {
            switch (i) {
                case FORWARD -> out.println("zwierzak idzie do przodu");
                case BACKWARD -> out.println("zwierzak idzie do tyłu");
                case LEFT -> out.println("zwierzak skręca w lewo");
                case RIGHT -> out.println("zwierzak skręca w prawo");
            }
        }
    }
    public static void main(String[] args) {
        String[] lista={"f","l","r"};
        run(change(lista));
    }
}
