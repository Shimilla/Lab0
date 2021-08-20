
class Main {
    public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Введите число больше нуля");
                return;
            }

            System.out.println("Введенное значение аргумента х : " + args[0] );

            double x;
            try {
                x = Double.parseDouble(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели строку, введите дробное число");
                return;
            }

            if (x <= 0) {
                System.out.println("Значение аргумента должно быть больше нуля");
            } else {
                double stepen = 2;
                double ln_x = Math.log(x);
                double log_x2 = (((Math.log(Math.pow(x, stepen))) / (Math.log(3))) / ln_x);
                double log_10 = Math.log10(x);
                double chislitel = ((log_x2 + log_10) * ln_x);

                double log_2x = (ln_x / Math.log(2));
                double znamenatel = Math.pow((log_2x / log_10), 2);

                double result = chislitel / znamenatel;
                System.out.println("Результат выражения = " + result);
            }
    }
}
