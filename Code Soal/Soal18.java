public class Soal18 {
    public static void main(String[] args) {
        int angka = 0;

        if (angka > 0) {
            System.out.println("Positif");
        } else if (angka < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nol");
        }
    }
}

//Output menghasilkan "Nol"
//Karena angka nol tidak memiliki tanda (>=) / (<=)
//Maka menghasilkan output false alias "Nol"
