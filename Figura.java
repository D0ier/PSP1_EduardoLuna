public class Figura {
    private int numA;
    private int numB;
    private int numC;

    public Figura() {
    }

    public Figura(int numA, int numB, int numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public int getNumA() {
        return numA;
    }

    public int getNumB() {
        return numB;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public String detectarFigura() {
        if (numA == 0 && numB == 0 && numC == 0
            || numA < numB && numB < numC || numA == 0) {
            return "Los valores no indican una figura";
        }

        if ((numA != 0 && numB == 0 && numC == 0)) {
            return "La figura es un circulo";
        }

        if (numA != 0 && numB != 0 && numC == 0) {
            if (numA == numB) {
                return "La figura es un cuadrado";
            }
            return "La figura es un rectangulo";
        }

        if (numA == numB && numB == numC) {
            return "La figura es un triangulo equilatero";
        }

        if (numA == numB || numB == numC || numA == numC) {
            return "La figura es un triangulo isosceles";
        }

        return "La figura es un triangulo escaleno";
    }
}