
class Lab0b {
    public static void main(String[] args) {
                                            // Прога 1
        long[] c = new long[5];                      // массив с 5 элементами
        int n = 15;                                     // самое большое нечетное число
        for (int i = 0; i < c.length; i++) {         // перебор массива
            c[i] = n;                                // массиву присваиваются нечетные числа
            System.out.printf("%5d\n",c[i]);
            n -= 2;                                     // выражение создает убывающий порядок нечетных чисел
        }
                                            // Прога 2
        int a = -6;                                     // 1 число диапазона случайных чисел
        int b = 15;                                     // 2 число диапазона случайных чисел

        double [] x = new double[17];             // создается массив с 17 ячейками
        for (int i = 0; i < x.length; i++) {      // перебор массива
            x[i] = ( Math.random() * (b-a) ) + a; // элементам массива присваивается случайное число от [а до б)
            System.out.printf("%7.2f", x[i]);
        }
                                            // Прога 3


        double [][] e = new double[5][17];              // создание двумерного массива

            for (int i = 0; i < e.length; i++) {      // заполнение первого массива
               System.out.println();                    // разделитель строк
                for (int j = 0; j < e[0].length; j++) {              // заполнение второго массива
                    if (c[i] == 7 || c[i] == 9 || c[i] == 11) {     // создание условий заполнения
                        if (c[i] == 7) {
                            double pi = Math.PI;                                        // создание переменных
                            double kub_1 = Math.pow( (pi/(x[j]-1)), 3 );                // для вычисления
                            double tan_1 = Math.tan(x[j]);                              // выражения №1
                            double kub_st_1 = Math.pow(kub_1,tan_1);
                            double result_1 = Math.pow(kub_st_1,(1.0/3.0));              // результат выражения №1
                            e[i][j] = result_1;

                            System.out.printf("%10.4f",e[i][j]);
                        }
                        if (c[i] == 9 || c[i] == 11) {
                            double e_x_2 = Math.pow(Math.E,x[j]);
                            double stepen_2 = Math.pow ( (2 * x[j]) ,x[j] );
                            double viraj_2 = Math.pow( e_x_2,(2 * stepen_2) );
                            double result_2 = Math.cos(viraj_2);
                            e[i][j] = result_2;
                            System.out.printf("%10.4f",e[i][j]);
                        }
                    }  else {
                        double sin_3 = Math.sin(x[j]);
                        double sin_st_3 = Math.pow(sin_3,2);
                        double arc_3 = Math.acos(sin_st_3);
                        double result_3 = Math.log(arc_3);
                        e[i][j] = result_3;                              // конец условий заполнения
                        System.out.printf("%10.4f",e[i][j]);
                    }

                }
            }
    }
}