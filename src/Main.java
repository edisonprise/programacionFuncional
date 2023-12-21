import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        agregarPersonas(personas);
        //EjemploInicial.aproximacionImperativa(personas);
        //EjemploInicial.aproximacionDeclarativa(personas);
        //EjemploFuncionalMap.aproximacionImperativa(personas);
        EjemploFuncionalMap.aproximacionDeclarativa(personas);
    }

    public static void agregarPersonas(List<Persona> personas) {
        personas.add(new Persona(1, "Pepe", "Dorito", "pepedorito@mail.com", 30));
        personas.add(new Persona(1, "Sonia", "Blade", "SoniaBlade@mail.com", 29));
        personas.add(new Persona(1, "Walter", "White", "WalterWhite@mail.com", 18));
        personas.add(new Persona(1, "John", "Snow", "JohnSnow@mail.com", 17));
        personas.add(new Persona(1, "Jerry", "Seinfeld", "JerrySeinfeld@mail.com", 16));
        personas.add(new Persona(1, "Michael", "Scott", "MichaelScott@mail.com", 31));
        personas.add(new Persona(1, "Shaun", "Murphy", "ShaunMurphy@mail.com", 32));
        personas.add(new Persona(1, "Chandler", "Bing", "ChandlerBing@mail.com", 33));
        personas.add(new Persona(1, "Sheldon", "Cooper", "SheldonCooper@mail.com", 14));
        personas.add(new Persona(1, "Cosmo", "Kramer", "CosmoKramer@mail.com", 35));
    }
}