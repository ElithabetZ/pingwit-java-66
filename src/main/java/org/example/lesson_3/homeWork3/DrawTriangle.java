package org.example.lesson_3.homeWork3;
/*
Нарисуйте оставшиеся 2 треугольника.
Опционально: можете нарисовать все 4 фигуры, чтобы у вас получился ромб
   *  (1)
  **
 ***
****

****  (2)
 ***
  **
   *
 */
//примерно так я смотрю на это - https://www.youtube.com/watch?v=HHnrF2TxsZY )))
//но ок, + 
public class DrawTriangle {
    public static void main(String[] args) {
        int maxTriangle = 13;
        int r = 0;
        int iteration1 = maxTriangle / 2;
        int hight = iteration1 + 1;

        for (int i = 1; i <= hight; i++) {
            String code = "";
            for (int k = 1; k <= iteration1; k++) {
                code += " ";
            }
            for (int t = 1; t <= (maxTriangle - iteration1 * 2); t++) {
                code += "*";
            }
            System.out.println(code);
            iteration1--;
        }

        maxTriangle = maxTriangle - 2;
        iteration1 = maxTriangle / 2;
        hight = iteration1 + 1;
        int q = iteration1;

        for (int i = 1; i <= hight; i++) {
            String code = " ";
            for (int k = 1; k <= (iteration1 - q); k++) {
                code += " ";
            }
            for (int t = 1; t <= (maxTriangle - r * 2); t++) {
                code += "*";
            }
            System.out.println(code);
            r++;
            q--;
        }

    }
}

