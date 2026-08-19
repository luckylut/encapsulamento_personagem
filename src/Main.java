import static java.lang.IO.*;

void main() {

    Personagem personagem = new Personagem("Guerreiro");

    println("Nome: " + personagem.getNome());
    println("Vida: " + personagem.getVida());
    println("Energia: " + personagem.getEnergia());
    println("Nivel: " + personagem.getNivel());
    println("Status: " + personagem.getStatus());

    println("\n--- ATACANDO ---");
    personagem.atacar();
    println("Energia: " + personagem.getEnergia());

    println("\n--- DESCANSANDO ---");
    personagem.descansar();
    println("Energia: " + personagem.getEnergia());

    println("\n--- RECEBENDO DANO ---");
    personagem.receberDano(50);
    println("Vida: " + personagem.getVida());
    println("Status: " + personagem.getStatus());

    println("\n--- RECEBENDO MAIS DANO ---");
    personagem.receberDano(50);
    println("Vida: " + personagem.getVida());
    println("Status: " + personagem.getStatus());
}