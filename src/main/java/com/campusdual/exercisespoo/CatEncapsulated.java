package com.campusdual.exercisespoo;

public class CatEncapsulated {

  /* Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático,
   getters y setters). Verás cómo afecta a los métodos estáticos. */
  //PROPIEDADES
  //Todas private, niguno estático
  private String name;

  private String breed;

  private String sex;

  private int age; //antes estaba estático, ahora no

  private String hair;

  private String colour; //antes estaba estático, ahora no

  private boolean castrated;

  private String eyeColor = "green";

  //CONSTRUCTOR
  public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
    this.name = name;
    this.breed = breed;
    this.sex = sex;
    this.age = age; //ahora accedemos con el this
    this.hair = hair;
    this.colour = colour; //ahora accedemos con el this
    this.castrated = castrated;
  }

  //GETTERS Y SETTERS
  //Ninguno estático

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int newAge) {
    if (newAge > 0) {
      this.age = newAge;
    } else {
      System.out.println("No se puede poner un valor negativo como edad del gato.");
    }
  }

  public String getHair() {
    return this.hair;
  }

  public void setHair(String hair) {
    this.hair = hair;
  }

  public String getColour() {
    return this.colour;
  }

  public void setColour(String newColour) {
    this.colour = newColour;
  }

  public String getEyeColor() {
    return eyeColor;
  }

  public void setEyeColor(String newEyeColour) {
    this.eyeColor = newEyeColour;
  }

  public boolean isCastrated() {
    return this.castrated;
  }

  public void setCastrated(boolean castrated) {
    this.castrated = castrated;
  }


  //METODOS
  public void castration() {
    this.castrated = true; //habiendo ya un setter, este método no tiene sentido. Se debe modificar a través del setter
  }

  public void catDetails() { //usando siempre los getters
    System.out.println("****************************************\n"
        + "**** DETALLES DEL GATO " + this.getName().toUpperCase() + " ****\n"
        + "\t** Nombre: " + this.getName() + " **\n"
        + "\t** Raza: " + this.getBreed() + " **\n"
        + "\t** Sexo: " + this.getSex() + " **\n"
        + "\t** Edad: " + this.getAge() + " **\n"
        + "\t** Pelo: " + this.getHair() + " **\n"
        + "\t** Color: " + this.getColour() + " **\n"
        + "\t** Está castrado?: " + this.isCastrated() + " **\n"
        + "\t** Color de ojos: " + this.getEyeColor() + " **\n"
        + "****************************************\n\n");
  }

  //main()
  public static void main(String[] args) {

    //Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge
    CatEncapsulated micifu = new CatEncapsulated("micifú", "siamés", "macho", 12, "corto", "negro", false);
    CatEncapsulated patitas = new CatEncapsulated("patitas", "persa", "hembra", 36, "largo", "blanco", false);
    CatEncapsulated rataPeluda = new CatEncapsulated("rata peluda", "esfinge", "macho", 7, "ninguno", "gris", false);

    //Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)
    micifu.setCastrated(true);
    patitas.setCastrated(true);
    rataPeluda.setCastrated(false);

    //Cámbiale el color del pelo a los dos primeros gatos
    micifu.setColour("marrón");
    patitas.setColour("azul");

    //Cámbiale el color de los ojos al último gato
    rataPeluda.setEyeColor("azules");

    //Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)
    rataPeluda.setAge(-2);
    rataPeluda.setAge(36);

    //Muestra los detalles de cada gato
    micifu.catDetails();
    patitas.catDetails();
    rataPeluda.catDetails();
  }
}
