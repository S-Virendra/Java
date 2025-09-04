public class RRider {

      public interface Rider {
        void start();    
      }
      class Truck implements Rider{
        public void start(){
          System.out.println("Rider with truck");
        }
      }
      class Car implements  Rider{
        public void start(){
          System.out.println("Rider with Car");
        }
      }

    public static void main(String[] args) {
       RRider outer = new RRider();
       Rider truckRider = outer.new Truck();
        truckRider.start();



        
    }
    
}
