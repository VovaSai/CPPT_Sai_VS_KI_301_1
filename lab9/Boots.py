from Footwear import Footwear


class Boots(Footwear):
    """
    Клас Boots представляє взуття типу чоботи, додаючи спеціальні властивості та функції.
    """

    def __init__(self, brand, size, material, season, waterproof):
        """
        Ініціалізує об'єкт чобіт.

        :param brand: Бренд чобіт.
        :param size: Розмір чобіт.
        :param material: Матеріал виготовлення.
        :param season: Сезон використання.
        :param waterproof: Чи водостійкі чоботи.
        """
        super().__init__(brand, size, material)
        self.season = season
        self.waterproof = waterproof

    def check_waterproof(self):
        """
        Перевіряє, чи водостійкі чоботи.
        """
        if self.waterproof:
            print(f"Чоботи {self.brand} водостійкі.")
        else:
            print(f"Чоботи {self.brand} не водостійкі.")

    def repair_sole(self):
        """
        Виконує ремонт підошви, якщо чоботи зношені.
        """
        if self.condition < 50:
            self.condition += 30
            if self.condition > 100:
                self.condition = 100
            print(f"Підошва чобіт {self.brand} відремонтована. Стан: {self.condition}%.")
        else:
            print(f"Підошва чобіт {self.brand} ще у доброму стані. Ремонт не потрібен.")

    def get_status(self):
        """
        Отримує поточний стан чобіт, включаючи сезонність та водостійкість.

        :return: Строка зі статусом чобіт.
        """
        basic_status = super().get_status()
        waterproof_status = "водостійкі" if self.waterproof else "не водостійкі"
        return f"{basic_status}, сезон: {self.season}, водостійкість: {waterproof_status}"