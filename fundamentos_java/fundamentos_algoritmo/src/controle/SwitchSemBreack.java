package controle;

public class SwitchSemBreack {

    public static void main(String[] args) {
        String faixa = "laranja";
        switch (faixa) {
            case "preta":
                System.out.println("Sei o bassai-dai");
            case "marrom":
                System.out.println("Sei o Tekki shodan");
            case "roxa":
                System.out.println("Sei o godan");
            case "verde":
                System.out.println("Sei o yodan");
            case "laranja":
                System.out.println("Sei o sandan");
            case "vermelha":
                System.out.println("Sei o Nidan");
            case "amarela":
                System.out.println("Sei o Heian shodan");
            // default:
            // System.out.println("sei nada");
        }
    }
}
