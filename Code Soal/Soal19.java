public class Soal19 {
    public static void main(String[] args) {
        int umur = 17;

        if (umur > 17) {
            System.out.println("Dewasa");
        } else {
            System.out.println("Belum Dewasa");
        }
    }
}

//Output menghasilkan "Belum dewasa"
//Karena output memutuskan bahwa umur tersebut setara dan terhitung kurang, maka harus menambahkan (>=) agar bernilai true