
/**
 * Escreva a descrição da classe Vehicle aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Vehicle
{
    // The location of this taxi.
    private String location;
    // A unique ID for this Vehicle.
    private String id;
    // The destination of this Vehicle.
    private String destination;

    /**
     * COnstrutor para objetos da classe Vehicle
     */
    public Vehicle( String base, String new_id )
    {
        this.id = new_id;
        this.location = base;
        this.destination = null;
    }
    
    /**
     * COnstrutor para objetos da classe Vehicle
     */
    public Vehicle( String new_id )
    {
        this.id = new_id;
        this.destination = null;
    }
    
     /**
     * Return the ID of the Vehicle.
     * @return The ID of the Vehicle.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Return the destination of the Vehicle.
     * @return The destination of the Vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Set the intented destination of the Vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    /**
     * Return the location of the taxi.
     * @return The location of the taxi.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Set the intented destination of the Vehicle.
     * @param destination The intended destination.
     */
    public void setLocation(String new_location)
    {
        this.location = new_location;
    }
    
    /**
     * Return the status of this Vehicle.
     * @return The status.
     */
    public String getStatus()
    {   if( destination == null )
        {
            return getID() + " at " + getLocation() + " (Free for now)";
        }
        else
        {
            return getID() + " at " + getLocation() + " headed for " +
               getDestination();
        }
    }
}
