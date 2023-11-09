package com.campusdual.exercisespoo;

public class Cat {

  /*
   Crea una clase llamada Cat
   La clase debe tener las siguientes propiedades sin inicializar:
   - nombre (name)
   - raza (breed)
   - sexo (sex)
   - edad en meses (age) (estática)
   - tamaño del pelo (hair)
   - color del pelo (colour) (estática)
   - un booleano que indique si está castrado/a o no (castrated)I

   La clase debe tener las siguientes propiedades con los valores inicializados
   - el color de los ojos (eyeColour): "green"

   Crea un constructor que incluya todos los atributos no inicializados

   Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos

   Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque

   Crea un método no estático que pueda castrar a los gatos y otro no estático, llamado isCastrated, que devuelva su estado

   Crea un método no estático llamado catDetails() que muestre todas las características de un gato (sé original en la presentación de
   los datos, dale un poco de arte)

   Crea un main()

   Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge

   Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)

   Cámbiale el color del pelo a los dos primeros gatos

   Cámbiale el color de los ojos al último gato

   Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)

   Muestra los detalles de cada gato (fijaros qué dato muestra en la edad y el color del pelo)

   Vuelve a hacer el ejercicio en una nueva clase CatEncapsulated, aplicando la encapsulación (atributos private, ninguno estático,
   getters y setters)
   Verás cómo afecta a los métodos estáticos
 */
  //PROPIEDADES
  public String name;

  public String breed;

  public String sex;

  public static int age; //fijaos en el constructor cómo afecta que esta variable sea estática

  public String hair;

  public static String colour;

  public boolean castrated;

  public String eyeColor = "green";

  //CONSTRUCTOR
  public Cat(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
    this.name = name;
    this.breed = breed;
    this.sex = sex;
    Cat.age = age; //accedemos de forma estática --> a través de la clase, no con el this
    this.hair = hair;
    Cat.colour = colour;
    this.castrated = castrated;
  }

  //MÉTODOS

  //Crea un método estático que cambie el color del pelo y otro no estático que cambie el color de los ojos
  public static void setColour(String newColour) {
    Cat.colour = newColour;
  }

  public void setEyeColor(String newEyeColour) {
    this.eyeColor = newEyeColour;
  }

  //Crea un método estático que cambie la edad del gato y otro no estático que permita recuperar ese valor cuando se invoque
  public static void setAge(int newAge) {
    if (newAge > 0) {
      Cat.age = newAge;
    } else {
      System.out.println("No se puede poner un valor negativo como edad del gato.");
    }
  }

  public int getAge() {
    return Cat.age; //fijaos cómo afecta el hecho de que la propiedad sea estática, se accede a través de la clase
  }

  //Crea un método no estático que pueda castrar a los gatos y otro no estático, llamado isCastrated, que devuelva su estado
  public void castration(boolean castrated){
    this.castrated = castrated;
  }

  public boolean isCastrated() {
    return this.castrated;
  }

  //Crea un método no estático llamado catDetails() que muestre todas las características de un gato
  public void catDetails() {
    System.out.println("****************************************\n"
        +"**** DETALLES DEL GATO " + this.name.toUpperCase() + " ****\n"
        + "\t** Nombre: " + this.name + " **\n"
        + "\t** Raza: " + this.breed + " **\n"
        + "\t** Sexo: " + this.sex + " **\n"
        + "\t** Edad: " + this.getAge() + " **\n" //es estática y no podemos usar this, pero tenemos un método que nos lo proporciona
        + "\t** Pelo: " + this.hair + " **\n"
        + "\t** Color: " + Cat.colour + " **\n" //no podemos usar this ni tenemos un método, por tanto al ser estática usamos la clase
        + "\t** Está castrado?: " + (this.isCastrated() ? "Sí lo está :(" : "No lo está :)") + " **\n"
        + "\t** Color de ojos: " + this.eyeColor + " **\n"
        +"****************************************\n\n");
        //fijaos que va a mostrar el color del pelo y la edad de la clase original, no del objeto
  }


  //Crea un main()
  public static void main(String[] args) {

    //Crea un gato de la raza siamesa, otro de raza persa, y otro de raza esfinge
    Cat micifu = new Cat("micifú", "siamés", "macho", 12, "corto", "negro", false);
    Cat patitas = new Cat("patitas", "persa", "hembra", 36, "largo", "blanco", false);
    Cat rataPeluda = new Cat("rata peluda", "esfinge", "macho", 7, "ninguno", "gris", false);

    //Castra a los dos primeros gatos cambiando su booleano a true. Deja el otro gato sin castrar (false)
    micifu.castration(true);
    patitas.castration(true);
    rataPeluda.castration(false);

    //Cámbiale el color del pelo a los dos primeros gatos
    //micifu.setColour --> NO PODEMOS! El método es estático y hay que acceder a través de la clase
    Cat.setColour("gris"); /* No le podemos cambiar el color del pelo a ninguna instancia creada antes.
                            Le estamos cambiando el color del pelo a la clase original, no a los objetos.
                            QUÉ PASARÍA AHORA?? --> al cambiar la propiedad de la clase, desde este momento, si creásemos nuevos objetos
                            es decir, nuevas instancias o "clones", las crearía con el pelo de color gris.
                            PERO ESO NUNCA LLEGA A SUCEDER FINALMENTE, porque en este caso cuando invocamos al constructor para crear
                            nuevos gatos, le seteamos el color del pelo en los parámetros*/


    //Cámbiale el color de los ojos al último gato
    rataPeluda.setEyeColor("azules");

    //Cambia la edad del último gato. Intenta ponerle un valor negativo (su setter debe hacer la comprobación)
    //rataPeluda.setAge(-2) --> de nuevo no podemos. El método es estático. Se lo cambiaríamos a la clase, no al objeto.
    Cat.setAge(-2);
    Cat.setAge(36);

    //Muestra los detalles de cada gato
    micifu.catDetails();
    patitas.catDetails();
    rataPeluda.catDetails();
  }
}
