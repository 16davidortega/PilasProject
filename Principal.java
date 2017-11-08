
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
   public static void main(String[] args) {
       pilas p = new pilas();
       p.push(2);
       p.push(8);
       p.push(1);
       
       p.peek();
       p.cima();
       p.pop();
       p.peek();
       p.pop();
       p.cima();
       p.pop();
       p.peek();
    }
}
