import java.util.Scanner;

public class NotoStudentin {
    private String[] emrat;
    private byte[] notat;

    public NotoStudentin(int numriStudenteve) {
        this.emrat = new String[numriStudenteve];
        this.notat = new byte[numriStudenteve];
    }

    public void lexoEmrat() {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < this.emrat.length; ++i) {
            System.out.print("Shkruani emrin e studentit " + (i + 1) + ": ");
            this.emrat[i] = scanner.nextLine();
        }

    }

    public void lexoNotat() {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < this.notat.length; ++i) {
            String var10001 = this.emrat[i];
            System.out.print("Shkruani noten e studentit " + var10001 + ": ");
            this.notat[i] = scanner.nextByte();
        }

    }

    public void shfaqEmrat() {
        System.out.println("Emrat e studenteve:");

        for(String emri : this.emrat) {
            System.out.println(emri);
        }

    }

    public void shfaqNotat() {
        System.out.println("Notat e studenteve:");

        for(int i = 0; i < this.emrat.length; ++i) {
            String var10001 = this.emrat[i];
            System.out.println(var10001 + ": " + this.notat[i]);
        }

    }

    public void ndryshoStudentin(String emri, byte nota) {
        for(int i = 0; i < this.emrat.length; ++i) {
            if (this.emrat[i].equals(emri)) {
                this.notat[i] = nota;
                System.out.println("Nota e studentit " + emri + " u ndryshua me sukses.");
                return;
            }
        }

        System.out.println("Studenti " + emri + " nuk u gjet.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shkruani numrin e studenteve: ");
        int numriStudenteve = scanner.nextInt();
        NotoStudentin aplikacioni = new NotoStudentin(numriStudenteve);
        aplikacioni.lexoEmrat();
        aplikacioni.lexoNotat();
        aplikacioni.shfaqEmrat();
        aplikacioni.shfaqNotat();
        System.out.print("Shkruani emrin e studentit qe deshironi ta ndryshoni: ");
        String emri = scanner.next();
        System.out.print("Shkruani noten e re per studentin " + emri + ": ");
        byte nota = scanner.nextByte();
        aplikacioni.ndryshoStudentin(emri, nota);
        aplikacioni.shfaqNotat();
        scanner.close();
    }
}