import numpy as np

class NumberOperations:
    @staticmethod
    def main():
        # Підготовка
        number_list = [
            np.int32(10), np.float64(20.5), np.int32(30), np.float64(40.7),
            np.int32(50), np.float64(60.3), np.int32(70), np.float64(80.1),
            np.int32(90), np.float64(100.9)
        ]

        # Завдання 1
        byte_num = np.int8(1)
        short_num = np.int16(27)
        int_num = np.int32(73)
        long_num = np.int64(123456789)
        float_num = np.float32(1.618)
        double_num = np.float64(24.593)

        # Завдання 2 і 3
        number_list.extend([byte_num, short_num, int_num, long_num, float_num, double_num])

        # Завдання 4
        print("Оригінальний масив:", number_list)

        # Завдання 5
        int_number_list = [int(round(num)) for num in number_list]
        print("Масив цілих чисел:", int_number_list)

        # Завдання 6
        print("Масив дробових чисел: [", end="")
        for num in number_list:
            print(f"{num:.2f}", end=" ")
        print("]")

        # Завдання 7
        int_list = [num for num in number_list if isinstance(num, np.int32)]
        byte_list = [num for num in number_list if isinstance(num, np.int8)]
        short_list = [num for num in number_list if isinstance(num, np.int16)]
        long_list = [num for num in number_list if isinstance(num, np.int64)]
        float_list = [num for num in number_list if isinstance(num, np.float32)]
        double_list = [num for num in number_list if isinstance(num, np.float64)]

        print("Масив Int:", int_list)
        print("Масив Byte:", byte_list)
        print("Масив Short:", short_list)
        print("Масив Long:", long_list)
        print("Масив Float:", float_list)
        print("Масив Double:", double_list)

        # Завдання по варіантам (8)
        sum_greater_than_50 = sum(num for num in number_list if num > 50)
        print("Сума чисел більших за 50:", sum_greater_than_50)

# Виклик функції main
if __name__ == '__main__':
    NumberOperations.main()