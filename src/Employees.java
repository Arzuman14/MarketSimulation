class Employees  {

    private String name;
    private String surname;
    private String position;


   // default constructor of the Employee class

    Employees(){}

   /**Non-Default constructor which gets values of naem, surname and position to construct an employee*/

    Employees(String name, String surname, String position){

    this.name = name;
    this.surname = surname;
    this.position = position;

    }

    /**Getters and setters of the class Employees*/
    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getSurname (){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getPosition(){
        return position;

    }

    public void setPosition(String position){
        this.position = position;
    }

    /**End of the getters and setters*/






}
