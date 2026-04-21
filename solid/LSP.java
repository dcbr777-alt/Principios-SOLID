class Personaje {
    public int atacar() {
        return 10;
    }
}

class Guerrero extends Personaje {
    public int atacar() {
        return 20;
    }
}

class Mago extends Personaje {
    public int atacar() {
        return 15;
    }
}
