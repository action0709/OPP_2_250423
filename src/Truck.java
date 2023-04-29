public class Truck extends MotorTransport {

      public Truck(String modelName, int whilsCount) {
        super(modelName,whilsCount);
    }
public void checkTrailer(){
    System.out.println("Проверяем прицеп");
}
    @Override
    public void doService() {
        super.doService();
        checkTrailer();
    }
}
