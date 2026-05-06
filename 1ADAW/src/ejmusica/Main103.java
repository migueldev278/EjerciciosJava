package ejmusica;

public class Main103 {
    public static void main(String[] args) {

        // === APARTADO A y B: Nota y Partitura ===
        System.out.println("=== PARTITURA ===");
        Partitura p = new Partitura("Para Elisa", "LVB");
        p.addNota(new Nota("mi", 1));
        p.addNota(new Nota("re", 1));
        p.addNota(new Nota("mi", 1));
        p.addNota(new Nota("re", 1));
        p.addNota(new Nota("mi", 1));
        p.addNota(new Nota("si", 1));
        p.addNota(new Nota("re", 1));
        p.addNota(new Nota("do", 1));
        p.addNota(new Nota("la", 1));
        p.addNota(new Nota("la", 1));
        p.addNota(new Nota("do", 1));
        p.addNota(new Nota("mi", 1));
        System.out.println(p.toString());

        // === APARTADO E: Piano ===
        System.out.println("=== PIANO ===");
        Piano piano = new Piano("Yamaha", 3, 2020, p, 88, "cola");
        piano.afinar();
        System.out.println(piano.tocarPartitura());

        // === APARTADO F: Flauta ===
        System.out.println("=== FLAUTA ===");
        Flauta flauta = new Flauta("Gemeinhardt", 5, 2019, p, "travesera", "metal");
        flauta.afinar();
        System.out.println(flauta.tocarPartitura());

        // === APARTADO G: Bongos ===
        System.out.println("=== BONGOS ===");
        Bongos bongos = new Bongos("Latin Percussion", 1, 2021, p, 2, "natural"); // 2 cajas invalido, pondra 3
        bongos.afinar();
        System.out.println(bongos.tocarPartitura());

        // === Instrumento con partitura aleatoria ===
        System.out.println("=== PIANO CON PARTITURA ALEATORIA ===");
        Piano pianoRandom = new Piano("Kawai", 6, 2022, 73, "pared");
        System.out.println("Notas generadas: " + pianoRandom.partitura.numNotas());
        pianoRandom.pararDeTocar();
    }
}
