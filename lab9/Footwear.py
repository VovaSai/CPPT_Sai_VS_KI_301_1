class Footwear:
    """
    Базовий клас Footwear представляє загальні властивості та методи для взуття.
    """

    def __init__(self, brand, size, material):
        """
        Ініціалізує об'єкт взуття.

        :param brand: Бренд взуття.
        :param size: Розмір взуття.
        :param material: Матеріал виготовлення.
        """
        self.brand = brand
        self.size = size
        self.material = material
        self.condition = 100  # Стан взуття у відсотках (100 - нове, 0 - зношене)
        self.is_clean = True

    def wear(self, wear_amount):
        """
        Зношує взуття.

        :param wear_amount: Відсоток зношення.
        """
        self.condition -= wear_amount
        if self.condition < 0:
            self.condition = 0
        print(f"Взуття {self.brand} зношене на {wear_amount}%. Стан: {self.condition}%.")

    def clean(self):
        """
        Чистить взуття.
        """
        self.is_clean = True
        print(f"Взуття {self.brand} очищено.")

    def get_status(self):
        """
        Отримує поточний стан взуття.

        :return: Строка зі статусом взуття.
        """
        clean_status = "чисте" if self.is_clean else "брудне"
        return f"Бренд: {self.brand}, розмір: {self.size}, матеріал: {self.material}, стан: {self.condition}%, статус: {clean_status}"