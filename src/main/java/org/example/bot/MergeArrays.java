
/*
https://stepik.org/lesson/12762/step/9?unit=3110
 */


import java.util.Arrays;

public static int[] mergeArrays(int[] a1, int[] a2) {
//    int[] arrFirst = new int[5];
//    int[] arrSecond = new int[2];
//    Arrays.sort(a1);
//    Arrays.sort(a2);

    int[] arrResult = new int[a1.length + a2.length];
    int firstArrLenght = a1.length;
    int secondArrLenght = a2.length;
    int a = 0, b = 0, c = 0;

    while (a < firstArrLenght && b < secondArrLenght) {
        if (a1[a] <= a2[b]) {
            arrResult[c] = a1[a];
            a++;
        } else {
            arrResult[c] = a2[b];
            b++;
        }
        c++;
    }
    while (a < firstArrLenght) {
        arrResult[c] = a1[a];
        a++;
        c++;
    }
    while (b < secondArrLenght) {
        arrResult[c] = a2[b];
        b++;
        c++;
    }
    return arrResult;
}

public void main() {
//    int[] a1 = {1, 10, 3, 4, 20};
//    int[] a2 = {1, 2, 3};

    int[] a1 = {3, 6, 8};
    int[] a2 = {1, 2, 3, 5, 5, 5};


    {
    }

//    int[] a1 = {1};
//    int[] a2 = {1, 2, 3};

//    int[] a1 = {};
//    int[] a2 = {1, 2, 3};

//    int[] a1 = {0, 0, 0};
//    int[] a2 = {0, 0,0, 0, 0};

    int[] result = mergeArrays2(a1, a2);
    System.out.println(Arrays.toString(result));
}

public static int[] mergeArrays2(int[] a1, int[] a2) {
//    int[] arrFirst = new int[5];
//    int[] arrSecond = new int[2];
//    Arrays.sort(a1);
//    Arrays.sort(a2);

    int[] arrResult = new int[a1.length + a2.length];

    int ia1 = 0;
    int ia2 = 0;
    for (int i = 0; i < arrResult.length; i++) {
        int result;
        if (ia1 < a1.length && ia2 < a2.length && a1[ia1] < a2[ia2]) {
            result = a1[ia1];
            ia1++;
            arrResult[i] = result;
        } else if (ia1 < a1.length && ia2 < a2.length && a2[ia2] <= a1[ia1]) {
            result = a2[ia2];
            ia2++;
            arrResult[i] = result;
        } else {
            if (ia1 < a1.length) {
                arrResult[i] = a1[ia1];
            } else {
                arrResult[i] = a2[ia2];
            }
        }
    }
//    Arrays.sort(arrResult);
    return arrResult;
}