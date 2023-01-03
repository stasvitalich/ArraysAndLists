fun main() {

    var number = 5 // Создали обычную переменную
    val numbers = arrayOf(5, 6, 7, 8) // Создали массив
    numbers[2] = 125 // Переписали значение элемента с индексом 2
    val number7 = numbers[2] // Создали переменную и присвоили ей значение второго элемента в списке.
    println(number) // Распечатали обычную переменную
    println(numbers[2]) // Распечатали новый элемент из самого массива, который находится на позиции 2
    println(number7) // Второй метод распечатки, через переменную
    println(numbers.contentToString()) // Перевели содержание массива в строку и распечатали содержимое.
    println(numbers.size) // Распечатываю размер массива.
    println("") // Пустая строчка для разделения.

    val newArray = arrayOf(0, 1, 2, 3, 4, 5) // Создали новый массив.
    val reversedNewArray = newArray.reversedArray() // Создали новую переменную и перевернули массив,
                                                              // но старый массив остался неперезаписанным
    println(reversedNewArray.contentToString()) // Через приведение массива к строке распечатали его содержимое
    println(newArray.contentToString()) // Через приведение массива к строке распечатали его содержимое
    println("")

    var arrayForSort = arrayOf(5, 1, 3, 8, 88, 12, 0) // Создали новый массив
    println(arrayForSort.contentToString()) // Через приведение массива к строке распечатали его содержимое
    arrayForSort.sortedArray() // Отсортировали массив и сохранили оригинальный
    println(arrayForSort.contentToString()) // Через приведение массива к строке распечатали его содержимое
    println("") // Пустая строчка для разделения кода

    var numbersForList = listOf(5, 7, 8, 10) // Создали переменную для создания списка.
                                                      // Мы можем только считывать данные с такого списка,
                                                      // изменить данные не получится.
    println(numbersForList) // Вывели на печать созданный список.
    println("") // Пустая строчка для разделения кода

    var numbersForArrayList = arrayListOf(22, 15, 16 ,1, 3, 8) // Создаём array list,
    // откуда мы можем считывать данные, изменять их, как нам нужно.
    println(numbersForArrayList) // Выводим на печать наш array list.
    numbersForArrayList[2] = 999 // Перезаписываем значение дл второго элемента в списке.
    println(numbersForArrayList) // Выводим на печать обновлённый array list, чтобы убедиться,
    // что значение действительно перезаписалось.
    numbersForArrayList.add(77) // Добавляем новое значение в наш array list
    numbersForArrayList.add(0)  // Добавляем ещё одно новое значение в наш array list
    println(numbersForArrayList) // Выводим на печать обновлённый array list
    println(numbersForArrayList[numbersForArrayList.size - 1]) // Приём, позволяющий распечатать последний
    // элемент в массиве - определяем размер массива, отнимаем единицу, так как индексация массива начинается
    // с нуля. Таким образом получаем доступ к индексу последнего элемента в массиве. А в нашем случае -
    // это 0, т.к. мы добавили его вручную.
    numbersForArrayList.removeAt(5) // Метод позволяет удалить элемент по индексу.
                                          // Остальные элементы сдвинутся.
    println(numbersForArrayList) // Выводим на печать наш новый array list.

}