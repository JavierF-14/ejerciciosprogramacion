// ==========================
// Ejemplo de HERENCIA
// ==========================
class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido.");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }


    public void hacerSonido() {
        System.out.println(nombre + " ladra: ¡Guau guau!");
    }
}

// ==========================
// Ejemplo de ENCAPSULAMIENTO
// ==========================
class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }
}

// ==========================
// Ejemplo de POLIMORFISMO
// ==========================
class Figura {
    public double calcularArea() {
        return 0;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }


    public double calcularArea() {
        return ancho * alto;
    }
}

// ==========================
// Ejemplo de ABSTRACCIÓN
// ==========================
abstract class Vehiculo {
    String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }


    public abstract void conducir();
}

class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }


    public void conducir() {
        System.out.println("Conduciendo un coche de marca " + marca);
    }
}

// ==========================
// Ejemplo de RECORDS
// ==========================
record Persona(String nombre, int edad) {

}


public class Main {
    public static void main(String[] args) {

        // Herencia
        Animal a = new Animal("Animal genérico");
        a.hacerSonido();
        Perro p = new Perro("Tommy");
        p.hacerSonido();

        // Encapsulamiento
        CuentaBancaria cuenta = new CuentaBancaria(10000);
        cuenta.depositar(5500);
        cuenta.retirar(2100);
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        // Polimorfismo
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 6);
        System.out.println("Área del círculo: " + f1.calcularArea());
        System.out.println("Área del rectángulo: " + f2.calcularArea());

        // Abstracción
        Vehiculo coche = new Coche("mclaren");
        coche.conducir();

        // Records
        Persona persona = new Persona("Javier", 22);
        System.out.println(persona);
        System.out.println("Nombre: " + persona.nombre() + ", Edad: " + persona.edad());
    }
}
