/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Helper 
{
    private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        taxiCo1 = new TaxiCo("IMD's cars");
        taxiCo1.addTaxi();
        taxiCo1.addTaxi();
        taxiCo1.addShuttle();
    }

    /**
     * Test whether we can book a taxi.
     */
    public void testBook()
    {
        setUp();
        Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");       
        taxi1.book("HIPER");
        if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {           
            System.out.println("Funcionou");
        } else { 
            System.out.println("Alguma coisa errada");
        }
    }
    /**
     * Test if there are some vehicle that could go to Canterburry East
     */
    public void testFoundFree(){
        taxiCo1 = new TaxiCo("Test cars!");
        taxiCo1.addShuttle();
        taxiCo1.addShuttle();
        taxiCo1.addTaxi();
        taxiCo1.addTaxi();
        taxiCo1.addShuttle();
        taxiCo1.addShuttle();
        Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #3"); 
        taxi1.book("Herne Bay");
        taxiCo1.showStatus();
        //Trying to find a bus with destination of Canterbury East or Taxi without destination
        //I will show status to compare if have something
        Vehicle test = taxiCo1.nextDestination("Canterbury East");

        System.out.println("Trying to found any vehicle that could go to Canterbury East");
        if( test instanceof Shuttle ){
            if("Canterbury East".equalsIgnoreCase(test.getDestination() ) ){
                System.out.println( test.getStatus() );
            }
        }else if( test instanceof Taxi ){
            if(test.getDestination() == null ){
                System.out.println( test.getStatus() );
            }
        }else{
            System.out.println("No one available");
        }

    }
    /**
     * Test the status of a taxi after it has arrived.
     */
    public void testArrived()
    {
        Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
        taxi1.book("HIPER");
        taxi1.arrived();
        if ( taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation()) ) {
            System.out.println("Funcionou");
        } else { 
            System.out.println("Alguma coisa errada");
        }
    }

    public static void main(String[] args) {
        Helper helper = new Helper();
        System.out.println("Primeiro teste");
        helper.testBook();
        
        System.out.println("Segundo teste");
        helper.testArrived();

        System.out.println();
        System.out.println("Terceiro teste");
        helper.testFoundFree();
    }
}


