import static java.lang.IO.*;

public class Personagem {

    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.energia = 100;
        this.nivel = 1;
    }

    public void receberDano(int dano) {
        vida = vida - dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void descansar() {
        energia = energia + 20;

        if (energia > 100) {
            energia = 100;
        }
    }

    public void atacar() {
        if (energia >= 20) {
            energia = energia - 20;
            println(nome + " atacou!");
        } else {
            println("Sem energia para atacar!");
        }
    }

    public String getStatus() {
        if (vida > 0) {
            return "Vivo";
        } else {
            return "Derrotado";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }
}