package main.java;

class CorpoHumano {
    private float massa;
    private float volume;
    private float densidade;
    private float altura;//Adição da altura

    public CorpoHumano(float massa, float volume) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = massa / volume;
        this.altura = altura;
    }

    public float getMassa() {
        return massa;
    }

    public void setMassa(float massa) {
        this.massa = massa;
        this.densidade = massa / volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
        this.densidade = massa / volume;
    }

    public float getDensidade() {
        return densidade;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura() {
        this.altura = altura;
    }


    public float getIMC() {
        return massa / (altura * altura);
    }



}


