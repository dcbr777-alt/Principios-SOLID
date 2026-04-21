// ISP - Interfaces separadas

interface ICombatable {
    void atacar();
    void recibirDano();
}

interface IMovible {
    void mover();
}

interface IPersistible {
    void guardar();
}

interface IVisible {
    void mostrar();
}
