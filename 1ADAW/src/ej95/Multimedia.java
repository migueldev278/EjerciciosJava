package ej95;


public class Multimedia {
    
    String titulo;
    String formato;
    int duracion;
    
    public Multimedia(String titulo, String formato, int duracion){
        this.titulo = titulo;
        if (titulo.equals("mp3") || titulo.equals("wav") || titulo.equals("aac")
                || titulo.equals("mp4") || titulo.equals("mkv") || titulo.equals("mov")
                || titulo.equals("flv")) {
            this.formato = formato;
        } else {
            this.formato = "mp3";
        }
        
    }
    
    
}
