
public class Program {
    public static void main(String[] args) {
        float a = 89.148f;
        float b = 54.68f;
        float c = 30.4618f;

        System.out.printf("%.4f\n", a);
        System.out.printf("%.4f\n", b);
        System.out.printf("%.4f\n", c);

        System.out.printf("\n");

        if (a > b) {
            if (a > c) {
                System.out.printf("%.4f\n\n", a);
            }
        }

        System.out.println(calculate(a));
        System.out.println(calculate(b));
        System.out.println(calculate(c));

        System.out.printf("\n");

        int hariIndex = 3;

        switch (hariIndex) {
            case 1:
                System.out.println("Senin");
                break;

            case 2:
                System.out.println("Selasa");
                break;

            case 3:
                System.out.println("Rabu");
                break;

            case 4:
                System.out.println("Kamis");
                break;

            case 5:
                System.out.println("Jumat");
                break;

            case 6:
                System.out.println("Sabtu");
                break;

            case 7:
                System.out.println("Minggu");
                break;

            default:
                break;
        }

        System.out.printf("\n");
        System.out.printf("For loop\n");

        for (int i = 1; i <= 25; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("While loop\n");

        int j = 1;

        while (j <= 25) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }

            j++;
        }

        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("Do while loop\n");

        int k = 1;

        do {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }

            k++;
        } while (k <= 25);

        System.out.printf("\n\n");
        // System.out.printf("%f", a);

        String buah[] = { "Apel", "Khuldi", "Anggur", "Nanas", "Jeruk" };

        System.out.printf("%s %s\n\n", buah[1], buah[3]);

        buah[1] = "Lemon";
        buah[3] = "Sirsak";

        System.out.printf("%s %s\n\n", buah[1], buah[3]);
        for (int i = 0; i < buah.length; i++) {
            System.out.printf("%s\n", buah[i]);
        }
        System.out.printf("\n\n");

        int matrix[][] = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        for (int o = 0; o < matrix.length; o++) {
            System.out.printf("%d %d %d %d\n", matrix[o][0],matrix[o][1],matrix[o][2], matrix[o][3]);
        }
    }

    public static char calculate(float a) {
        if (a > 79) {
            return 'A';
        } else if (a > 69) {
            return 'B';
        } else {
            return 'C';
        }
    }
}
