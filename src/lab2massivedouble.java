public class lab2massivedouble {
        //Дана матрица А[m][n]. Заменить все элементы матрицы на противоположные по знаку,
        // а затем поменять местами первый и последний столбец матрицы.
        // Отсортировать последнюю строку матрицы по убыванию.
        public static void main(String[] args) {
            int[][] array = new int[2][3];
            int temp;
            //1 2 3
            //4 5 6
            array[0][0] = 1;
            array[0][1] = 2;
            array[0][2] = 3;
            array[1][0] = 4;
            array[1][1] = 5;
            array[1][2] = 6;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[2][3] = -array[2][3];//Заменить все элементы матрицы на противоположные по знаку
                    System.out.println(-array[i][j] + "\t");
                }
                System.out.println();
            }
            int len = array[0].length;
            for (int i = 0; i < array.length; i++) {
                temp = array[i][0];
                array[i][0] = array[i][len - 1];
                array[i][len - 1] = temp;//затем поменять местами первый и последний столбец матрицы.
            }
            for (int j = 0; j < array.length; j++) {
                for (int i = 0; i < array.length; i++) {
                    if (array[1][j] < array[1][i]) {
                        int value = array[1][j];
                        array[1][j] = array[1][i];
                        array[1][i] = value;//Отсортировать последнюю строку матрицы по убыванию.
                    }
                }
            }
        }
    }


