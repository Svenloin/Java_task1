class Case1
{
    // Решения задачи №1
    /*
        Передаем в функцию два числа и возвращаем число - остаток от деления
    */
    static int remainder(int num1, int num2){
        return num1 % num2;
    }
    static void task1(){
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
    }


    // Решения задачи №2
    /*
        Передаем в функцию два числа, высоту и площадь и возвращаем площадь треугольника
    */
    static double triArea(int num1, int num2){
        return 0.5*num1*num2;
    }
    static void task2(){
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
    }


    // Решения задачи №3
    /*
        Передаем в функцию 3 числа и возвращаем число - кол-во ног домашнего скота
    */
    static int animals(int num1, int num2, int num3){
        return num1*2+(num2+num3)*4;
    }
    static void task3(){
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));
    }


    // Решения задачи №4
    /*
        Передаем в функцию 3 числа и возвращаем булевое значение от prob*prize>pay - false/true
    */
    static boolean profitableGamble(double prob, int prize, int pay){
        return prob*prize>pay;
    }
    static void task4(){
        System.out.println(profitableGamble(2, 3, 5));
        System.out.println(profitableGamble(1, 2, 3));
        System.out.println(profitableGamble(5, 2, 8));
    }


    // Решения задачи №5
    /*
        Передаем в функцию 3 числа и возвращем слово - что надо сделать с переменными a, b чтобы получить N
        Сложить, умножить и тд
    */
    static String operation(int N, int a, int b){
        if (a + b == N) {
            return "added";
        }
        if (a - b == N) {
            return "subtracted";
        }
        if (a * b == N) {
            return "multiplication";
        }
        if (a / b == N) {
            return "division";
        }
        else{
            return "None";
        }
    }
    static void task5(){
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
    }


    // Решение задачи №6
    /*
        Передаем символ в функцию и переводим его в int значение - ASCII код числа
    */
    static int ctoa(char symbol){
        return (int)symbol;
    }
    static void task6(){
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));
    }


    // Решение задачи 7
    /*
        Передаем в функцию число
        Создаем переменную count - в нее складываем все числа от 1 до переданного числа
        Возвращаем переменную count
    */
    static int addUpTo(int num){
        Integer count = 0;
        for (int i=1; i<=num; i++) {
            count+=i;
        }

        return count;
    }
    static void task7(){
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
    }


    // Решение задачи 8
    /*
        Передаем в функцию 3 числа и возвращаем число - третья сторона ребра, по формуле
    */
    static int nextEdge(int num1, int num2){
        return num1 + num2 - 1;
    }
    static void task8(){
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
    }


    // Решение задачи 9
    /*
        Создаем массивы и передаем их в функцию
        Создаем переменную count - в нее будет записываться сумма элементов, где каждый элемент возводится в куб
        Переданный массив прогоняем по элементно с помощью цикла
        Каждый элемент массива возводим в куб и прибавляем к переменной count
    */
    static int sumOfCubes(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            count += Math.pow(arr[i], 3);
        }
        return count;
    }
    static void task9(){
        int arr1[] = { 1, 5, 9 };
        System.out.println(sumOfCubes(arr1));
        int arr2[] = { 3, 4, 5 };
        System.out.println(sumOfCubes(arr2));
        int arr3[] = { 2 };
        System.out.println(sumOfCubes(arr3));
        int[] arr4 = new int[10];
        System.out.println(sumOfCubes(arr4));
    }


    // Решение задачи 10
    /*
        Передаем в функцию 3 числа
        a - число для сложения
        b - число, кол-во сложений числа a
        c - число для определения возврата булевого значения, если сумма сложений делится на c

        создаем переменную count и записываем в нее переменную a
        с помощью цикла прибавляем к переменной count сложенное число a (42+42 = 84 .... 84+84 = 168 и тд)
        проверяем делится ли полученное значение на переменную c
        Если да, то возвращаем true
        иначе false
    */
    static boolean abcmath(int a, int b, int c){
        int count = a;
        for (int i = 0; i < b; i++){
            count = count + count;
        }
        if (count % 10 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
    static void task10(){
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }

    public static void main(String args[])
    {
        System.out.println("Ex 1");
        task1();
        System.out.println("Ex 2");
        task2();
        System.out.println("Ex 3");
        task3();
        System.out.println("Ex 4");
        task4();
        System.out.println("Ex 5");
        task5();
        System.out.println("Ex 6");
        task6();
        System.out.println("Ex 7");
        task7();
        System.out.println("Ex 8");
        task8();
        System.out.println("Ex 9");
        task9();
        System.out.println("Ex 10");
        task10();
    }
}